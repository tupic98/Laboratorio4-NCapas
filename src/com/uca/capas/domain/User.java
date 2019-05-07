package com.uca.capas.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class User {

	@Size(message="La longitud debe ser entre 4 y 10 caracteres", min=4,max=10)
	@NotEmpty(message="Este campo no puede ir vacío")
	private String name;
	
	private String username;
	
	@Size(message="La longitud debe ser entre 6 y 10 caracteres", min=6,max=10)
	@NotEmpty(message="Este campo no puede ir vacío")
	private String password;
	
	public User() {
	}
	
	public User(String name, String username, String password) {
		this.name = name;
		this.username = username;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
