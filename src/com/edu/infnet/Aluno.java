package com.edu.infnet;

// Defini��o da classe Aluno
public class Aluno {

	private String cpf;
	private Float[] notas = new Float[2];
	private String nome;

	public Aluno(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public void registrarNota(Float nota) {
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] == null) {
				this.notas[i] = nota;
				break;
			}

		}

	}

	public void calcularMedia() {
		int totalDeNotas = 2;
		Float nota1 = notas[0];
		Float nota2 = notas[1];
		Float media = (nota1+nota2)/totalDeNotas;
		String situacao = media>7? "Aprovado":"Reprovado";
		System.out.println("A m�dia do aluno " + this.nome + " �: "+ media + ". Portanto o aluno est�: " + situacao + ".");
		
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