package biblioteca;

import java.util.ArrayList;

public class Biblioteca
{
	ArrayList<Libro> elenco; //Rappresenta il catalogo libri

	public Biblioteca(ArrayList<Libro> elenco)
	{
		this.elenco = elenco;
	}

	public void aggiungereLibro(ArrayList<Libro> elenco, Libro libro)
	{
		elenco.add(libro);
	}

	public static void libriDisponibili(ArrayList<Libro> elenco) //Crea un'arrayList con solo i libri disponibili (in base a libro.disponibilita)
	{
		ArrayList<Libro> elencoDisponibili = new ArrayList<Libro>();
		for (int i = 0; i < elenco.size(); i++)
		{
			if (elenco.get(i).disponibilita)
				elencoDisponibili.add(elenco.get(i));
		}
		System.out.println("Libri disponibili: ");
		for (int i = 0; i < elencoDisponibili.size(); i++)
		{
			Libro.printLibro(elencoDisponibili.get(i));
		}
	}

	public static void libriPrestati(ArrayList<Libro> elenco) //Crea un'arrayList con solo i libri prestati
	{
		ArrayList<Libro> elencoPrestati = new ArrayList<Libro>();
		for (int i = 0; i < elenco.size(); i++)
		{
			if (!elenco.get(i).disponibilita)
				elencoPrestati.add(elenco.get(i));
		}
		System.out.println("Libri prestati: ");
		for (int i = 0; i < elencoPrestati.size(); i++)
		{
			Libro.printLibro(elencoPrestati.get(i));
		}
	}
}
