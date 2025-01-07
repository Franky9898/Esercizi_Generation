package bingo;

import java.util.ArrayList;
import java.util.Collections;

public class Tabellone
{
	ArrayList<Integer> numeri = new ArrayList<Integer>(90);

	public Tabellone()
	{
		for (int i = 0; i < 90; i++)
		{
			this.numeri.add(i + 1); // Si inseriscono i numeri da 1 a 90
		}
		Collections.shuffle(numeri); // Si "mescolano" gli elementi nell'arrayList, usato per evitare nuovamente di controllare l'unicità dei numeri generati
	}

	public static int estrazioneNumeri(Tabellone tabellone, int c) // Si estrae il numero nell'indice c
	{
		System.out.println("È stato estratto il numero: " + (tabellone.numeri.get(c)));
		return tabellone.numeri.get(c);
	}

}
