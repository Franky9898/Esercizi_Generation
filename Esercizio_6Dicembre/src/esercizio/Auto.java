package esercizio;

public class Auto extends Veicolo
{
	int numeroPorte;

	public Auto(String marca, String modello, int anno, int _numeroPorte)
	{
		super(marca, modello, anno);
		this.numeroPorte = _numeroPorte;
	}

	public void porte()
	{
		System.out.println("Numero porte: " + numeroPorte);
	}
}
