public class _07_ManipulacionCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre="Cristina";
		
		int longitud=nombre.length(); /*length no es static por lo que delante de length no se pone el 
										nombre del método,sino un objeto que pertenezca a la clase string, 
										en este caso nombre. Nombre es la variable que hemos creado y además 
										es un objeto que pertenece a la clase string.*/
		
		System.out.println(longitud);
		
		
		//
		
		
		String apellido="Fresneda";
		
		System.out.println(apellido.length()); /*En este caso no almacenamos el resuldao de .length en una variable
												si es un dato que se va a necesitar utilizar más adelante sí que 
												declararíamos una variable y lo almacenaríamos en la misma, pero si
												solo se quiere ver en consola de esto modo evitamos una línea de código.*/
		
		
		//método charAt
		
		System.out.println("La primera letra de mi nombre es " + nombre.charAt(0)); //Se empieza a contar desde 0.
		
		System.out.println("La última letra de mi nombre es " + nombre.charAt(nombre.length()-1)); /*Le restamos 1 
																				porque .charAt empieza a contar desde 0, 
																				pero .length cuenta cada letra desde 1.*/
		
		
		//substring
		
		String frase="Hoy es un estupendo día para aprender a programar en Java.";
		String subcadenaXY=frase.substring(4, 6); //desde qué posición hasta qué posición
		String subcadenaX=frase.substring(4); //desde qué posición hasta el final
		
		System.out.println(subcadenaXY);
		System.out.println(subcadenaX);
		
		//equals
		
		String alumno1="David";
		String alumno2="david";
		
		System.out.println(alumno1.equals(alumno2));
		System.out.println(alumno1.equalsIgnoreCase(alumno2) );
		
	}

}
