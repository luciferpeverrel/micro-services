package com.example.demo.service;

import com.example.demo.model.Cars;

import java.util.List;

public interface CarsService {


    Cars saveCars(Cars cars);

    // Read operation
    List<Cars> getCars();
}
