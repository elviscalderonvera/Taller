package com.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Pais {
	@Id
	@GeneratedValue
	private int id;
	private String nomPais;
	
	@OneToMany(mappedBy = "pais")
	private List<Cliente> cliente= new ArrayList<Cliente>();
	public Pais() {
	}
	


	public Pais(String nomPais) {
		super();
		this.nomPais = nomPais;
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNomPais() {
		return nomPais;
	}


	public void setNomPais(String nomPais) {
		this.nomPais = nomPais;
	}



	public List<Cliente> getCliente() {
		return cliente;
	}



	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}
	
	


	
	
	

}
