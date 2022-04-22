package com.example.demo.controller;

import com.example.demo.model.Cars;
import com.example.demo.service.CarsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mechanic")
public class MechanicController {
    @Autowired
    private CarsService carsService;


    @GetMapping("/allCarss")
    public List<Cars> getAllCarss() {

        return carsService.getCars();
    }
}
