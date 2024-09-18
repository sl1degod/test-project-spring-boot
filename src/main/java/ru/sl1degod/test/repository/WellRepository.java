package ru.sl1degod.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sl1degod.test.entity.Well;

public interface WellRepository extends JpaRepository<Well, Long> {
}
