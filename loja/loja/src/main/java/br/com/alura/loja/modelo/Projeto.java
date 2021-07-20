package br.com.alura.loja.modelo;

import com.thoughtworks.xstream.XStream;

public class Projeto {
	
	private String nome;
	private Long id;
	private int anoDeInicio;
	
	
	public Projeto() {
		
	}

	public Projeto( Long id, String nome, int anoDeInicio) {				
		this.nome = nome;
		this.id = id;
		this.anoDeInicio = anoDeInicio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public int getAnoDeInicio() {
		return anoDeInicio;
	}

	public String toXML() {
		return new XStream().toXML(this);
	}
	
	
	
	
}
