/**

 * JavaDoc
 * 
 *@Descripcion Realiza una tirada de cromos de FrikiWars con asignación de fuerza aleatoria (entre 1 y 100) 
y muéstralos en la pantalla ordenados según sus puntos. Por supuesto, debes crear el objeto Cromo. 
 * 
 * 
 *  Sort devuelve una cosa ordenada pero no la modifica 

 */
import java.util.Random;
public class Cromo {
	
	// Atributos de la clase 
	public static int poder;
	public int poderAleatorio []= new int[100];
public int poderIndex; // index Array 
public static int numeroAleatorio=0;
	
	public int getPoder() {
		 numeroAleatorio = (int) (Math.random() * 100) + 1;
		return this.poder;
		
	}
	 // Comparar ejemplo1
	public int compareTo(Cromo Cromo01 ) {
		if (this.poder < Cromo01.getPoder())
		return -1;
		
		else if ( this.poder > Cromo01.getPoder())
			return 1;
		else
			return 0;
	}
	public int compareTo2(Cromo Cromos01 ,Cromo Cromos02,Cromo Cromos03) {
		
		if ( this.poder < Cromos01.getPoder())
		
		return 0;
		return numeroAleatorio;
	}
	public static void main (String[]arg) {
		System.out.println(numeroAleatorio);
		System.out.println(poder);
	}



}
