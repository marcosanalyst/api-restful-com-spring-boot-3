package com.exemple.springboot.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.hateoas.RepresentationModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_PRODUTCTS")
public class ProductModel extends RepresentationModel<ProductModel> implements Serializable {
	
	private static final long serialVersionID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID idProduct;
	private String name;
	private BigDecimal value;
	
	public UUID getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(UUID idProduct) {
		this.idProduct = idProduct;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	
	
}
