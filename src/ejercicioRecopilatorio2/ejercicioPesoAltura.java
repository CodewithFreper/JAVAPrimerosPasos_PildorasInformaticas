package ejercicioRecopilatorio2;

import java.util.Scanner;

public class ejercicioPesoAltura {

	public static void main(String[] args) {
		/* Crea un programa que introduciendo el sexo y la altura devuelva el peso ideal. 
		H = altura - 110; M = altura - 120 */
		
		Scanner lector = new Scanner(System.in);
		String sexo;
		int altura;
		double peso;
		
		System.out.println("Por favor,introduce tu sexo (H/M):");
		sexo = lector.nextLine();
		
		System.out.println("Por favor, introduce tu altura en centímetros:");
		altura = lector.nextInt();
		
		if (sexo.equalsIgnoreCase("M")) {
			peso = altura - 120;
			System.out.println("Tu peso ideal sería: " + peso + " kgs.");
		}
		else if (sexo.equalsIgnoreCase("H")) {
			peso = altura - 110;
			System.out.println("Tu peso ideal sería: " + peso + " kgs.");
		}
		else {
			System.out.println("Por favor, introduce un valor correcto. (H/M)");
		}

	}
}
