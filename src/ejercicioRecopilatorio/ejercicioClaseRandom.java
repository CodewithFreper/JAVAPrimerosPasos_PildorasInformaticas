package ejercicioRecopilatorio;

import java.util.Random;

import javax.swing.JOptionPane;

public class ejercicioClaseRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random aleatorio = new Random();
		int numeroSecreto;
		
		numeroSecreto = aleatorio.nextInt(100) +1;
		System.out.println(numeroSecreto);

		int intentoAcierto;
		int numeroDeIntentos=0;
		
		intentoAcierto = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número del 1 al 100"));
		
		do {
			numeroDeIntentos++;
			if (numeroDeIntentos <10 ) {
				if (intentoAcierto < numeroSecreto) {
					intentoAcierto = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número más alto."));
				}
				else if (intentoAcierto > numeroSecreto) {
					intentoAcierto = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número más bajo."));
				}
			}
			else if (numeroDeIntentos >= 10) {JOptionPane.showMessageDialog(null, "Tronco, dedícate a otra cosa...");
			break;}//ponemos el break para salir del bucle do while
			
		} while (intentoAcierto!=numeroSecreto);
		
		if (intentoAcierto == numeroSecreto) {
			JOptionPane.showMessageDialog(null, "¡Enhorabuena!\nLo conseguiste en " + numeroDeIntentos + (numeroDeIntentos > 1 ? " intentos.":" intento."));
		}
	}
}
