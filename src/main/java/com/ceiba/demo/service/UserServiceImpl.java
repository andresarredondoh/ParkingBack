package com.ceiba.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceiba.demo.dao.UserRepository;
import com.ceiba.demo.model.Registro;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	protected UserRepository userRepository;

	@Override
	public Registro save(Registro registro) {
		return this.userRepository.save(registro);
	}

	@Override
	public List<Registro> findAll() {
		return this.userRepository.findAll();
	}

	@Override
	public void deleteUser(Long id) {
		this.userRepository.deleteById(id);
		
	}
}
