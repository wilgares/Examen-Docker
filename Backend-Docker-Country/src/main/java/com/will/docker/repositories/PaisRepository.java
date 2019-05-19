package com.will.docker.repositories;

import org.springframework.data.repository.Repository;

import com.will.docker.entities.Pais;

public interface PaisRepository extends Repository<Pais, Integer> {

    Pais findOne(int id);

}
