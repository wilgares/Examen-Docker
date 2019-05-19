package com.will.docker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.will.docker.entities.Pais;
import com.will.docker.repositories.PaisRepository;

@Service
public class PaisServiceImpl implements PaisService {

    @Autowired
    private PaisRepository repository;

    public Pais findById(int id) {
        return repository.findOne(id);
    }

}
