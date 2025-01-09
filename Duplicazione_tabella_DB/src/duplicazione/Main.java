package duplicazione;

import java.sql.*;
import java.util.ArrayList;

public class Main
{
	private static final String URL = "jdbc:mysql://localhost:3306/esercizi_generation";
	private static final String URL2 = "jdbc:mysql://localhost:3306/esercizi_generation2";
	private static final String USER = "root";
	private static final String PASSWORD = "F8593ukrRd7&^%MD";

	public static void main(String[] args)
	{
		ArrayList<Libro> libreria = selezioneDati("esercizi_generation.libri");
		duplicazioneDati("esercizi_generation2.libri", libreria);
	}

	/* Metodo per selezionare tutti i campi della tabella libri
	 * @param nomeTabella:  Nome della tabella con relativo database  
	 * @return ArrayList: Contiene tutti gli oggetti di tipo libro trovati nella tabella
	 */
	
	public static ArrayList<Libro> selezioneDati(String nomeTabella)
	{
		ArrayList<Libro> libreria = new ArrayList<Libro>();
		String querySelezione = "SELECT * FROM " + nomeTabella; 
		try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD); Statement stmt = conn.createStatement())
		{
			ResultSet resultSet = stmt.executeQuery(querySelezione);
			while (resultSet.next()) // Si parte dall'indice 2 perchè non si vuole maneggiare l'ID della tabella originale
			{
				String autore = resultSet.getString(2); 
				String titolo = resultSet.getString(3);
				int annoPubblicazione = resultSet.getInt(4);
				double prezzo = resultSet.getDouble(5);
				Libro libro = new Libro(autore, titolo, annoPubblicazione, prezzo); // Creazione oggetto libro con attributi ricavati dalla tabella
				libreria.add(libro);
			}
			System.out.println("Riuscito"); //Per capire se funziona
			return libreria;
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		System.out.println("Fallimento");
		return null;
	}
	/* Metodo per duplicare la tabella in un secondo database
	 * @param nomeTabella: Nome della tabella con relativo database
	 * @param libreria: Contiene i dati da duplicare
	 */
	public static void duplicazioneDati(String nomeTabella, ArrayList<Libro> libreria)
	{
		String queryInserimento = "INSERT INTO " + nomeTabella + " (Autore, Titolo, AnnoPubblicazione, Prezzo) VALUES (?, ?, ?, ?)";
		try (Connection conn = DriverManager.getConnection(URL2, USER, PASSWORD); PreparedStatement prepstmt = conn.prepareStatement(queryInserimento))
		{
			for (Libro libro : libreria) // Per ogni libro si passano i suoi dati nella query che verrà eseguita prima dell'iterazione successiva.
			{
				prepstmt.setString(1, libro.autore);
				prepstmt.setString(2, libro.titolo);
				prepstmt.setInt(3, libro.annoPubblicazione);
				prepstmt.setDouble(4, libro.prezzo);
				prepstmt.executeUpdate();
			}
			System.out.println("Riuscita duplicazione");
		} catch (SQLException e)
		{
			e.printStackTrace();
		}

	}

}
