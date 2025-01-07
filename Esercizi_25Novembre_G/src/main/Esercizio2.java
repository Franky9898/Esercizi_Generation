package main;

import java.util.Scanner;

public class Esercizio2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci una stringa e, seguito da un enter, un carattere da trovare: ");
		String stringaUtente = input.nextLine();
		char carattereDaTrovare = input.next().charAt(0);
		int posizioneCarattere = stringaUtente.indexOf(carattereDaTrovare);
		System.out.println("La posizione di " + carattereDaTrovare + " è " + (posizioneCarattere + 1));
		input.close();

	}
}
