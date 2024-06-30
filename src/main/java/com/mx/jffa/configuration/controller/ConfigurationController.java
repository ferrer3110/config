package com.mx.jffa.configuration.controller;

import org.springframework.web.bind.annotation.RestController;

import com.mx.jffa.configuration.resource.ConfigurationResource;

@RestController
public class ConfigurationController implements ConfigurationResource {

	@Override
	public String example() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String metodoAlterno() {
		return "Respuesta alternativa en caso de fallo";
	}

}
