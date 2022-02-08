package com.nttdata.SpringPatron;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

	@Bean(name="personaP")
	@Scope("prototype")
	public Persona personaP() {
		return new Persona("Antonio",23);
	}
	
	@Bean(name="personaS")
	@Scope("singleton")
	public Persona personaS() {
		return new Persona("Antonio",23);
	}
}
