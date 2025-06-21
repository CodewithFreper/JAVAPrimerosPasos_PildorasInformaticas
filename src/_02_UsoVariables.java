
public class _02_UsoVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			byte edad;
			
			edad=17;
			
			System.out.println(edad);
			
			//Si utilizamos la inferencia de tipos hay que inicializar en la misma línea
			
			var año=1989;
			
			System.out.println(año);
			
			año=2025; //Al finalizar el programa la variable año tiene un valor de 2025, aunque se haya impreso 1989.
			
			
			String nombre=""; //inicializa la variable para poder usarla pero sin ningún valor
			
			System.out.println(nombre);
	}

}
