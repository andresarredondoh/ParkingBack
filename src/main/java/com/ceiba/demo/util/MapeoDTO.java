package com.ceiba.demo.util;


import com.ceiba.demo.dto.RegistroDTO;
import com.ceiba.demo.model.Registro;

public class MapeoDTO {

	public RegistroDTO convertirRegistroEntidad(Registro registro) {
		RegistroDTO registroDTO = new RegistroDTO();
		registroDTO.setId(registro.getId());
		registroDTO.setTipoVehiculo(registro.getTipoVehiculo());
		registroDTO.setCilindraje(registro.getCilindraje() != null ? registro.getCilindraje().toString() : "");
		registroDTO.setFechaIngreso(registro.getFechaIngreso());
		registroDTO.setPlaca(registro.getPlaca());
		return registroDTO;
	}
}
