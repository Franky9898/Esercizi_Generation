package EserciziPrimaSessione;

import java.util.Scanner;

public class Esercizi
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		// Esercizio 1 somma due numeri;
		System.out.println("Inserisci primo addendo: ");
		double numeroSomma1 = input.nextDouble();
		System.out.println("Inserisci secondo addendo: ");
		double numeroSomma2 = input.nextDouble();
		System.out.println("La somma dei due numeri inseriti è: " + (numeroSomma1 + numeroSomma2));

		// Esercizio 2 differenza due numeri
		System.out.println("Inserisci minuendo: ");
		double numeroDifferenza1 = input.nextDouble();
		System.out.println("Inserisci sottraendo: ");
		double numeroDifferenza2 = input.nextDouble();
		System.out.println("La differenza dei due numeri inseriti è: " + (numeroDifferenza1 - numeroDifferenza2));

		// Esercizio 3 prodotto due numeri
		System.out.println("Inserisci primo fattore: ");
		double numeroProdotto1 = input.nextDouble();
		System.out.println("Inserisci secondo fattore: ");
		double numeroProdotto2 = input.nextDouble();
		System.out.println("Il prodotto dei due numeri inseriti è: " + (numeroProdotto1 * numeroProdotto2));

		// Esercizio 4 rapporto due numeri
		System.out.println("Inserisci dividendo: ");
		double numeroDivisione1 = input.nextDouble();
		System.out.println("Inserisci divisore: ");
		double numeroDivisione2 = input.nextDouble();
		System.out.println("Il rapporto dei due numeri inseriti è: " + (numeroDivisione1 / numeroDivisione2));

		// Esercizio 5 area rettangolo
		System.out.println("Inserisci la lunghezza della base del rettangolo: ");
		double base = input.nextDouble();
		System.out.println("Inserisci la lunghezza dell'altezza del rettangolo: ");
		double altezza = input.nextDouble();
		System.out.println("L'area del rettangolo è: " + (base * altezza));

		// Esercizio 6 perimetro quadrato
		System.out.println("Inserisci la lunghezza del lato del quadrato: ");
		double lato = input.nextDouble();
		System.out.println("il perimetro del quadrato è: " + (4 * lato));

		// Esercizio 7 media tre numeri
		System.out.println("Inserisci primo numero: ");
		double numeroMedia1 = input.nextDouble();
		System.out.println("Inserisci secondo numero: ");
		double numeroMedia2 = input.nextDouble();
		System.out.println("Inserisci terzo numero: ");
		double numeroMedia3 = input.nextDouble();
		System.out.println("La media dei tre numeri inseriti è: " + ((numeroMedia1 + numeroMedia2 + numeroMedia3) / 3));

		// Esercizio 8 numero precedente e successivo
		System.out.println("Inserisci un numero intero: ");
		int numeroIntero = input.nextInt();
		System.out.print("Il numero precedente al numero inserito è: " + (numeroIntero - 1) + " ; il numero successivo al numero inserito è:" + (numeroIntero + 1));

		input.close();
	}
}
