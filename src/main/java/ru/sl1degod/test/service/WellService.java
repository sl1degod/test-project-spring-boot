package ru.sl1degod.test.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.sl1degod.test.entity.Well;
import ru.sl1degod.test.repository.WellRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WellService  {

    private final WellRepository wellRepository;

    public List<Well> getWells() {
        return wellRepository.findAll();
    }

    public Well getWellById(Long id) {
        return wellRepository.findById(id).orElse(null);
    }

    public Well saveWell(Well well) {
        return wellRepository.save(well);
    }

    public Well updateWell(Well well) {
        return wellRepository.save(well);
    }

    public void deleteWellById(Long id) {
        wellRepository.deleteById(id);
    }
}
