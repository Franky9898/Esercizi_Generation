package esercizio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Negozio
{
	public static void filtraProdottoCategoria(ArrayList<Prodotti> listaProdotto, String filtro)
	{
		ArrayList<Prodotti> prodottiFiltrati = new ArrayList<Prodotti>();
		for (int i = 0; i < listaProdotto.size(); i++)
		{
			if (filtro.equalsIgnoreCase(listaProdotto.get(i).categoria))
			{
				prodottiFiltrati.add(listaProdotto.get(i));
			}
		}
		if (!prodottiFiltrati.isEmpty())
		{
			for (Prodotti cercati : prodottiFiltrati)
			{
				System.out.println(cercati.nome);
			}
		} else
		{
			System.out.println("Prodotti non trovati");
		}
	}

	public static void aggiungiProdotto(ArrayList<Prodotti> listaProdotto)
	{
		Scanner input = new Scanner(System.in);
		//Prodotti(String nome, String categoria, double prezzo)
		System.out.println("Inserisci nome prodotto: ");
		String nome = input.next();
		System.out.println("Inserisci categoria prodotto: ");
		String categoria = input.next();
		double prezzo = -1;
		while (prezzo < 0)
		{
			System.out.println("Inserisci prezzo prodotto: ");
			prezzo = input.nextDouble();
		}
		Prodotti nuovoProdotto = new Prodotti(nome, categoria, prezzo);
		listaProdotto.add(nuovoProdotto);
		input.close();
	}
}
