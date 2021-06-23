package com.example.jpa.controller;

import com.example.jpa.dto.LocalDateDto;
import com.example.jpa.repository.LocalDateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;

@RequestMapping
@RestController
public class LocalDateController {

    @Autowired
    private LocalDateRepository localDateRepository;

    @PostMapping
    LocalDateDto create() {
        LocalDateDto create = new LocalDateDto();
        return localDateRepository.save(create);
    }

    @PostMapping("/create")
    LocalDateDto create(@RequestBody Map<String, Object> param) {
        LocalDate createdDateAt = (LocalDate) param.get("createdDateAt");
        LocalDateTime createdTimeAt = (LocalDateTime) param.get("createdTimeAt");
        LocalDateDto create = new LocalDateDto(createdDateAt, createdTimeAt);
        return localDateRepository.save(create);
    }

}
