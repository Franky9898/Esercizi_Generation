package mainpackage;

import java.util.Scanner;

public class EsercizioIfElse
{
	public static void main(String[] args)
	{
		//Esercizio if/else
		double costoMeseTariffaBasic = 10.0d;		//Ci sono tre tariffe con tre costi differenti, minuti sforabili differenti
		double costoMeseTariffaStandard = 20.0d;	//e costi penali differenti.
		double costoMeseTariffaPremium = 30.0d;
		double minutiInclusiTariffaBasic = 50.0d;
		double minutiInclusiTariffaStandard = 150.0d;
		double minutiInclusiTariffaPremium = 300.0d;
		double costoMinutoExtraTariffaBasic = 0.2d;
		double costoMinutoExtraTariffaStandard = 0.15d;
		double costoMinutoExtraTariffaPremium = 0.1d;
		double differenza;		//Variabile per contenere la quantità di minuti sforati
		double costoMinutiSforati;		//Variabile che contiene il prezzo dovuto a causa dei minuti sforati 

		Scanner input = new Scanner(System.in);
		System.out.println("Scegli un piano scrivendo 1) Basic, 2) Standard o 3) Premium: ");
		int nomeInputTariffa = input.nextInt();
		System.out.println("Inserisci il numero di minuti utilizzati mensilmente: ");
		double numeroMinutiUsati = input.nextDouble();
		input.close();

		if (nomeInputTariffa == 1)
		{
			differenza = numeroMinutiUsati - minutiInclusiTariffaBasic;
			if (differenza < 0)
			{
				System.out.println("Il costo mensile è stato: " + costoMeseTariffaBasic + ". Non sono stati usati minuti extra.");
			} else
			{
				costoMinutiSforati = differenza * costoMinutoExtraTariffaBasic;
				System.out.println("Il costo mensile è stato: " + (costoMeseTariffaBasic + costoMinutiSforati) + ". Sono stati usati minuti extra: " + differenza);
			}
		} else if (nomeInputTariffa == 2)
		{
			differenza = minutiInclusiTariffaStandard - numeroMinutiUsati;
			if (differenza <= 0)
			{
				System.out.println("Il costo mensile è stato: " + costoMeseTariffaStandard + ". Non sono stati usati minuti extra.");
			} else
			{
				costoMinutiSforati = differenza * costoMinutoExtraTariffaStandard;
				System.out.println("Il costo mensile è stato: " + (costoMeseTariffaStandard + costoMinutiSforati) + ". Sono stati usati minuti extra: " + differenza);
			}
		} else if (nomeInputTariffa == 3)
		{
			differenza = minutiInclusiTariffaPremium - numeroMinutiUsati;
			if (differenza <= 0)
			{
				System.out.println("Il costo mensile è stato: " + costoMeseTariffaPremium + ". Non sono stati usati minuti extra.");
			} else
			{
				costoMinutiSforati = differenza * costoMinutoExtraTariffaPremium;
				System.out.println("Il costo mensile è stato: " + (costoMeseTariffaPremium + costoMinutiSforati) + ". Sono stati usati minuti extra: " + differenza);
			}
		} else
		{
			System.out.println("Per favore scegli tra 1, 2 o 3");
		}
	}
}
