import java.util.Scanner;

public class _11_Condicional_OperadorTernario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor, introduce tu edad");
		
		int edad = entrada.nextInt();
		
		/* if(edad < 18) System.out.println("Eres menor de edad.");
		else System.out.println("Eres mayor de edad"); */
		
		//OPERADOR TERNARIO condición ? valor_si_verdad:valor_si_no_verdad
		
		/* Hay que crear una variable donde almacenar el valor, tanto si es verdad como si no.
		 * No se puede hacer un System.out.println en el operador ternario.
		 */
		
		String resultado = (edad < 18) ? "Eres menor de edad." : "Eres mayor de edad.";
		
		System.out.println(resultado);

	}

}
