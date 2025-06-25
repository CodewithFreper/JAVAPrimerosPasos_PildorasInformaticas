package ejercicioRecopilatorio;

import java.util.Scanner;

public class ejercicioDoWhileScanner {
	public static void main(String[] args) {
		
		/*Programa que lanza un número random entre 1 y 100 y pide al usuario que lo acierte, 
		 * indicándole si es más alto o más bajo, y al acertar indica el número de intentos.*/
		
		Scanner lector = new Scanner(System.in);
		int intentoAcierto = 0; 
		int numeroDeIntentos = 0;
		int numeroSecreto = (int) (Math.random()*100) + 1; /*El +1 es para que si saliera 0, sea 1, 
															y que si saliera 99 sea 100, y cubrir el rango
															que nos piden de 1 a 100.*/
		
		System.out.println("Por favor, introduce un número del 1 al 100.");
		
		do {
			intentoAcierto = lector.nextInt();
			
			numeroDeIntentos++;
			
			if (intentoAcierto < numeroSecreto && numeroDeIntentos < 10) { System.out.println("Prueba con un número más alto."); }
			
			else if (intentoAcierto > numeroSecreto && numeroDeIntentos < 10) { System.out.println("Prueba con un número más bajo."); }
			
			
		} while(intentoAcierto!=numeroSecreto && numeroDeIntentos < 10);
		
		if (intentoAcierto==numeroSecreto) { System.out.println("¡¡¡Enhorabuena!!! \nLo has conseguido en " + numeroDeIntentos + (numeroDeIntentos > 1 ? " intentos.":" intento.")); }
		
		else if (numeroDeIntentos == 10) { System.out.println("Tronco, eres un negao. \nDedícate a otra cosa."); }
	}
}
