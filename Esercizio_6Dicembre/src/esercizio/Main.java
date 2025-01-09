package esercizio;

public class Main
{
	public static void main(String[] args)
	{
		Auto auto1 = new Auto("Fiat", "Punto", 2009, 4);
		Moto moto1 = new Moto("Moto", "NonSo", 2000, 120);
		moto1.descrivi(moto1);
		moto1.cilindrata();
		auto1.descrivi(auto1);
		auto1.porte();
	}
}
