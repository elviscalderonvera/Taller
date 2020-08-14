package com.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Cliente {
	@Id
	@GeneratedValue
	private int id;
	private String nomCliente;
	private String apPaterno;
	private String apMaterno;
	
	@OneToOne
	private Pais pais;
	public Cliente() {
		
	}
	
	

	public Cliente(String nomCliente, String apPaterno, String apMaterno) {
		super();
		this.nomCliente = nomCliente;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomCliente() {
		return nomCliente;
	}

	public void setNomCliente(String nomCliente) {
		this.nomCliente = nomCliente;
	}

	public String getApPaterno() {
		return apPaterno;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	public String getApMaterno() {
		return apMaterno;
	}

	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}



	public Pais getPais() {
		return pais;
	}



	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	
	


	
	
	

}
