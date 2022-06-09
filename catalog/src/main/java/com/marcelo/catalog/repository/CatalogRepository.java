package com.marcelo.catalog.repository;

import com.marcelo.catalog.entity.CatalogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogRepository extends JpaRepository<CatalogEntity, Long> {

    CatalogEntity findByName(String name);
}