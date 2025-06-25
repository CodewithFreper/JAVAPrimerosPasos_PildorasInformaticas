package ejercicioRecopilatorio;

import javax.swing.JOptionPane;

public class ejercicioWhileJOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Programa que lanza un número random entre 1 y 100 y pide al usuario que lo acierte, 
		 * indicándole si es más alto o más bajo, y al acertar indica el número de intentos.*/
		
		int numeroSecreto = (int)(Math.random()*100)+1;		/*Le sumamos 1 para que no de 0 nunca y que llegue a 100.
															* Si no le sumamos 1, puede dar 0,000589 si multiplicamos por 100
															* se quedaría 00,0589 y al pasarlo a int daría 0. Además, 
															* como el método random devuelve como máximo valores menores que 1.0, podría
															* dar 0,999999 que al multiplicarlo por 100 sería 99,99 y al pasarlo a int 
															* sería 99, nunca llegaría a dar 100. 
		 													*/
		
		int intentoAcierto = 0; 
		int numeroDeIntentos = 1; /*Como pongo la instrucción fuera del bucle para que no se repita cada vez que pruebo un número, 
									tengo que tener en cuenta que si acierta a la primera, acertaría con 1 intento, es decir,
									solo con empezar a jugar ya habría consumido 1 intento, por lo que incializo la variable a 1.
		 						*/
		
		System.out.println(numeroSecreto);
		
		intentoAcierto = Integer.parseInt(JOptionPane.showInputDialog("Di un número del 1 al 100.")); //Si no ponemos Integer.parseInt JOptionPane devuelve String.
		
			while (numeroSecreto != intentoAcierto) {
				
				numeroDeIntentos++; //Hay que ponerlo aquí para que nada más entrar sume 1, sino si lo aciertas a la primera no cuenta ningun intento. 
				
				if (numeroSecreto > intentoAcierto) {
				intentoAcierto = Integer.parseInt(JOptionPane.showInputDialog("Prueba con un número más alto."));
				}
				else if (numeroSecreto < intentoAcierto) { intentoAcierto = Integer.parseInt(JOptionPane.showInputDialog("Prueba con un número más bajo."));}
			
				//numeroDeIntentos++; Si pongo esto aquí y acierto a la primera no suma intentos, por eso hay que ponerlo al principio del bucle, para que nada más empezar sume 1 intento.
			}
			
			if (numeroSecreto == intentoAcierto) JOptionPane.showMessageDialog(null, "Enhorabuena, has acertado!\n Lo has logrado en " + numeroDeIntentos + (numeroDeIntentos > 1 ? " intentos" : " intento"));
			
	}

}
