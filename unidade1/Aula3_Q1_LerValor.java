package br.com.xico.aula2.exercicios;

import java.util.Scanner;

public class Aula3_Q1_LerValor {
	/*
	 * Ler um valor da entrada padr�o e escrever: � MAIOR QUE 10! se o valor
	 * lido for maior que 10 caso contr�rio escrever N�O � MAIOR QUE 10
	 */

	public static void main(String[] args) {
		Scanner entradaPadrao = new Scanner(System.in);
		int valorLido = entradaPadrao.nextInt();

		if (valorLido > 10)
			System.out.println("Maior que 10!");
		else
			System.out.println("Menor que 10!");

		entradaPadrao.close();
	}

}
