package main;

import java.util.Scanner;

public class Esercizio3
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci una stringa: ");
		String stringaUtente = input.nextLine();
		String stringaSenzaA = stringaUtente.replace("a", "");
		String stringaSenzaAE = stringaSenzaA.replace("e", "");
		String stringaSenzaAEI = stringaSenzaAE.replace("i", "");
		String stringaSenzaAEIO = stringaSenzaAEI.replace("o", "");
		String stringaSenzaVocali = stringaSenzaAEIO.replace("u", "");
		System.out.println("La stringa senza vocali è: " + stringaSenzaVocali);

		input.close();
	}
}
