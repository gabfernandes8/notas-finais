package br.senai.sp.jandira;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int qtAlunos, linha = 0, coluna = 0;
		String resp;

		System.out.println("-----------------------------------");
		System.out.println("            NOTAS FINAIS           ");
		System.out.println("-----------------------------------");
		System.out.println("");

		System.out.print("Quantos alunos tem na turma? ");
		qtAlunos = teclado.nextInt();
		System.out.println("");

		String aluno[][] = new String[qtAlunos][2];
		double nota[][] = new double[qtAlunos][5];

		teclado.nextLine();
		System.out.print("Nome do aluno: ");
		aluno[linha][coluna] = teclado.nextLine();

		System.out.print("Nota do 1º bimestre: ");
		nota[linha][0] = teclado.nextDouble();
		System.out.print("Nota do 2º bimestre: ");
		nota[linha][1] = teclado.nextDouble();
		System.out.print("Nota do 3º bimestre: ");
		nota[linha][2] = teclado.nextDouble();
		System.out.print("Nota do 4º bimestre: ");
		nota[linha][3] = teclado.nextDouble();
		
		nota[linha][4] =  (nota[linha][0] + nota[linha][1] + nota [linha][2] + nota[linha][3]) / 4;
		
		if (nota[linha][4] >= 5) {
			aluno[linha][1] = "APROVADO";
		} else {
			aluno[linha][1] = "REPROVADO";
		}

		linha++;
		
		System.out.println("");

		System.out.println("Cadastrar outro aluno? (s/n)");
		resp = teclado.next();
		System.out.println("");

		while (resp.equals("s")) {

			teclado.nextLine();
			System.out.print("Nome do aluno: ");
			aluno[linha][coluna] = teclado.nextLine();

			System.out.print("Nota do 1º bimestre: ");
			nota[linha][0] = teclado.nextDouble();
			System.out.print("Nota do 2º bimestre: ");
			nota[linha][1] = teclado.nextDouble();
			System.out.print("Nota do 3º bimestre: ");
			nota[linha][2] = teclado.nextDouble();
			System.out.print("Nota do 4º bimestre: ");
			nota[linha][3] = teclado.nextDouble();
			
			nota[linha][4] =  (nota[linha][0] + nota[linha][1] + nota [linha][2] + nota[linha][3]) / 4;
			
			if (nota[linha][4] >= 5) {
				aluno[linha][1] = "APROVADO";
			} else {
				aluno[linha][1] = "REPROVADO";
			}
				
			linha++;
				
			System.out.println("");

			System.out.println("Cadastrar outro aluno? (s/n)");
			resp = teclado.next();
			System.out.println("");
		}

		System.out.println("-----------------------------------------------------------------");
		System.out.println("                     LISTA GERAL DA TURMA                        ");
		System.out.println("-----------------------------------------------------------------");
		System.out.printf("%-10s %7s %7s %7s %7s %7s %10s %n", "Nome", "Nota1", "Nota2", "Nota3", "Nota4", "Média",
				"Situação");
		System.out.println("-----------------------------------------------------------------");
		
		for (int i = 0; i < qtAlunos; i++) {
			System.out.printf("%-10s %6s %7s %7s %7s %7s %10s %n", aluno[i][coluna], nota[i][0], nota[i][1], nota [i][2], nota[i][3], nota[i][4], aluno[i][1]);

		}
	}


}


