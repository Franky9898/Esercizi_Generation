package mainpackage;

import java.util.Scanner;

public class HelloWorld
{
	public static void main(String[] args)
	{
		// float numVirgola = 5.73f;
		// int numInt = 5;
		// System.out.println(numInt);
		// System.out.println("Si");
		// System.out.println(numVirgola);

		// Scanner input = new Scanner(System.in); // Apertura scanner
		// System.out.print("Inserisci il tuo nome: ");
		// String nome = input.nextLine(); // Input su console: String necessaria
		// System.out.print("Inserisci la tua età: ");
		// int eta = input.nextInt(); // Input su console: numero intero necessario
		// System.out.print("Ciao, " + nome + "! Hai " + eta + " anni.");
		// input.close(); // Chiusura scanner

		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci tre numeri; inizia dal primo:");
		double primoNumero = input.nextDouble();
		System.out.println("Inserisci il secondo numero:");
		double secondoNumero = input.nextDouble();
		System.out.println("Inserisci il terzo numero");
		double terzoNumero = input.nextDouble();
		if (primoNumero >= secondoNumero && primoNumero >= terzoNumero)
		{ // Primo blocco effettua i controlli sul primo numero:
			if (primoNumero == secondoNumero)
			{ 						  // se è uguale al secondo, al terzo, se sono tutti uguali
				if (secondoNumero == terzoNumero)
				{ 					  // o se è maggiore unico.
					System.out.println("I numeri sono tutti uguali: " + primoNumero);
				} else
				{
					System.out.println("Il primo numero e il secondo numero sono uguali a " + primoNumero + " e sono i maggiori.");
				}
			} else if (primoNumero == terzoNumero)
			{
				System.out.println("Il primo numero e il terzo numero sono uguali a " + primoNumero + " e sono i maggiori.");
			} else
			{
				System.out.println("Il primo numero: " + primoNumero + " è il maggiore");
			}
		} else if (secondoNumero >= terzoNumero)
		{ // Il secondo blocco effettua i controlli sul secondo numero:
			if (secondoNumero == terzoNumero)
			{    // se è uguale al terzo o se è maggiore unico.
				System.out.println("Il secondo numero e il terzo sono uguali a: " + secondoNumero + " e sono i maggiori");
			} else
			{
				System.out.println("Il secondo numero: " + secondoNumero + " è il maggiore.");
			}
		} else
		{ // Il caso mancante è il terzo numero come maggiore unico.
			System.out.println("Il terzo numero: " + terzoNumero + " è il maggiore.");
		}
		input.close();
	}
}
