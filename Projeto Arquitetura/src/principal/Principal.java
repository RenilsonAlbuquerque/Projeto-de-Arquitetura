package principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Principal {
	
	private static Interpretador interpretador = new Interpretador();

	private static ArrayList<String> instrucoes = new  ArrayList<String>();
	
	
	public static void main(String args[]){
		
		String a = interpretador.toBin("02114020");
		
		System.out.println(a);
		
		
		
	}
	
	
	
	private static void lerArquivo(){
		
		BufferedReader leitor = null;
		try {
			
			leitor = new BufferedReader( new FileReader("estrucoes.txt"));
			
			String linha = "";
			
			while((linha = leitor.readLine()) != null ){
				if(linha.length() > 0)
					instrucoes.add(linha);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		finally{
			try {
				leitor.close();
			}	
			catch (IOException e){
				e.printStackTrace();
			}
		}
	
	}

}
