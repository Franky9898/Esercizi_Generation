package mainpackage;

import java.util.Scanner;

public class EsercizioIfElse2
{
	public static void main(String[] args)
	{
		double limitePrimaFascia = 15000d;
		double limiteSecondaFascia = 30000d;
		double limiteTerzaFascia = 50000d;
		double tassoPrimaFascia = 0.0;
		double tassoSecondaFascia = 0.15;
		double tassoTerzaFascia = 0.2;
		double tassoQuartaFascia = 0.25;
		double tasseDovute;
		String livelloFascia;

		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il reddito: ");
		double redditoUtente = input.nextDouble();
		input.close();

		if (redditoUtente < 0) //Input valido
		{
			System.out.println("Per favore inserisci un importo valido (positivo)");
		} else if (redditoUtente <= limitePrimaFascia) //Prima fascia
		{
			livelloFascia = "prima";
			tasseDovute = 0;
			System.out.println("Il tuo reddito è: " + redditoUtente + ". Sei in " + livelloFascia + " fascia. Tasse dovute: " + tasseDovute);
		} else if (redditoUtente <= limiteSecondaFascia) //Seconda fascia
		{
			livelloFascia = "seconda";
			tasseDovute = (redditoUtente - limitePrimaFascia) * tassoSecondaFascia;
			System.out.println("Il tuo reddito è: " + redditoUtente + ". Sei in " + livelloFascia + " fascia. Tasse dovute: " + tasseDovute);
		} else if (redditoUtente <= limiteTerzaFascia) //Terza fascia
		{
			livelloFascia = "terza";
			tasseDovute = (redditoUtente - limiteSecondaFascia) * tassoTerzaFascia;
			System.out.println("Il tuo reddito è: " + redditoUtente + ". Sei in " + livelloFascia + " fascia. Tasse dovute: " + tasseDovute);
		} else //Quarta fascia
		{
			livelloFascia = "quarta";
			tasseDovute = (redditoUtente - limiteTerzaFascia) * tassoQuartaFascia;
			System.out.println("Il tuo reddito è: " + redditoUtente + ". Sei in " + livelloFascia + " fascia. Tasse dovute: " + tasseDovute);
		}

	}
}
