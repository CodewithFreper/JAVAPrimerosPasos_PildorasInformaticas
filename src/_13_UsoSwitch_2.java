import java.util.Scanner;

public class _13_UsoSwitch_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor, introduce un día de la semana");
		
		String dia_semana = entrada.nextLine();
		
		//nueva sintaxis del Switch
		
		String resultado = switch(dia_semana) {
		
		case "Lunes" -> "Laborable";
		case "Martes" -> "Laborable";
		case "Miércoles" -> "Laborable";
		case "Jueves" -> "Laborable";
		case "Viernes" -> "Laborable";
		default -> "Festivo";
		};
		
		System.out.println("Hoy es: " + resultado + ".");

	}

}
