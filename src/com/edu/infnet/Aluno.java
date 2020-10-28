package com.edu.infnet;
// Definição da classe Aluno
public class Aluno {


	private int cpf;
	private float[] notas = new float[5];
	private String nome;
	
	public Aluno (String nome, int cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public float[] getNotas() {
		return notas;
	}
	public void setNotas(float[] notas) {
		this.notas = notas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}