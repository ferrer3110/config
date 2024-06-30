package com.mx.jffa.configuration.resource;

import org.springframework.web.bind.annotation.GetMapping;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

public interface ConfigurationResource {

	@GetMapping(value = "/testConfig")
	@HystrixCommand(fallbackMethod = "metodoAlterno")
	public String example();

	public String metodoAlterno();
}
