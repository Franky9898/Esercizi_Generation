package esercizio2;

import java.util.ArrayList;

public class FiltraggioDati
{

	public static void main(String[] args)
	{
		ArrayList<Prodotti> prodotti = new ArrayList<Prodotti>();
		Prodotti mouse = new Prodotti("Mouse", "Elettronica", 10.0);
		Prodotti tastiera = new Prodotti("Tastiera", "Elettronica", 30.5);
		Prodotti libroJava = new Prodotti("Java for Dorks", "Libro", 110.0);
		Prodotti caffe = new Prodotti("Caffe", "Cibo", 0.5);
		Prodotti sedia = new Prodotti("Sedia", "Mobili", 20.99);
		prodotti.add(sedia);
		prodotti.add(caffe);
		prodotti.add(tastiera);
		prodotti.add(libroJava);
		prodotti.add(mouse);
		Negozio.filtraProdottoCategoria(prodotti, "libro");
		Negozio.aggiungiProdotto(prodotti);
		System.out.println(prodotti);
	}

}
