package com.ceiba.demo.service;

import java.util.List;

import com.ceiba.demo.model.Registro;

public interface UserService {

//	Guardar usuario
	Registro save(Registro registro);

//	Listar todos los usuarios
	List<Registro> findAll();

//	Eliminar usuario por id
	void deleteUser(Long id);


}
