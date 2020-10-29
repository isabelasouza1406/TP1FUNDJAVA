package com.edu.infnet;
// Definição da classe Aluno
public class Aluno {


	private String cpf;
	private Float[] notas = new Float[5];
	private String nome;
	
	public Aluno (String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void registrarNota(Float nota) {
		for(int i=0; i<4; i++) {
			if (notas[i]== null) {
				this.notas[i]=nota;
			}
			
		}
		
		
	}
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Float[] getNotas() {
		return notas;
	}
	public void setNotas(Float[] notas) {
		this.notas = notas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}