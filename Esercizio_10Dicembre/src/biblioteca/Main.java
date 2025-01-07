package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	public static void gestioneBiblioteca(Biblioteca biblioteca) //Gestisce la biblioteca in base a input utente
	{
		int scelta = -1;
		int conferma = 1;
		Scanner input = new Scanner(System.in);

		while (conferma == 1)
		{
			switch (scelta)
			{
			case 1: //Aggiungi libro
				System.out.println("Inserisci id: ");
				int id = input.nextInt();
				System.out.println("Inserisci titolo: ");
				String titolo = input.next();
				System.out.println("Inserisci autore: ");
				String autore = input.next();
				System.out.println("Inserisci categoria: ");
				String categoria = input.next();
				boolean disponibilita = true;
				Libro nuovoLibro = new Libro(id, titolo, autore, categoria, disponibilita);
				biblioteca.elenco.add(nuovoLibro);
				scelta = -1;
				break;
			case 2: //Prestare libro
				System.out.println("Inserisci id: ");
				id = input.nextInt();
				int j = -1;
				for (int i = 0; i < biblioteca.elenco.size(); i++)
				{
					if (id == biblioteca.elenco.get(i).id)
					{
						j = i;
						break;
					}
				}
				if (j != -1)
					biblioteca.elenco.get(j).prestito(biblioteca.elenco.get(j));
				else
					System.out.println("Id non valido");
				scelta = -1;
				break;
			case 3: //Restituire libro
				System.out.println("Inserisci id: ");
				id = input.nextInt();
				j = -1;
				for (int i = 0; i < biblioteca.elenco.size(); i++)
				{
					if (id == biblioteca.elenco.get(i).id)
					{
						j = i;
						break;
					}
				}
				if (j != -1)
					biblioteca.elenco.get(j).restituzione(biblioteca.elenco.get(j));
				else
					System.out.println("Id non valido");
				scelta = -1;
				break;
			case 4: //Stampa libri Disponibili e Prestati
				Biblioteca.libriDisponibili(biblioteca.elenco);
				Biblioteca.libriPrestati(biblioteca.elenco);
				scelta = -1;
				break;
			case 5: //Ha sbagliato a cliccare
				scelta = -1;
				break;
			default:
				System.out.println("Premi 1 per aggiungere un libro, 2 per prestare un libro, 3 per restituire, 4 visualizzare elenco disponibili e prestati, 5 per uscire");
				scelta = input.nextInt();
				continue;
			}
			System.out.println("Vuoi fare altro? Premi 1 per sì."); //Esci
			conferma = input.nextInt();
		}
		input.close();
	}

	//Libro(int id, String titolo, String autore, String categoria, boolean disponibilita)
	public static void main(String[] args)
	{
		Libro problemaDeiTreCorpi = new Libro(10, "Il problema dei tre corpi", "Cixin Liu", "Fantascienza", true);
		Libro problemaDeiDueCorpi = new Libro(11, "Il problema dei due corpi", "Cixin Ziu", "Fantascienza", true);
		ArrayList<Libro> elenco = new ArrayList<Libro>();
		elenco.add(problemaDeiTreCorpi);
		elenco.add(problemaDeiDueCorpi);
		Biblioteca biblioteca = new Biblioteca(elenco);
		gestioneBiblioteca(biblioteca);
	}

}
