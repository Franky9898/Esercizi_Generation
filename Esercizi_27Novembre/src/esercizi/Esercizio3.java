package esercizi;

import java.util.Scanner;

public class Esercizio3
{

	public static void main(String[] args)
	{
		//Esercizio 3: Chieda all'utente di inserire un array di 8 numeri interi. Calcoli la somma degli elementi che si trovano in posizione pari (indice 0, 2, 4, ecc.).
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci 8 numeri: ");
		int[] arrayUtente = new int[8]; //Inizializzo un array
		int somma = 0;
		for (int i = 0; i < arrayUtente.length; i++) //Ciclo per inserire numeri e calcolare somma
		{
			arrayUtente[i] = input.nextInt();
			switch (i % 2)
			{ //Somma solo se l'indice dell'array è pari
			case 0:
				somma += arrayUtente[i];
				break;
			}
		}
		System.out.println(somma);
		input.close();
	}
}
