package bingo;

public class Cartella
{
	int[][] numeriCartella = new int[3][5];
	boolean[][] usciti = new boolean[3][5];

	public Cartella()
	{
		this.numeriCartella = new int[3][5];
		this.usciti = new boolean[3][5];
		boolean[] numeriGenerati = new boolean[91]; // Serve a tenere traccia dei numeri già generati randomicamente, lo 0 non viene generato, quindi non importa
		for (int i = 0; i < numeriCartella.length; i++)
		{
			for (int j = 0; j < numeriCartella[i].length; j++)
			{
				int numero;
				do
				{
					numero = (int) (Math.random() * 90 + 1);
				} while (numeriGenerati[numero]); // Rigenera finché il numero non è unico
				numeriCartella[i][j] = numero;
				numeriGenerati[numero] = true; // Segna il numero come già usato
				usciti[i][j] = false;
			}
		}
	}

	public static void estratto(Cartella cartella, int numeroEstratto)
	{
		for (int i = 0; i < cartella.numeriCartella.length; i++)
		{
			for (int j = 0; j < cartella.numeriCartella[i].length; j++)
			{
				if (!cartella.usciti[i][j] && numeroEstratto == cartella.numeriCartella[i][j]) // Se il numero non è già uscito controlla se è presente nella cartella
				{
					cartella.usciti[i][j] = true; // Segna il numero come uscito
					System.out.println("Hai il numero.");
					return;
				}
			}
		}
		System.out.println("Non hai il numero.");
	}

	public static boolean cinquina(Cartella cartella)
	{
		for (int i = 0; i < cartella.numeriCartella.length; i++)
		{
			int c = 0;
			for (int j = 0; j < cartella.numeriCartella[i].length; j++)
			{
				if (cartella.usciti[i][j]) // Se il numero in una riga è uscito, aumenta il contatore
					c++;
			}
			if (c == 5)
			{
				return true; // 5 numeri in una riga sono usciti
			}
		}
		return false;
	}

	public static boolean tombola(Cartella cartella)
	{
		for (int i = 0; i < cartella.numeriCartella.length; i++)
		{
			for (int j = 0; j < cartella.numeriCartella[i].length; j++)
			{
				if (!cartella.usciti[i][j]) // Se non è uscito un numero, allora non è tombola
					return false;
			}
		}
		return true;
	}

	public static void stampaCartella(Cartella cartella)
	{
		for (int i = 0; i < cartella.numeriCartella.length; i++)
		{
			for (int j = 0; j < cartella.numeriCartella[i].length; j++)
			{
				System.out.print(cartella.numeriCartella[i][j] + " ");
			}
			System.out.println("");
		}

	}
}
