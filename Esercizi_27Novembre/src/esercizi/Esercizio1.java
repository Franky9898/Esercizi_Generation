package esercizi;

import java.util.Scanner;

public class Esercizio1
{
	public static void main(String[] args)
	{
		//Esercizio n.1: Inverti un array
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci 6 numeri: ");
		double[] arrayUtente = new double[6]; //Inizializzo un array
		for (int i = 0; i < arrayUtente.length; i++)
		{
			arrayUtente[(arrayUtente.length - 1) - i] = input.nextDouble(); //L'utente inserisce i numeri che andranno a posizionarsi nell'array nell'ordine inverso ((arrayUtente.length - 1) - i)
		}
		input.close();
		for (int i = 0; i < arrayUtente.length; i++) //Print
		{
			System.out.print(arrayUtente[i] + " ");
		}
	}
}
