
public class _03_OperadoresJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad=15; 
		
		System.out.println(edad); //Imprimirá 15 que es el valor con el cual hemos inicializado la variable.
		
		edad++;
		
		System.out.println(edad); //Imprimirá 16 porque arriba lo hemos incrementado en 1.
		
		edad--;
		
		System.out.println(edad); //Volverá a imprimir 15, porque le decrementa en 1 el valor almacenado en la variable.
		
		edad+=3; //Se podría poner edad=edad+3. 
		
		System.out.println(edad); //Imprimirá 18 porque a 15 que es el último valor almacenado sumamos 3.
		
		
		//Operador modulo o residuo %
		
		double num1=7;
		double num2=3;
		
		System.out.println(num1%num2);
		
		
		int num3=5; // Uno de los dos, dividendo o divisor ha de ser double para que guarde los decimales en resultado. 
		double num4=2;
		double resultado=num3/num4; 
		
		System.out.println(resultado);
		
		
		String nombre="Juan";
		
		System.out.println(nombre + " tiene " + edad + " años"); //El + ahí es concatenación, no suma porque hay un valor numérico y otro de texto.
		
		
	}

}
