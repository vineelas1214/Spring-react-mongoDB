package com.vineela.tutorials.repository;

import org.springframework.data.repository.CrudRepository;

import com.vineela.tutorials.model.Car;

public interface CarMongoRepository extends CrudRepository<Car, String>{}