package ru.sl1degod.test.service;

import lombok.RequiredArgsConstructor;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ru.sl1degod.test.entity.WaterCutLog;
import ru.sl1degod.test.exception.WaterLogNotFound;
import ru.sl1degod.test.repository.WaterLogRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WaterLogService {

    private final WaterLogRepository waterLogRepository;

    public List<WaterCutLog> getWaterLogs() {
        return waterLogRepository.findAll();
    }

    public WaterCutLog getWaterLogById(Long id) {
        return waterLogRepository.findById(id).orElse(null);
    }

    public WaterCutLog saveWaterLog(WaterCutLog waterLog) {
        return waterLogRepository.save(waterLog);
    }

    public WaterCutLog updateWaterLog(Long id, WaterCutLog waterLog) {
        LoggerFactory.getLogger(WaterLogService.class).info(waterLogRepository.findById(id).get().toString());
        return waterLogRepository.findById(id)
                .map(waterCutLog -> {
                    waterCutLog.setWlogDate(waterLog.getWlogDate());
                    waterCutLog.setWell_id(waterLog.getWell_id());
                    waterCutLog.setHanger_id(waterLog.getHanger_id());
                    waterCutLog.setWatered(waterLog.getWatered());
                    return waterLogRepository.save(waterCutLog);
                })
                .orElseThrow(() -> new WaterLogNotFound("Water Log Not Found"));

    }

    public void deleteWaterLogById(Long id) {
        waterLogRepository.deleteById(id);
    }

}
