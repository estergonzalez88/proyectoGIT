import java.util.Scanner;
public class Ejercicio6_UT21{
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		int nota;

		System.out.print("Introduce una nota entera entre 0 y 10: ");
		nota = teclado.nextInt();
		teclado.nextLine();
		
		switch(nota){
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("INSUFICIENTE");
				break;
			case 5:
				System.out.println("SUFICIENTE");
				break;
			case 6:
				System.out.println("BIEN");
				break;
			case 7:
			case 8:
				System.out.println("NOTABLE");
				break;
			case 9:
			case 10:
				System.out.println("SOBRESALIENTE");
				break;
			default:
				System.out.println("ERROR: NOTA INVÁLIDA");
		}
	}
}