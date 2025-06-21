import javax.swing.*;

public class _09_EntradaDatos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre, por favor:");
		
		/* int edad=JOptionPane.showInputDialog("Introduce tu edad, por favor."); 
		 * esta línea da fallo porque JOptionPane.showInputDialog devuelve un string y le estamos 
		 * diciendo que lo almacene en un int, temporalmente y para este programa podemos poner 
		 * que edad sea un string.*/
		
		String edad=JOptionPane.showInputDialog("Introduce tu edad, por favor:"); /*El problema
		es que si queremos utilizar ese input en alguna operaciín matemática no nos deja. Si sumamos concatenará.*/
		
		System.out.println("Te llamas " + nombre_usuario + " y tienes " + edad + " años."); 
		
		
		//Probamos con el método parseInt
		String nombre_usuario2=JOptionPane.showInputDialog("Introduce tu nombre, por favor:");
		
		int edad2=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad, por favor:"));
		
		double salario=Double.parseDouble(JOptionPane.showInputDialog("Introduce tu salario, por favor:"));
		
		System.out.println("Te llamas " + nombre_usuario2 + " y tienes " + edad2 + "años y tienes un salario de " + salario + "€.");
		System.out.println("Te llamas " + nombre_usuario2 + " y el año que viene tendrás " + (edad2+1) + "años.");
		
	}

}
