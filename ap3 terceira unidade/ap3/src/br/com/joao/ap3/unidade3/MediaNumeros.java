package br.com.joao.ap3.unidade3;

import java.io.BufferedReader;
import java.io.FileReader;

public class MediaNumeros {

	public static void main(String[] args) {
		try {
			FileReader arquivo = new FileReader("numerosAleatorios.txt");
			BufferedReader leitor = new BufferedReader(arquivo);
			
			int soma = 0;
			
			while(leitor.ready()) {
				soma += Integer.parseInt(leitor.readLine()); 
			}
			
			int media = soma/200;
			
			System.out.println("Média dos 200 numeros: " + media);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	

	}

}
