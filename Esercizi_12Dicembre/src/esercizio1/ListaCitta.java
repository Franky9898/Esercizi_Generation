package esercizio1;

import java.util.ArrayList;

public class ListaCitta
{
	public static void main(String[] args)
	{
		ArrayList<String> citta = new ArrayList<String>();
		String parigi = "Parigi";
		String roma = "Roma";
		String londra = "Londra";
		String berlino = "Andiamo a Berlino; Beppe";
		String madrid = "Madrid";
		citta.add(berlino);
		citta.add(londra);
		citta.add(roma);
		citta.add(parigi);
		citta.add(madrid);
		System.out.println(citta);
		citta.remove(1);
		System.out.println(citta);
	}
}
