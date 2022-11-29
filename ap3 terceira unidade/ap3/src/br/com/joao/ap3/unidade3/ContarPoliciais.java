package br.com.joao.ap3.unidade3;

import java.io.BufferedReader;
import java.io.FileReader;

public class ContarPoliciais {

	public static void main(String[] args) {
		try {
			FileReader arquivo = new FileReader("pessoas.csv");
			BufferedReader leitor = new BufferedReader(arquivo);
			
			int contar = 0; 
			while(leitor.ready()) {
				String linha = leitor.readLine();
				String[] coluna = linha.split(",");
				if(coluna[4].equalsIgnoreCase("policial"))
					contar++;
			}
			
			System.out.println("Exitem " + contar + " policiais na lista.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
