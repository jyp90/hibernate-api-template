package com.example.jpa.controller;

import com.example.jpa.dto.LocalDateDto;
import com.example.jpa.repository.LocalDateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.Optional;

@RequestMapping
@RestController
public class LocalDateController {

    @Autowired
    private LocalDateRepository localDateRepository;

    @GetMapping("/{id}")
    ResponseEntity<LocalDateDto> read(@PathVariable long id) {
//        LocalDateDto dto = localDateRepository.getById(id);
        Optional<LocalDateDto> dto = localDateRepository.findById(id);
        return ResponseEntity.ok(dto.orElse(new LocalDateDto()));
    }

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
