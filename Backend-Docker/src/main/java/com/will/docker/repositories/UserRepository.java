package com.will.docker.repositories;

import org.springframework.data.repository.Repository;

import com.will.docker.entities.Usuario;

import java.util.List;

public interface UserRepository extends Repository<Usuario, Integer> {

    void delete(Usuario user);

    List<Usuario> findAll();

    Usuario findOne(int id);

    Usuario save(Usuario user);
}
