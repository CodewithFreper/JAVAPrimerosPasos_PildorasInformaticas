package ejercicioRecopilatorio;

import javax.swing.JOptionPane;

public class ejercicioRecopilatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeroSecreto = (int)(Math.random()*100);
		int intentoAcierto = 0; 
		int numeroDeIntentos = 0;
		
		System.out.println(numeroSecreto);
		
		intentoAcierto = Integer.parseInt(JOptionPane.showInputDialog("Di un número del 1 al 100.")); //Si no ponemos Integer.parseInt JOptionPane devuelve String.
		
			while (numeroSecreto != intentoAcierto) {
				
				if (numeroSecreto > intentoAcierto) {
				intentoAcierto = Integer.parseInt(JOptionPane.showInputDialog("Prueba con un número más alto."));
				}
				else if (numeroSecreto < intentoAcierto) { intentoAcierto = Integer.parseInt(JOptionPane.showInputDialog("Prueba con un número más bajo."));}
			
				numeroDeIntentos++;
			}
			
			if (numeroSecreto == intentoAcierto) JOptionPane.showMessageDialog(null, "Enhorabuena, has acertado!\n Lo has logrado en " + numeroDeIntentos + " intentos.");
			

	}

}
