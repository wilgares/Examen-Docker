package com.will.docker.services;

import java.util.List;

import com.will.docker.entities.Usuario;
import com.will.docker.model.UsuarioModel;

public interface UserService {

    Usuario create(Usuario user);

    Usuario delete(int id);

    List<UsuarioModel> findAll();

    Usuario findById(int id);

    Usuario update(Usuario user);
}
