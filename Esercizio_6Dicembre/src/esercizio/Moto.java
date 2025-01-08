package esercizio;

public class Moto extends Veicolo
{
	int cilindrata;

	public Moto(String marca, String modello, int anno, int cilindrata)
	{
		super(marca, modello, anno);
		this.cilindrata = cilindrata;
	}

	public void cilindrata()
	{
		System.out.println("Cilindrata: " + cilindrata);
	}
}
