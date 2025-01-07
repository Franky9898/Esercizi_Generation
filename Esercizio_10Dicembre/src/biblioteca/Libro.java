package biblioteca;

public class Libro
{
	int id;
	String titolo;
	String autore;
	String categoria;
	boolean disponibilita;

	public Libro(int id, String titolo, String autore, String categoria, boolean disponibilita)
	{
		this.id = id;
		this.titolo = titolo;
		this.autore = autore;
		this.categoria = categoria;
		this.disponibilita = disponibilita;
	}

	public void prestito(Libro libro) //Setta un libro a prestato
	{
		if (libro.disponibilita)
		{
			System.out.println("Ecco il libro");
			disponibilita = false;
		} else
		{
			System.out.println("Mi dispiace non è disponibile al momento");
		}
	}

	public void restituzione(Libro libro) //Un libro prestato torna disponibile
	{
		if (!libro.disponibilita)
		{
			System.out.println("Grazie per averlo riportato");
			disponibilita = true;
		} else
			System.out.println("Questo libro non deve essere ristituito, probabilmente non è nostro");
	}

	public static void printLibro(Libro libro) //Una stampa personalizzata
	{
		System.out.println("Libro: " + libro.titolo + " di " + libro.autore);
	}

}
