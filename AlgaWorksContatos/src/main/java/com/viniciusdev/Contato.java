package com.viniciusdev;

public class Contato implements Comparable<Contato>{

	private String id;
	
	private String nome;
	
	private String telefone;
	
	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}

	@Override
	public int compareTo(Contato contato) {
		if(this.nome.compareTo(contato.getNome()) > 0) return -1;
		else if(this.nome.compareTo(contato.getNome()) < 0) return 1;
		return 0;
	}
}
