package esercizi;

public class Esercizio1
{
	public static void main(String[] args)
	{
		//Scrivi un programma che trovi la posizione (indice) di un elemento specifico in un array.

		int target = (int) (Math.random() * 50 + 1); //Genero numero casuale da cercare
		int posizioneTargetTrovata = -1;
		int[] numeri = new int[20]; //Inizializzo un array di lunghezza 20
		for (int i = 0; i < numeri.length; i++)
		{
			numeri[i] = (int) (Math.random() * 30); //Assegno valori random all'array numeri
		}
		int posizioneTarget = (int) (Math.random() * numeri.length); //Genero casualmente la posizione del target
		int inseriscoSi = (int) (Math.random() * 3); //Genero un valore per decidere se inserire o meno il valore
		if (inseriscoSi == 1) //Se è 1 inserisco target nell'array numeri
			numeri[posizioneTarget] = target;
		for (int j = 0; j < numeri.length; j++) //Cerco target nell'array numeri
		{
			if (numeri[j] == target)
			{
				posizioneTargetTrovata = j; //Mi salvo la posizione di target
				break;
			}
		}
		if (posizioneTargetTrovata != -1) //Stampo posizione 
			System.out.println("La posizione del numero " + target + " è: " + posizioneTargetTrovata + ".");
		else
			System.out.println("Il numero " + target + " non è presente.");
	}
}
