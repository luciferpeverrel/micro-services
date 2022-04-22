package com.example.demo.service;

import com.example.demo.model.Cars;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "CAR-SERVICE")
public interface CarsService {
    @GetMapping("/get")
    public List<Cars> getCars();

}
