package principal;

public class Interpretador {

	public Interpretador() {

	}
	
	public String toDecimal(String nom){
				
		String data = Integer.toString(Integer.parseInt(nom, 2), 10);		
		
		return data;
		
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
	
	

	public void translateAssembly(String result) {

		// ---------- separação do opCode ---------//

		String opCode = result.substring(0, 6);

		// ----------------------------------------//

		// -------- estruturação do tipo r -------//

		String rs, rt, rd, sh, fn,imm,L;

		// ---------------------------------------//

		// -------- estruturação do tipo j -------//

		String operand;

		// ---------------------------------------//

		// -------- estruturação do tipo j -------//

		String jumpAdrres;

		// ---------------------------------------//

		switch (result) {

		case "000000":

			// ADD ADDU AND ADD ADDU AND DIV DIVU JR MFHI MFLO MULT
			// MULTU NOR OR SLL SLLV SLT SRA SRAV SRL SRLV SUB SUBU
			// SYSCALL XOR

			fn = result.substring(26, 32);
			rs = result.substring(6, 11);
			rt = result.substring(11, 16);
			rd = result.substring(16, 21);
			sh = result.substring(21, 26);

			switch (fn) {

			case "100000":
				// ADD
				System.out.println("Add " +"$"+toDecimal(rd)+ ", $" +toDecimal(rs)+", $"+ toDecimal(rt) );

				break;

			case "100001":
				// ADDU
				System.out.println("Addu " +"$"+toDecimal(rd)+ ", $" +toDecimal(rs)+", $"+ toDecimal(rt) );

				break;

			case "100100":
				// AND
				System.out.println("And " +"$"+toDecimal(rd)+ ", $" +toDecimal(rs)+", $"+ toDecimal(rt) );
				break;

			case "001000":
				// JR
				System.out.println("Jr " +"$"+toDecimal(rs));
				break;

			case "010000":
				// MFHI
				System.out.println("Mfhi " +"$"+toDecimal(rd));
				break;

			case "010010":
				// MFLO
				System.out.println("Mflo " +"$"+ toDecimal(rd) );
				break;

			case "011000":
				// MULT
				System.out.println("Mult " +"$"+toDecimal(rs)+ ", $" +toDecimal(rt));
				break;

			case "011001":
				// MULTU
				System.out.println("Multu " +"$"+toDecimal(rs)+ ", $"+ toDecimal(rt) );
				break;

			case "100111":
				// NOR
				System.out.println("Nor " +"$"+toDecimal(rd)+ ", $" +toDecimal(rs)+", $"+ toDecimal(rt) );
				break;

			case "100101":
				// OR
				System.out.println("Or " +"$"+toDecimal(rd)+ ", $" +toDecimal(rs)+", $"+ toDecimal(rt) );
				break;

			case "000000":
				// SLL
				System.out.println("Sll " +"$"+toDecimal(rd)+ ", $" +toDecimal(rt)+", $"+ toDecimal(sh) );
				break;

			case "000100":
				// SLLV
				System.out.println("Sllv " +"$"+toDecimal(rd)+ ", $" +toDecimal(rt)+", $"+ toDecimal(rs) );
				break;

			case "101010":
				// SLT
				System.out.println("Slt " +"$"+toDecimal(rd)+ ", $" +toDecimal(rs)+", $"+ toDecimal(rt) );
				break;

			case "000011":
				// SRA
				System.out.println("Sra " +"$"+toDecimal(rd)+ ", $" +toDecimal(rt)+", $"+ toDecimal(sh) );
				break;

			case "000111":
				// SRAV
				System.out.println("Srav " +"$"+toDecimal(rd)+ ", $" +toDecimal(rt)+", $"+ toDecimal(rs) );
				break;

			case "000010":
				// SRL
				System.out.println("Srl " +"$"+toDecimal(rd)+ ", $" +toDecimal(rt)+", $"+ toDecimal(sh) );
				break;
			case "000110":
				// SRLV
				System.out.println("Srlv " +"$"+toDecimal(rd)+ ", $" +toDecimal(rt)+", $"+ toDecimal(rs) );
				break;

			case "100010":
				// SUB
				System.out.println("Sub " +"$"+toDecimal(rd)+ ", $" +toDecimal(rs)+", $"+ toDecimal(rt) );
				break;

			case "100011":
				// SUBU
				System.out.println("Sub " +"$"+toDecimal(rd)+ ", $" +toDecimal(rs)+", $"+ toDecimal(rt) );
				break;

			case "001100":
				// SYSCALL
				System.out.println("Syscall");
				break;

			case "100110":
				// XOR
				System.out.println("Xor " +"$"+toDecimal(rd)+ ", $" +toDecimal(rs)+", $"+ toDecimal(rt) );
				break;

			case "011011":
				// DIVU
				System.out.println("Divu "+ "$"+toDecimal(rs)+", $"+ toDecimal(rt) );
				break;

			case "011010":
				// DIV
				System.out.println("Div " +"$"+toDecimal(rs)+ ", $" +toDecimal(rt) );
				break;

			}

			break;

		case "000001":
			// BLTZ
			
			rs = result.substring(6, 11);
			imm= result.substring(16,32);
			System.out.println("Beq " + "$" + toDecimal(rs) + "," + toDecimal(imm));
			
			break;

		case "000010":
			// J
			
			imm= result.substring(6,32);
			System.out.println("J " + "$" + toDecimal(imm));


			break;

		case "000011":

			// JAL
			
			imm= result.substring(6,32);
			System.out.println("Jal " + "$" + toDecimal(imm));

			break;

		case "000100":

			// BEQ
			
			rs = result.substring(6, 11);
			rt = result.substring(11, 16);
			imm= result.substring(16,32);
			System.out.println("Beq " + "$" + toDecimal(rs) + ", $" + toDecimal(rt) + "," + toDecimal(imm));

			break;

		case "000101":

			// BNE
			
			rs = result.substring(6, 11);
			rt = result.substring(11, 16);
			imm= result.substring(16,32);
			System.out.println("Bne " + "$" + toDecimal(rs) + ", $" + toDecimal(rt) + "," + toDecimal(imm));


			break;

		case "001000":

			// ADDI
			rs = result.substring(6, 11);
			rt = result.substring(11, 16);
			imm= result.substring(16,32);
			System.out.println("Addi " + "$" + toDecimal(rs) + ", $" + toDecimal(rt) + "," + toDecimal(imm));

			break;

		case "001001":

			// ADDIU
			rs = result.substring(6, 11);
			rt = result.substring(11, 16);
			imm= result.substring(16,32);
			System.out.println("Addiu " + "$" + toDecimal(rs) + ", $" + toDecimal(rt) + "," + toDecimal(imm));

			break;

		case "001010":

			// SLTI
			
			rs = result.substring(6, 11);
			rt = result.substring(11, 16);
			imm= result.substring(16,32);
			System.out.println("Slti " + "$" + toDecimal(rs) + ", $" + toDecimal(rt) + "," + toDecimal(imm));

			break;

		case "001100":

			// ANDI
			rs = result.substring(6, 11);
			rt = result.substring(11, 16);
			imm= result.substring(16,32);
			System.out.println("Andi " + "$" + toDecimal(rs) + ", $" + toDecimal(rt) + "," + toDecimal(imm));

			break;

		case "001101":

			// ORI
			rs = result.substring(6, 11);
			rt = result.substring(11, 16);
			imm= result.substring(16,32);
			System.out.println("Ori " + "$" + toDecimal(rs) + ", $" + toDecimal(rt) + "," + toDecimal(imm));

			break;

		case "001110":

			// XORI
			rs = result.substring(6, 11);
			rt = result.substring(11, 16);
			imm= result.substring(16,32);
			System.out.println("Xori " + "$" + toDecimal(rs) + ", $" + toDecimal(rt) + "," + toDecimal(imm));

			break;

		case "001111":

			// LUI
			
			rt = result.substring(11, 16);
			imm= result.substring(16,32);
			System.out.println("Lui " + "$" + toDecimal(rt) + "," + toDecimal(imm));

			break;

		case "100000":

			// LB
			//o rs representa uma base não um registrador, mas de qualquer forma será um numero em decimal
			rs = result.substring(6, 11);
			rt = result.substring(11, 16);
			imm= result.substring(16,32);
			System.out.println("Lb " + "$" + toDecimal(rs) + "," + toDecimal(rt) + "," + toDecimal(imm) + "($"+ toDecimal(rs)+ ")");

			break;

		case "100011":

			// LW
			rs = result.substring(6, 11);
			rt = result.substring(11, 16);
			imm= result.substring(16,32);
			System.out.println("Lw  $" + toDecimal(rt) + "," + toDecimal(imm) + "($" +toDecimal(rs) +")");

			break;

		case "100010":

			// LBU
			rs = result.substring(6, 11);
			rt = result.substring(11, 16);
			imm= result.substring(16,32);
			System.out.println("lbu  $" + toDecimal(rt) + "," + toDecimal(imm) + "($" +toDecimal(rs) +")");

			break;

		case "101000":

			// SB
			rs = result.substring(6, 11);
			rt = result.substring(11, 16);
			imm= result.substring(16,32);
			System.out.println("Sb  $" + toDecimal(rt) + "," + toDecimal(imm) + "($" +toDecimal(rs) +")");


			break;

		case "101011":

			// SW
			rs = result.substring(6, 11);
			rt = result.substring(11, 16);
			imm= result.substring(16,32);
			System.out.println("Sw  $" + toDecimal(rt) + "," + toDecimal(imm) + "($" +toDecimal(rs) +")");

			
			break;

		}


	}

}
