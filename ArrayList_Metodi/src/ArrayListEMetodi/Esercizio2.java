package ArrayListEMetodi;

import java.util.Arrays;

public class Esercizio2
{
	//Esercizio 2: Metodo per trovare il massimo in un array

	static int[] creaArray(int grandezzaArray, int larghezzaIntervallo, int startingPoint)
	{
		int[] array = new int[grandezzaArray];
		for (int i = 0; i < array.length; i++)
			array[i] = (int) (Math.random() * larghezzaIntervallo + startingPoint);
		return array;
	}

	static int massimoArray(int[] array)
	{
		Arrays.sort(array);
		return array[array.length - 1];
	}

	public static void main(String[] args)
	{
		int numeri[] = creaArray(6, 10, -5);
		int massimo = massimoArray(numeri);
		System.out.println(massimo);
	}
}
