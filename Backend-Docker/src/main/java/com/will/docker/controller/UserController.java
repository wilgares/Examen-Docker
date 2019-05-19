package com.will.docker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.will.docker.entities.Usuario;
import com.will.docker.model.UsuarioModel;
import com.will.docker.services.UserService;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/users"})
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public Usuario create(@RequestBody Usuario user){
        return userService.create(user);
    }

    @GetMapping(path = {"/{id}"})
    public Usuario findOne(@PathVariable("id") int id){
        return userService.findById(id);
    }

    @PutMapping(path = {"/{id}"})
    public Usuario update(@PathVariable("id") int id, @RequestBody Usuario user){
        user.setId(id);
        return userService.update(user);
    }

    @DeleteMapping(path ={"/{id}"})
    public Usuario delete(@PathVariable("id") int id) {
        return userService.delete(id);
    }

    @GetMapping
    public List<UsuarioModel> findAll(){
        return userService.findAll();
    }
}
