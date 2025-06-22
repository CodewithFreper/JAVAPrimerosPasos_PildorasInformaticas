import java.util.Scanner;

public class _10_CondicionalIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor, introduce tu edad");
		
		int edad = entrada.nextInt(); //declaramos e inicializamos la variable en la misma línea
		
		System.out.println("Tu edad es: " + edad + ".");
		System.out.println(" ");
		
		if (edad >= 18) { System.out.println("Eres mayor de edad, puedes votar."); }
		else { System.out.println("Todavía eres menor de edad, disfruta mientras puedas."); }
		
		System.out.println(" ");
		
		if (edad < 18) {System.out.println("Eres un pollino mojao.");}
		else if (edad < 30) {System.out.println("Todavía eres joven.");}
		else if (edad < 50) {System.out.println("Te conservas bien.");}
		else if (edad < 70) {System.out.println("Jubilao y a vivir.");}
		else {System.out.println("Quina vellea farem...");}
		
		entrada.close();
	}
		

}

