package com.ceiba.demo.service;

import java.util.List;

import com.ceiba.demo.dto.RegistroDTO;
import com.ceiba.demo.model.Registro;

public interface RegistroService {

//	Guardar usuario
	Registro save(Registro registro) throws Exception;

//	Listar todos los usuarios
	List<Registro> findAll();

//  Eliminar Registro
	Integer deleteUser(Registro registro);

// Listar usuarioDTO
	List<RegistroDTO> listUsers();



}
