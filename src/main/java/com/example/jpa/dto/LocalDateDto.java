package com.example.jpa.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "localdate")
public class LocalDateDto {
    @Id
    @GeneratedValue
    private Long id;
    private LocalDateTime createdTimeAt;
    private LocalDate createdDateAt;
    public LocalDateDto() {
        createdDateAt = LocalDate.now();
        createdTimeAt = LocalDateTime.now();
    }

    public LocalDateDto(LocalDate createdDateAt, LocalDateTime createdTimeAt) {
        this.createdDateAt = createdDateAt;
        this.createdTimeAt = createdTimeAt;
    }
}