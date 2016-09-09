package principal;

public class Interpretador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public Interpretador(){
		
	}
	
	
	public String toBin(String parametro){
		
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
	
	

}
