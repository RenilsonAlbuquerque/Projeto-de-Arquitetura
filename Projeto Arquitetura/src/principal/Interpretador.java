package principal;

import java.util.ArrayList;

public class Interpretador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Interpretador() {

	}

	public String toBin(String parametro) {

		String resultado = Integer.toString(Integer.parseInt(parametro.toUpperCase(), 16), 2);
		System.out.println(resultado.length());

		if (resultado.length() < 32) {
			while (resultado.length() < 32) {
				resultado = "0" + resultado;
			}
		}
		System.out.println(resultado.length());

		return resultado;

	}

	public String teste(String result){
		
		//---------- separação do opCode ---------//
		
		String opCode = result.substring(0, 6);
		
		//----------------------------------------//
		
		
		//-------- estruturação do tipo r -------//
		
		String rs,rt,rd,sh,fn; 
		
		//---------------------------------------//
		
		//-------- estruturação do tipo j -------//
		
		String operand; 
				
		//---------------------------------------//
				
		//-------- estruturação do tipo j -------//
		
		String jumpAdrres; 
						
		//---------------------------------------//
		
		switch(result){

		case"000000":
			
			//ADD ADDU AND ADD ADDU AND DIV DIVU JR MFHI MFLO MULT
			//MULTU NOR	OR SLL SLLV	SLT	SRA	SRAV SRL SRLV SUB SUBU
			//SYSCALL XOR
			
			
			String funcao = result.substring(26, 32);
			
			switch(funcao){	
			
			case "100000":
				//ADD
				
				break;
				
			case "100001":
				//ADDU
				
				break;
				
			case "100100":
				//AND
								
				break;
				
			case "001000":
				//JR
				
				break;
				
			case "010000":
				//MFHI
				break;
				
			case "010010":
				//MFLO
				break;
				
			case "011000":
				//MULT
				break;
				
			case "011001":
				//MULTU
				break;
			
			case "100111":
				//NOR
				break;
				
			case "100101":
				//OR
				break;
				
			case "000000":
				//SLL
				break;
				
			case "000100":
				//SLLV
				break;
			
			case "101010":
				//SLT
				break;
				
			case "000011":
				//SRA
				break;
				
			case "000111":
				//SRAV
				break;
				
			case "000010":
				//SRL
				break;
			case "000110":
				//SRLV
				break;
				
			case "100010":
				//SUB
				break;
				
			case "100011":
				//SUBU
				break;
				
			case "001100":
				//SYSCALL
				break;
				
			case "100110":
				//XOR
				break;
				
			case "011011":
				//DIVU
				break;
				
			case "011010":
				//DIV
				break;
					
				
			}
			
			
			break;	
			
		case"000001":
			
			//BLTZ
		
			break;
		
		case"000010":
			
			//J
			
			break;
		
		case"000011":
			
			//JAL
			
			break;
		
		case"000100":
			
			//BEQ
			
			break;
			
		case"000101":
			
			//BNE
			
			break;
			
		case"001000":
			
			//ADDI
			
			break;
			
		case"001001":
			
			//ADDIU
			
			break;
			
		case"001010":
			
			//SLTI
			
			break;
		
		case"001100":
			
			//ANDI
			
			break;
			
		case"001101":
			
			//ORI
			
			break;
		
		case"001110":
			
			//XORI
			
			break;	
		
		case"001111":
			
			//LUI
			
			break;
			
		case"100000":
			
			//LB
	
			break;
		
		case"100011":
			
			//LW
	
			break;
		
		case"100010":
			
			//LBU
	
			break;
		
		case"101000":
			
			//SB
	
			break;
			
		case"101011":
			
			//SW
	
			break;
			
		}
		
		return opCode;
		
	}

}
