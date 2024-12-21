package esercizi;

import java.util.ArrayList;
import java.util.Scanner;

public class Esercizio1
{
	//Esercizio: Autovelox (Metodi & Arraylist)

	static double funzioniMulta(double velocitàSopraLimite, int puntoIniziale, int puntoFinale, int limiteSuperiore, int limiteInferiore) //retta per due punti. x1=limiteInferiore, x2=limiteSuperiore
	{                                                                                                                        			  //y1=lpuntoIniziale, y2=puntoFinale
		double multa = 0d;
		multa = ((double) (puntoFinale - puntoIniziale) * ((velocitàSopraLimite - limiteInferiore) / (double) (limiteSuperiore - limiteInferiore)) + puntoIniziale);
		return multa;
	}

	static ArrayList<Double> velocitàTollerata(ArrayList<Double> andatura) //Da velocità del guidatore a velocità tollerata da autovelox
	{
		ArrayList<Double> rilevata = new ArrayList<Double>();
		for (Double velocità : andatura)
		{
			if (velocità <= 100) //Se sotto i 100 la tolleranza è 5
				rilevata.add(velocità - 5);
			else //Altrimenti è del 5%
				rilevata.add(velocità * 0.95);
		}
		return rilevata;
	}

	static double calcoloMulta(ArrayList<Double> limiti, ArrayList<Double> rilevata, ArrayList<Double> orario) //Calcolo multa in base ai limiti di velocità, la velocità di andatura 
	{                                                                                                          //e orario del viaggio
		ArrayList<Double> multa = new ArrayList<Double>(); //Creo ArrayList per i valori multa per ogni input utente
		for (int i = 0; i < limiti.size(); i++)
		{
			if (rilevata.get(i) - limiti.get(i) <= 0) //Niente multa
				multa.add(0d);
			else if (rilevata.get(i) - limiti.get(i) <= 10) //10 sopra il limite
				multa.add(funzioniMulta((rilevata.get(i) - limiti.get(i)), 42, 173, 10, 0));
			else if (rilevata.get(i) - limiti.get(i) <= 40) //40 sopra il limite
				multa.add(funzioniMulta((rilevata.get(i) - limiti.get(i)), 173, 694, 40, 10));
			else if (rilevata.get(i) - limiti.get(i) <= 60) //60 sopra il limite
				multa.add(funzioniMulta((rilevata.get(i) - limiti.get(i)), 543, 2170, 60, 40));
			else //Troppo veloce
				multa.add(funzioniMulta((rilevata.get(i) - limiti.get(i)), 845, 3382, 250, 60)); //250 preso perché secondo me nessuna macchina normale va sopra i 250
			if (orario.get(i) < 7 || orario.get(i) > 22) //La notte la multa è più salata
				multa.set(i, multa.get(i) * 1.33);
		}
		double multaTotale = 0d;
		for (int i = 0; i < limiti.size(); i++) //Somma i valori nell' ArrayList multa per ottenere il totale
		{
			multaTotale += multa.get(i);
		}
		return multaTotale;
	}

	static ArrayList<Double> creaArrayListControllo(ArrayList<Double> arrayList, String domanda) //Crea arraylist tramite input utente e si ha un controllo su input valido
	{
		Scanner scanner = new Scanner(System.in);
		double controllo = -1;
		//Array con limiti
		while (controllo < 0)
		{
			System.out.println(domanda);
			controllo = scanner.nextDouble();
		}
		arrayList.add(controllo);
		//scanner.close(); *******
		return arrayList;
	}

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int conferma = 1;
		ArrayList<Double> arrayLimite = new ArrayList<Double>();
		ArrayList<Double> arrayAndatura = new ArrayList<Double>();
		ArrayList<Double> arrayOrario = new ArrayList<Double>();
		while (conferma == 1)
		{
			arrayLimite = creaArrayListControllo(arrayLimite, "Qual è il limite di velocità da considerare?");
			arrayAndatura = creaArrayListControllo(arrayAndatura, "Qual è la velocità a cui viaggiavi?");
			arrayOrario = creaArrayListControllo(arrayOrario, "A che ora viaggiavi? ");
			System.out.println("Vuoi continuare a inserire dati? Premi 1 per sì, altro per no ");
			conferma = input.nextInt();
		}
		ArrayList<Double> arrayTollerata = velocitàTollerata(arrayAndatura);
		double multa = calcoloMulta(arrayLimite, arrayTollerata, arrayOrario);
		System.out.println("Il totale da pagare ammonta a: " + multa);
		input.close();
	}

}
