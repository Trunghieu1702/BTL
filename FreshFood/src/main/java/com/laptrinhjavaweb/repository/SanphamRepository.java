package com.laptrinhjavaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.SanphamEntity;

public interface SanphamRepository extends JpaRepository<SanphamEntity, Integer> {
}

