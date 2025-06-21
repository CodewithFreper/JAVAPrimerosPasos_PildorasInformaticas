
public class _06_UsoMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int raiz=(int)Math.sqrt(9); /*Al poner (int) delante del método forzamos a que nos devuelva un resultado
		int, esto se puede hacer si sabemos que no habrá pérdida de información, como en este caso que sabemos que será 
		3, pero si el resultado fuera decimal no se podría hacer ya que perderíamos información.*/
		
		System.out.println(raiz);
		
		
		double potencia=(int)Math.pow(5, 3);
		
		System.out.println(potencia);
		
		/* Dame un número aleatorio entre 0 y 100, Math.random da numeros aleatorios entre 0 y 1,
		 * es decir, decimales, para que sean entre 0 y 100 multiplicamos por 100 de este modo la 
		 * coma del decimal se corre a la derecha dos posiciones. Después de eso hacemos cast, 
		 * ponemos (int) delante del método, pero hay que englobar el método y la multiplicación por 100
		 * si solo afecta al método el método dará 0,57635666343 y devolverá 0, siempre devolverá 0 porque
		 * trunca la parte decimal. Por eso hay que aplicarlo al método multiplicado por 100, es decir 
		 * poner un paréntesis a todo.
		 */
		int aleatorio=(int)(Math.random()*100);
		
		System.out.println(aleatorio);

		
		//Otra opción: redondear. metodo Math.round, aquí no truncamos. Si es 3,4 nos dará 3. Si es 3,8 será 4.
		
		long aleatorio2=Math.round(Math.random()*100);
		
		System.out.println(aleatorio2);
		
		
		//abs
		
		int absoluto=Math.abs(-45);
		
		System.out.println(absoluto);
		
		
		//max
		
		int mayor=Math.max(8, 5);
		
		System.out.println(mayor);
	
		
	}

}
