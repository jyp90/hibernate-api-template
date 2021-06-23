package com.example.jpa.repository;

import com.example.jpa.dto.LocalDateDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalDateRepository extends JpaRepository<LocalDateDto, Long> {
}
