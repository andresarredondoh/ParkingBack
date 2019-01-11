package com.ceiba.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ceiba.demo.model.Registro;

public interface UserRepository extends JpaRepository<Registro, Long>{

	@SuppressWarnings("unchecked" )
	Registro save(Registro registro);

	
}
