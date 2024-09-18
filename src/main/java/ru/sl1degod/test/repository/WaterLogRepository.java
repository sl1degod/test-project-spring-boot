package ru.sl1degod.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sl1degod.test.entity.WaterCutLog;

public interface WaterLogRepository extends JpaRepository<WaterCutLog, Long> {
}
