package com.jpatutorial.springdatajpa.repository;

import com.jpatutorial.springdatajpa.entity.CourceMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourceMaterialRepository extends JpaRepository<CourceMaterial, Long> {
}
