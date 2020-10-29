package com.edu.infnet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		List<Aluno> classe2b = new ArrayList<Aluno>();

		boolean executando = true;
		while (executando) {
			Scanner sc = new Scanner(System.in);

			System.out.println("1 - Registrar as notas do aluno");
			System.out.println("2 - Consultar boletim do aluno");
			System.out.println("3 - Consultar notas da turma");
			System.out.println("4 - Sair");

			int opcaoSelecionada = sc.nextInt();

			switch (opcaoSelecionada) {
			case (1):
				// cadastrar aluno
				System.out.println("Informe um nome");
				System.out.println("Informe uma matricula");

				String nome = sc.next();
				String cpf = sc.next();
				Aluno novoAluno = new Aluno(nome, cpf);

				System.out.println("nota 1");
				Float nota1 = sc.nextFloat();
				novoAluno.registrarNota(nota1);

				System.out.println("nota 2");
				Float nota2 = sc.nextFloat();
				novoAluno.registrarNota(nota2);

				System.out.println("nota 3");
				Float nota3 = sc.nextFloat();
				novoAluno.registrarNota(nota3);

				System.out.println("nota 4");
				Float nota4 = sc.nextFloat();
				novoAluno.registrarNota(nota4);

				System.out.println("nota 5");
				Float nota5 = sc.nextFloat();
				novoAluno.registrarNota(nota5);

				classe2b.add(novoAluno);
				

				break;

			case (2):
				break;

			case (3):
				break;

			case (4):
				executando = false;
				break;

			}

		}
		for(Aluno aluno:classe2b) {
			System.out.println(aluno.getNome());
			
			Float notas [] = aluno.getNotas();
			for(int i = 0; i<4; i++) {
				System.out.println(notas[i]);
			}
		}

	}

}
