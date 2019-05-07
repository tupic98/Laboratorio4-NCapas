package com.uca.capas.domain;

import java.math.BigDecimal;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

public class Product {
	
	@NotNull(message="El campo nombre no puede ir vacío")
	@NotEmpty(message="El campo nombre no puede ir vacío")
	@Size(message="La longitud máxima es de 30 caracteres", max=30)
	private String name;
	
	@NotNull(message="El campo marca no puede ir vacío")
	@NotEmpty(message="El campo marca no puede ir vacío")
	@Size(message="La longitud máxima es de 30 caracteres", max=30)
	private String brand;
	
	@NotNull(message="El campo descripción no puede ir vacío")
	@NotEmpty(message="El campo descripción no puede ir vacío")
	@Size(message="La longitud máxima es de 30 caracteres", max=30)
	private String description;
	
	@NotNull(message="El campo categoría no puede ir vacío")
	@NotEmpty(message="El campo categoría no puede ir vacío")
	@Size(message="La longitud máxima es de 30 caracteres", max=30)
	private String category;
	
	@NotNull(message="El campo precio no puede ir vacío")
	@PositiveOrZero(message="El precio tiene que ser válido")
	private BigDecimal price;
	
	@NotNull(message="El campo fecha de vencimiento no puede ir vacío")
	@NotEmpty(message="El campo fecha de vencimiento no puede ir vacío")
	private String dueDate;
	
	public Product() {
	}
	
	public Product(String name, String brand, String description, String category, BigDecimal price, String dueDate) {
		this.name = name;
		this.brand = brand;
		this.description = description;
		this.category = category;
		this.price = price;
		this.dueDate = dueDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	
	
	
}
