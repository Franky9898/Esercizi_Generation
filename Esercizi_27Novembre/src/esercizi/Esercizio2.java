package esercizi;

public class Esercizio2
{
	public static void main(String[] args)
	{
		//Esercizio n.2: Stampa di una matrice in forma tabulare

		int[][] matrice = { { 1, 2, 3, 4 }, { 4, 5, 6, 7 }, { 7, 8, 9, 9 } };
		for (int i = 0; i < matrice.length; i++)
		{
			for (int j = 0; j < matrice[i].length; j++)
			{
				System.out.print(matrice[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
