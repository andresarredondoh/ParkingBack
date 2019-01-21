package com.ceiba.demo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ceiba.demo.dao.RegistroRepository;
import com.ceiba.demo.service.RegistroServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	
	@InjectMocks
	RegistroServiceImpl registroServiceImpl;

	RegistroServiceImpl registroServiceImplSpy = Mockito.spy(RegistroServiceImpl.class);

	@Mock
	private RegistroRepository registroRepository;

	@Before
	public void before() {
		MockitoAnnotations.initMocks(this);
	}

	
	@Test
	public void save() {
	}
	
	@Test
	public void findAll() {
	}
	
	@Test
	public void deleteUser() {
	}
	
	@Test
	public void validator() {
	}
	
	@Test
	public void cantidadDeVehiculos() {
	}
	
	@Test
	public void dateValidator() {
	}
	
	@Test
	public void cobro() {
	}
	
	@Test
	public void totalAPagarMoto() {
	}
	
	@Test
	public void totalAPagarCarro() {
	}
	
	@Test
	public void listUsers() {
	}
	
	@Test
	public void placaRepetida() {
		
	}
	
	

}

