package com.agely.demo;

public class Pessoa {
	
	private String nome;
	private Integer idade;
	private Integer doses;
	private Boolean teveCovid;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Integer getDoses() {
		return doses;
	}
	public void setDoses(Integer doses) {
		this.doses = doses;
	}
	public Boolean getTeveCovid() {
		return teveCovid;
	}
	public void setTeveCovid(Boolean teveCovid) {
		this.teveCovid = teveCovid;
	}

	
}
