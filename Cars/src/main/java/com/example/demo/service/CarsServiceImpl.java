package com.example.demo.service;

import com.example.demo.model.Cars;
import com.example.demo.repository.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarsServiceImpl implements CarsService{

    @Autowired
    private CarsRepository carsRepository;


    // Save operation
    @Override
    public Cars saveCars(Cars cars) {
        return carsRepository.save(cars);
    }


    // Read operation
    @Override
    public List<Cars> getCars() {
        return (List<Cars>) carsRepository.findAll();
    }
}
