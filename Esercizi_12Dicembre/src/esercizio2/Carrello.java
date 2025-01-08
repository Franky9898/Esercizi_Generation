package esercizio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Carrello
{
	public static ArrayList<Prodotti> prodotticarrello;

	public static void aggiungiAlCarrello(ArrayList<Prodotti> listaProdotti)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Scegli nome prodotto: ");
		String nome = input.next();
		int c = 0;
		for (Prodotti prodotti : listaProdotti)
		{
			if (prodotti.nome.equalsIgnoreCase(nome))
				prodotticarrello.add(prodotti);
			else
				c++;
		}
		if (c == prodotticarrello.size())
			System.out.println("Prodotto non disponibile");
		input.close();
	}

	public static void totaleCarrello()
	{
		double totale = 0;
		for (Prodotti p : prodotticarrello)
		{
			totale += p.prezzo;
		}
		System.out.println("Totale nel carrello: " + totale);
	}
}
