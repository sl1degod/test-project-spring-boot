package ru.sl1degod.test.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.sl1degod.test.entity.WaterCutLog;
import ru.sl1degod.test.entity.Well;
import ru.sl1degod.test.service.WellService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/well")
public class WellController {

    private final WellService wellService;

    @GetMapping
    public ResponseEntity<List<Well>> getWaterLogs() {
        return ResponseEntity.ok(wellService.getWells());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Well> getWaterLogById(@PathVariable Long id) {
        return ResponseEntity.ok(wellService.getWellById(id));
    }

    @PostMapping
    public ResponseEntity<Well> createWaterLog(@RequestBody Well well) {
        wellService.saveWell(well);
        return ResponseEntity.status(HttpStatus.CREATED).body(well);
    }

    @PutMapping
    public ResponseEntity<Well> updateWaterLog(@RequestBody Well well) {

        return ResponseEntity.ok(wellService.updateWell(well));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWaterLog(@RequestParam("id") Long id) {
        wellService.deleteWellById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
