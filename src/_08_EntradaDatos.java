import java.util.Scanner;

public class _08_EntradaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, por favor");
		
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("Introduce tu edad, por favor");
		
		int edad=entrada.nextInt();
		
		System.out.println("Hola " + nombre_usuario + ", tienes " + edad + " años.");
		
		
		//cambiamos el orden de las líneas, pedimos antes la edad y después el nombre
		
		System.out.println("Introduce tu edad, por favor");
		
		int edad2=entrada.nextInt(); /*.nextInt no almacena el salto de línea de después de introducir la edad,
		 								por lo que se queda pendiente (en el buffer) y continua el programa, 
		 								al llegar a .nextLine el escáner lee enseguida lo que pone el usuario,
		 								pero como está en buffer el salto de línea y esto se ejecuta en milisegundos
		 								no le da tiempo al usuario a escribir su nombre y el programa continua a
		 								la siguiente línea. Se podría corregir añadiendo un entrada.nextLine() después del 
		 								.nextInt para consumir ese salto de línea. Lo vemos más abajo*/
		
		System.out.println("Introduce tu nombre, por favor");
		
		String nombre_usuario2=entrada.nextLine();
		
		System.out.println("Hola " + nombre_usuario2 + ", tienes " + edad2 + " años.");
		
		//Probamos añadiendo nextLine
		
		System.out.println("Introduce tu edad, por favor");
		
		int edad3=entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Introduce tu nombre, por favor");
		
		String nombre_usuario3=entrada.nextLine();
		
		System.out.println("Hola " + nombre_usuario3 + ", tienes " + edad3 + " años.");
		
		
		entrada.close();

	}

}
