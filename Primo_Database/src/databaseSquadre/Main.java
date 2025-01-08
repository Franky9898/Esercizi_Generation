package databaseSquadre;

import java.sql.*;

public class Main
{
	private static final String URL = "jdbc:mysql://localhost:3306/gestione_squadre";
	private static final String USER = "root";
	private static final String PASSWORD = "(rimossa)";

	public static void main(String[] args)
	{
		ricercaGiocatori(25, 29);
		ricercaGoal(30);
		ricercaNome("M%");
	}

	public static void ricercaGiocatori(int eta1, int eta2)
	{
		String query = "SELECT * FROM gestione_squadre.calciatore WHERE eta BETWEEN ? AND ?;";

		try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD); PreparedStatement pstmt = conn.prepareStatement(query))
		{

			// Associo al placeholder ? (il primo e unico in questo caso) la stringa brand
			pstmt.setInt(1, eta1);
			pstmt.setInt(2, eta2);

			// Eseguo la query e ottengo il ResultSet
			try (ResultSet rs = pstmt.executeQuery())
			{
				// Ciclo sui risultati
				while (rs.next())
				{
					int id = rs.getInt("idCalciatore");
					String nome = rs.getString("calciatore");
					int etaGioc = rs.getInt("eta");
					int goal = rs.getInt("goal");
					int idSquadra = rs.getInt("idSquadra");

					System.out.printf("ID: %d | Nome: %s | Eta: %d | Goal: %d | idSquadra: %d%n", id, nome, etaGioc, goal, idSquadra);
				}
			}

		} catch (SQLException e)
		{
			e.printStackTrace();
		}
	}

	public static void ricercaGoal(int goalGiocatore)
	{
		String query = "SELECT calciatore, goal FROM calciatore WHERE goal >= ?";
		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD); PreparedStatement pStatement = connection.prepareStatement(query))
		{
			pStatement.setInt(1, goalGiocatore);
			try (ResultSet result = pStatement.executeQuery())
			{
				while(result.next()) 
				{
					String nome = result.getString("calciatore");
					int goal = result.getInt("goal");
					System.out.printf("Nome: %s, Goal: %d%n", nome, goal);
				}
			}
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	public static void ricercaNome(String iniziale) 
	{
		String query = "SELECT calciatore, eta, idSquadra FROM calciatore WHERE calciatore LIKE ? ";
		try(Connection conn2 = DriverManager.getConnection(URL, USER, PASSWORD); PreparedStatement pStat = conn2.prepareStatement(query))
		{
			pStat.setString(1,iniziale);
			try (ResultSet res = pStat.executeQuery()) 
			{
				while(res.next()) 
				{
					String nome = res.getString("calciatore");
					int eta = res.getInt("eta");
					int squadra = res.getInt("idSquadra");
					System.out.printf("Nome: %s | Eta: %d | Squadra:%d%n", nome, eta, squadra);
				}
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
