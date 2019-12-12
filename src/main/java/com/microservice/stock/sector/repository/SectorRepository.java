package com.microservice.stock.sector.repository;

import com.microservice.stock.sector.entity.SectorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectorRepository extends JpaRepository<SectorEntity, Long> {
}
