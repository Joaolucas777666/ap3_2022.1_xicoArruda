package br.com.joao.ap3.unidade3;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;

public class GerarNumeros {

	public static void main(String[] args) {
		FileWriter arquivo = null;
		PrintWriter printer = null;
		
		String numeros = "";
		
		for(int i = 0; i < 200; i++) {
			numeros += (int)(Math.random() * (9999 - 1)) + "\n";
		}

		try {
			arquivo = new FileWriter("numerosAleatorios.txt", false);
			printer = new PrintWriter(arquivo);
			printer.print(numeros);
			printer.flush();
			arquivo.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
