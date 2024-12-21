package esercizio;

public class Veicolo
{
	String marca;
	String modello;
	int anno;

	public Veicolo(String marca, String modello, int anno)
	{
		this.marca = marca;
		this.modello = modello;
		this.anno = anno;
	}

	public void descrivi(Veicolo veicolo)
	{
		System.out.println("Marca:" + this.marca);
		System.out.println("Modello:" + this.modello);
		System.out.println("Anno:" + this.anno);
	}
}
