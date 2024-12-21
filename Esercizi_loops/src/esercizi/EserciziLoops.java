package esercizi;

import java.util.Scanner;

public class EserciziLoops
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		//Esercizio 1: tabellina
		/*int numero = 0;
		while (numero <= 0)
		{
			System.out.println("Inserisci un numero intero positivo: ");
			numero = input.nextInt();
			if (numero > 0)
			{
				for (int i = 1; i < 11; i++)
					System.out.println(numero * i);
				//break;
			} else
				System.out.println("Il numero deve essere positivo...");
		
		} */

		//Esercizio 2: contare cifre numero intero
		int numeroUtente;
		int contatore = 0;
		System.out.println("Inserisci un numero intero: ");
		numeroUtente = input.nextInt();
		int quoziente = numeroUtente;
		while (quoziente != 0)
		{
			quoziente /= 10;
			contatore++;
		}
		if (contatore == 1)
			System.out.println("Il numero " + numeroUtente + " ha una cifra");
		else if (numeroUtente == 0)
			System.out.println("Il numero 0 ha una cifra");
		else
			System.out.println("Il numero " + numeroUtente + " ha " + (contatore) + " cifre");

		input.close();
	}
}
