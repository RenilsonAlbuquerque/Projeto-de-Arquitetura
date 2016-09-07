package principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Principal {

	private static ArrayList<String> instrucoes = new  ArrayList<String>();
	
	public static void main(String args[]){
		
		System.out.println(toBin("02114020"));
	}
	
	public static String toBin(String parametro){
		
		String resultado = Integer.toString(Integer.parseInt(parametro.toUpperCase(), 16), 2);
		System.out.println(resultado.length());
		
		if(resultado.length() < 32)
		{
			while(resultado.length() < 32){
				resultado = "0" + resultado;
			}
		}
		System.out.println(resultado.length());
		
		return resultado;
	
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
