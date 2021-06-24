package com.example.jpa.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "localdate")
public class LocalDateDto implements Serializable {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreatedTimeAt() {
        return createdTimeAt;
    }

    public void setCreatedTimeAt(LocalDateTime createdTimeAt) {
        this.createdTimeAt = createdTimeAt;
    }

    public LocalDate getCreatedDateAt() {
        return createdDateAt;
    }

    public void setCreatedDateAt(LocalDate createdDateAt) {
        this.createdDateAt = createdDateAt;
    }

    public LocalDateDto(Long id, LocalDateTime createdTimeAt, LocalDate createdDateAt) {
        this.id = id;
        this.createdTimeAt = createdTimeAt;
        this.createdDateAt = createdDateAt;
    }
}