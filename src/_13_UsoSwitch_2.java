import java.util.Scanner;

public class _13_UsoSwitch_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor, introduce un día de la semana");
		
		String diaSemana = entrada.nextLine();
		
		//nueva sintaxis del Switch
		
		String resultado = switch(diaSemana) {
		
		case "Lunes" -> "Laborable";
		case "Martes" -> "Laborable";
		case "Miércoles" -> "Laborable";  //Se pueden poner cada case en una lína o agrupar con comas
		case "Jueves" -> "Laborable";
		case "Viernes" -> "Laborable";
		case "Sábado" , "Domingo"-> "Festivo";  //Aquí los agrupamos con comas ya que devuelven el mismo resultado.
		default -> {
				System.out.println("Procesando...");
				yield "Día no válido. Revisa la ortografía."; /*yield lo que hace es 
																devolver el valor a la 
																variable resultado*/
			}
		};
		
		System.out.println("Hoy es: " + resultado + ".");

		entrada.close();
	}

}
