package br.com.teste.robo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Log {
	String textoLog = "";
	private static final String LOCAL_FILE = "C:\\Users\\cesmac\\workspace\\robo\\log.txt";
	
	public static void gerarLog(int passos, String direcao) throws IOException{
		String novaLinha = System.getProperty("line.separator");
		String movimentoLog = "   --------     MOVIMENTO: "+ passos+" PARA "+ direcao +"     --------     "+novaLinha;
		FileWriter arq = new FileWriter(LOCAL_FILE, true);
	    PrintWriter gravarArq = new PrintWriter(arq);

	    gravarArq.printf(movimentoLog);
	 
	    arq.close();
	 
	  }
	
	public static void limparLog(){
		try {
			FileWriter arq = new FileWriter(LOCAL_FILE);
		    PrintWriter gravarArq = new PrintWriter(arq);
		    gravarArq.print("");
		    arq.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
	