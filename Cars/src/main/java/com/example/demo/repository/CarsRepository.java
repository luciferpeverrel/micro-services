package com.example.demo.repository;

import com.example.demo.model.Cars;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarsRepository extends CrudRepository<Cars, Integer> {
}