package ArrayListEMetodi;

import java.util.ArrayList;

public class Esercizio1
{
	//Esercizio 1: ArrayList e metodi per la media
	static ArrayList<Integer> creaArrayList(int grandezzaNumeriMedia, int larghezzaIntervallo, int startingPoint) // Crea arraylist con grandezza "grandezzaNumeriMedia" e numeri all'interno 
	{                                                                                                             // tra startingPoint a larghezzaIntervallo + startingPoint
		ArrayList<Integer> arrayList = new ArrayList<Integer>(); // Inizializza array
		for (int i = 0; i < grandezzaNumeriMedia; i++)
			arrayList.add((int) (Math.random() * larghezzaIntervallo + startingPoint)); //Aggiunge nell'array
		return arrayList;
	}

	static double calcolaMedia(ArrayList<Integer> numeri) //Calcola la media dei numeri presenti in un array
	{
		int somma = 0;
		for (Integer numero : numeri) //Somma tutti i numeri dentro i numeri
			somma += numero;
		double media = (double) somma / numeri.size();
		return media;
	}

	public static void main(String[] args)
	{
		ArrayList<Integer> numeriMedia = creaArrayList(30, 25, -10); //Metodo crea array 
		double media = calcolaMedia(numeriMedia); //Metodo calcola media
		System.out.println(media); //Printa la media
	}
}
