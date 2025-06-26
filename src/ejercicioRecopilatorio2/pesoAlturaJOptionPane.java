package ejercicioRecopilatorio2;

import javax.swing.JOptionPane;

public class pesoAlturaJOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String genero;
		int altura=0;
		double pesoM;
		double pesoH; 
		
		do {
			genero = JOptionPane.showInputDialog("Por favor, introduce tu género (H/M)");
			} while ( (!genero.equalsIgnoreCase("M")) && (!genero.equalsIgnoreCase("H")) );
		
		altura = Integer.parseInt(JOptionPane.showInputDialog("Por favor, introduce tu altura en centímetros"));
		pesoM = altura - 120;
		pesoH = altura - 110; 
		if (genero.equalsIgnoreCase("M")) {
			JOptionPane.showMessageDialog(null, "Para una mujer que mide " + altura + "cms, el peso ideal es " + pesoM + " kgs.");
			}
			
			else {
				JOptionPane.showMessageDialog(null, "Para un hombre que mide " + altura + " cms, el peso ideal es " + pesoH + " kgs.");
				};
			}
		
	}

