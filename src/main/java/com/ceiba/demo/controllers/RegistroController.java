package com.ceiba.demo.controllers;

import java.time.LocalDateTime;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.demo.dto.RegistroDTO;
import com.ceiba.demo.model.Registro;
import com.ceiba.demo.service.RegistroService;
import com.ceiba.demo.util.RestResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin
@RestController
public class RegistroController {

	@Autowired
	protected RegistroService registroService;
	
	protected ObjectMapper mapper;
	
	@RequestMapping(value= "/saveOrUpdate", method = RequestMethod.POST)
	public RestResponse saveOrUpdate(@RequestBody Registro registro) throws Exception {
		registro.setFechaIngreso(LocalDateTime.now());
		if(registro.getId()==null) {
			registro.setEstado(true);
		}
			registro.setPlaca(registro.getPlaca().toUpperCase());
			this.registroService.save(registro);
		
		return new RestResponse(HttpStatus.OK.value(), "Operacion exitosa");
	}
	
	@GetMapping("/getUsers")
	public List<RegistroDTO> obtenerUsuarios(){
		return this.registroService.listUsers();
	}
	
	@RequestMapping(value= "/deleteUser", method = RequestMethod.POST)
	public Integer deleteUser(@RequestBody Registro registro) {
		return this.registroService.deleteUser(registro);
	}
	
	
	
}
