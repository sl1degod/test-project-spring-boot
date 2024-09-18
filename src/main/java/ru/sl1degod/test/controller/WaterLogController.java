package ru.sl1degod.test.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.sl1degod.test.api.response.WaterCutLogResponse;
import ru.sl1degod.test.entity.WaterCutLog;
import ru.sl1degod.test.service.WaterLogService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/waterlog")
public class WaterLogController {

    private final WaterLogService waterLogService;

    @GetMapping
    public ResponseEntity<List<WaterCutLog>> getWaterLogs() {
        return ResponseEntity.ok(waterLogService.getWaterLogs());
    }

    @GetMapping("/{id}")
    public ResponseEntity<WaterCutLog> getWaterLogById(@PathVariable Long id) {
        return ResponseEntity.ok(waterLogService.getWaterLogById(id));
    }

    @PostMapping
    public ResponseEntity<WaterCutLog> createWaterLog(@RequestBody WaterCutLog waterLog) {
        waterLogService.saveWaterLog(waterLog);
        return ResponseEntity.status(HttpStatus.CREATED).body(waterLog);
    }

    @PutMapping("/{id}")
    public ResponseEntity<WaterCutLog> updateWaterLog(@PathVariable Long id, @RequestBody WaterCutLogResponse waterCutLogResponse) {
        return ResponseEntity.ok(waterLogService.updateWaterLog(id, waterCutLogResponse));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWaterLog(@PathVariable("id") Long id) {
        waterLogService.deleteWaterLogById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
