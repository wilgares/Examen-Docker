package com.will.docker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.will.docker.entities.Usuario;
import com.will.docker.model.Pais;
import com.will.docker.model.UsuarioModel;
import com.will.docker.repositories.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private RestTemplate myRestTemplate;

    @Value("${myrest.url}")
    private String restUrl;
    
    
    @Override
    public Usuario create(Usuario user) {
        return repository.save(user);
    }

    @Override
    public Usuario delete(int id) {
        Usuario user = findById(id);
        if(user != null){
            repository.delete(user);
        }
        return user;
    }

    @Override
    public List<UsuarioModel> findAll() {
    	List<UsuarioModel> listaUsuariosModel = new ArrayList<>();
    	List<Usuario> usuarios = repository.findAll();
    	Pais pais = myRestTemplate.getForObject(restUrl, Pais.class);
    	for (Usuario usuario : usuarios) {
    		UsuarioModel usuarioModel = new UsuarioModel();
    		usuarioModel.setEmail(usuario.getEmail());
    		usuarioModel.setFirstName(usuario.getEmail());
    		usuarioModel.setLastName(usuario.getLastName());
    		usuarioModel.setId(usuario.getId());
    		usuarioModel.setPais(pais.getDescripcion());
    		
    		listaUsuariosModel.add(usuarioModel);
		}
        return listaUsuariosModel;
//        return repository.findAll();
    }

    @Override
    public Usuario findById(int id) {
        return repository.findOne(id);
    }

    @Override
    public Usuario update(Usuario user) {
        return repository.save(user);
    }
}
