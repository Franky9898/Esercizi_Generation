package bingo;

public class Main
{

	public static void main(String[] args)
	{
		Tabellone tabellone = new Tabellone();
		System.out.println(tabellone.numeri);
		Cartella cartella = new Cartella();
		boolean cinquina = false;
		boolean tombola = false;
		Cartella.stampaCartella(cartella);
		boolean soloUno = true; // Usato per stampare CINQUINA solo una volta
		int indiceEstrazione = 0;
		while (!(cinquina && tombola))
		{
			int estratto = Tabellone.estrazioneNumeri(tabellone, indiceEstrazione);
			Cartella.estratto(cartella, estratto);
			if (!cinquina) // Si controlla la cinquina fino a quando non si fa
			{
				cinquina = Cartella.cinquina(cartella);
			}
			if (cinquina && soloUno)
			{
				System.err.println("CINQUINA!");
				soloUno = false;
			}
			if (cinquina) // È inutile controllare se si è fatto tombola se non si è fatta la cinquina
			{
				tombola = Cartella.tombola(cartella);
				if (tombola)
					System.err.println("TOMBOLA!");
			}
			indiceEstrazione++;
		}
	}

}
