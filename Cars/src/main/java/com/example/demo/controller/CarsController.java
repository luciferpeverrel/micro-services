package com.example.demo.controller;

import com.example.demo.model.Cars;
import com.example.demo.service.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CarsController {
    @Autowired
    private CarsService carsService;

    //save operation
    @PostMapping("/add")
    public Cars saveCars(@Valid @RequestBody Cars cars){
        return  carsService.saveCars(cars);

    }

    //read operation
    @GetMapping("/get")
    public List<Cars> getCars(){
        return  carsService.getCars();
    }

}
