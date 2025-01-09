package main;

import java.util.Scanner;

public class Esercizio1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		//System.out.println("Inserisci una stringa: ");
		//String stringaUtente = input.nextLine();
		//System.out.println("Inserisci un carattere da sostituire: ");
		//char carattereDaSostituire = input.next().charAt(0);
		//System.out.println("Inserisci un carattere con cui sostituirlo: ");
		//char carattereCheSostituisce = input.next().charAt(0);
		//String stringaConSostituzione = stringaUtente.replace(carattereDaSostituire, carattereCheSostituisce);
		//System.out.println("La nuova stringa è: " + stringaConSostituzione);
		int numero = 0;

		while (numero != 4 && numero != 1)
		{
			numero = input.nextInt();
			switch (numero)
			{
			case 1:
				System.out.println("su 1");
				// Controllo Giostre
				break;
			case 4:
				System.out.println("su 4");
				break;
			default:
				System.out.println("Input");
				break;
			}
		}

		//while (numero < 5)
		//{
		//	numero = input.nextInt();
		//	if (numero == 1)
		//	{
		//		System.out.println("su 1");
		//		break;
		//	} else if (numero == 2)
		//	{
		//		System.out.println("su 2");
		//		break;
		//	} else
		//		System.out.println("BO");
		//}

		input.close();

	}
}
