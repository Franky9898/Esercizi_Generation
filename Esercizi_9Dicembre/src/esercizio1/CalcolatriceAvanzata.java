package esercizio1;

public class CalcolatriceAvanzata extends CalcolatriceBase
{
	public void calcolatriceAvanzata()
	{
	}

	public int chiamaMetodi(String nome, int a, int b)
	{
		if (nome.equalsIgnoreCase("somma"))
			return somma(a, b);
		else if (nome.equalsIgnoreCase("differenza"))
			return differenza(a, b);
		else if (nome.equalsIgnoreCase("prodotto"))
			return a * b;
		else if (nome.equalsIgnoreCase("quotiente"))
			return a / b;
		else
			return -1;
	}
}
