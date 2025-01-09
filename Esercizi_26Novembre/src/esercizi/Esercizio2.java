package esercizi;

public class Esercizio2
{
	public static void main(String[] args)
	{
		//Esercizio 1: Merge di due array ordinati
		int[] arrayOrdinato1 = { -3, -1, 1, 2, 3, 4, 20 };                                //L'idea è permettere il confronto tra tutti gli elementi dei due array senza inserirli all'interno
		int[] arrayOrdinato2 = { -4, 1, 2, 4, 4, 6, 30 };                                 //del terzo. Si utilizzano due variabili che ricordano quali indici già usati e memorizzati nel terzo.
		int lunghezzaArrayFinale = arrayOrdinato1.length + arrayOrdinato2.length;
		int[] arrayFinale = new int[lunghezzaArrayFinale];
		int L = 0;
		int R = 0;

		for (int i = 0; i < arrayFinale.length; i++) //Ciclo su array finale
		{
			if (L < arrayOrdinato1.length && R < arrayOrdinato2.length)
			{
				if (arrayOrdinato1[L] <= arrayOrdinato2[R]) // confronto
				{
					arrayFinale[i] = arrayOrdinato1[L];
					L++;
				} else
				{
					arrayFinale[i] = arrayOrdinato2[R];
					R++;
				}
			} else if (L == arrayOrdinato1.length) // per evitare overflow di L
			{
				arrayFinale[i] = arrayOrdinato2[R];
				R++;
			} else if (R == arrayOrdinato2.length) // per evitare overflow di R
			{
				arrayFinale[i] = arrayOrdinato1[L];
				L++;
			}
		}
		for (int i = 0; i < arrayFinale.length; i++)
		{
			System.out.println(arrayFinale[i]);
		}
	}
}
