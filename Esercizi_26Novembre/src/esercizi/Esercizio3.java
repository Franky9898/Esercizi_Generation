package esercizi;

public class Esercizio3
{
	public static void main(String[] args)
	{
		//Trova gli elementi duplicati in un array

		boolean arrayNullo = true;
		//int[] numeri = { 1, 2 };
		int[] numeri = { 1, 1, -2, -2, 7, 8, 8, 8, 8, 1, 10, 10, 1, 17 };
		boolean[] valoreIncontrato = new boolean[numeri.length]; //Serve per capire se un valore sia stato già trovato o meno
		int[] risultato = new int[numeri.length]; //Per conservare i duplicati
		int[] zero = new int[numeri.length];
		for (int i = 0; i < numeri.length; i++) //Ciclo che parte dal primo elemento dell'array
		{
			for (int j = i + 1; j < numeri.length; j++) //Parte da i+1 per evitare di paragonare l'elemento stesso
			{
				if (numeri[i] == numeri[j] && valoreIncontrato[j] == false)
				{
					risultato[i] = numeri[j];
					valoreIncontrato[j] = true;
				}
			}

		}

		for (int k = 0; k < risultato.length; k++)
		{
			if (risultato[k] != zero[k]) //Controlla se l'array risultato è vuoto 
			{
				arrayNullo = false;
				break;
			}
		}
		if (!arrayNullo)
		{
			System.out.print("I duplicati sono: ");
			for (int i = 0; i < risultato.length; i++)
			{
				if (risultato[i] != 0)
					System.out.print(risultato[i] + " ");
			}
		} else //Se vuoto stampa che non ci sono duplicati
		{
			System.out.println("Non ci sono duplicati.");
		}
	}
}
