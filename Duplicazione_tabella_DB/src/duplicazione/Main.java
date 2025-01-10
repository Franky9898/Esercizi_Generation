package duplicazione;


import java.util.ArrayList;

public class Main
{
	

	public static void main(String[] args)
	{
		ArrayList<Libro> libreria = Libro.selezioneDati("esercizi_generation.libri");
		Libro.duplicazioneDati("esercizi_generation2.libri", libreria);
	}

	

}
