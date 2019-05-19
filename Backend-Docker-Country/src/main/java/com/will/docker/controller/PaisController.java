package com.will.docker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.will.docker.entities.Pais;
import com.will.docker.services.PaisService;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/pais"})
public class PaisController {

    @Autowired
    private PaisService paisService;

    @GetMapping(path = {"/{id}"})
    public Pais findOne(@PathVariable("id") int id){
        return paisService.findById(id);
    }

}
