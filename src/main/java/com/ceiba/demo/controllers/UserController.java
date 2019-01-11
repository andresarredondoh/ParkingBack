package com.ceiba.demo.controllers;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.demo.model.Registro;
import com.ceiba.demo.service.UserService;
import com.ceiba.demo.util.RestResponse;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin
@RestController
public class UserController {

	@Autowired
	protected UserService userService;
	
	protected ObjectMapper mapper;
	
	@RequestMapping(value= "/saveOrUpdate", method = RequestMethod.POST)
	public RestResponse saveOrUpdate(@RequestBody String userJson) throws JsonParseException, JsonMappingException, IOException {
		this.mapper = new ObjectMapper();
		Registro registro = this.mapper.readValue(userJson, Registro.class);
		registro.setIngreso(new Date());
		if(registro.getId()==null) {
			registro.setEstado(true);
		}
		if(!this.validator(registro)) {
			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(), "");
		}
		
		
		this.userService.save(registro);
		return new RestResponse(HttpStatus.OK.value(), "Operacion exitosa");
	}
	
	@RequestMapping(value= "/getUsers", method = RequestMethod.GET)
	public List<Registro> getUsers() {
		return this.userService.findAll();
	}
	
	@RequestMapping(value= "/deleteUserById", method = RequestMethod.GET)
	public void deleteUserById(@RequestParam Long id)  {
		this.userService.deleteUser(id);
	}
	
	private boolean validator(Registro registro) {
		boolean isValid=true;
		if(registro.getTipoVehiculo()==null || registro.getTipoVehiculo()=="")  {
			isValid=false;
		}
		if(registro.getPlaca() == null || registro.getPlaca() == "") {
			isValid=false;
		}
		if(registro.getIngreso() == null) {
			isValid=false;
		}
		return isValid;
	}
	
}
