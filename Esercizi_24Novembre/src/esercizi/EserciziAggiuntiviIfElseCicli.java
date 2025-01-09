package esercizi;

import java.util.Scanner;

public class EserciziAggiuntiviIfElseCicli
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		//Esercizio 1: login utente singolo

		//String username = "esempioUsername_123";
		//String password = "esempioPassword123!";
		//int numeroTentativi = 0, massimoTentativi = 3;
		//System.out.println("Inserisci username e password: ");
		//while (numeroTentativi <= massimoTentativi)
		//{
		//	String usernameUtente = input.nextLine();
		//	String passwordUtente = input.nextLine();
		//	if (usernameUtente.equals(username) && passwordUtente.equals(password))
		//	{
		//		System.out.println("Accesso riuscito");
		//		break;
		//	} else if ((massimoTentativi - numeroTentativi) == 1)
		//	{
		//		numeroTentativi++;
		//		System.out.println("Username o password non corretti. Ultimo tentativo. Riprova: ");
		//	} else if (numeroTentativi == massimoTentativi)
		//	{
		//		numeroTentativi++;
		//		System.out.println("Accesso bloccato.");
		//	} else
		//	{
		//		System.out.println("Username o password non corretti. Hai ancora " + (massimoTentativi - numeroTentativi) + " tentativi. Riprova: ");
		//		numeroTentativi++;
		//	}
		//
		//}

		//Esercizio 2: somma numeri pari e dispari

		//int sommaNumeriPari = 0;
		//int sommaNumeriDispari = 0;
		//int temp;
		//System.out.println("Inserisci due numeri interi: ");
		//int estremoSinistro = input.nextInt();
		//int estremoDestro = input.nextInt();
		//if (estremoSinistro <= estremoDestro)
		//{
		//	System.out.print("La somma dei numeri pari compresi tra " + estremoSinistro + " e " + estremoDestro + " è: ");
		//	if (estremoSinistro < 0 && estremoDestro > 0 && estremoDestro > (-estremoSinistro)) // Se l'estremo sinistro è negativo e minore in modulo dell'estremo destro allora per la simmetria  
		//		estremoSinistro = (-estremoSinistro + 1);                                       // della sommatoria basta partire dall'opposto dell'estremo sinistro con termine di correzione 1. 
		//	for (int i = estremoSinistro; i <= estremoDestro; i++)
		//	{
		//		if (i % 2 == 0)
		//			sommaNumeriPari += i;
		//		else
		//			sommaNumeriDispari += i;
		//	}
		//	System.out.print(sommaNumeriPari + ". La somma dei numeri dispari è: " + sommaNumeriDispari + ".");
		//} else
		//{	// Swappiamo i valori degli estremi
		//	temp = estremoSinistro;
		//	estremoSinistro = estremoDestro;
		//	estremoDestro = temp;
		//	System.out.print("La somma dei numeri pari compresi tra " + estremoSinistro + " e " + estremoDestro + " è: ");
		//	if (estremoSinistro < 0 && estremoDestro > 0 && estremoDestro > (-estremoSinistro))
		//		estremoSinistro = (-estremoSinistro + 1);
		//	for (int i = estremoSinistro; i <= estremoDestro; i++)
		//	{
		//		if (i % 2 == 0)
		//			sommaNumeriPari += i;
		//		else
		//			sommaNumeriDispari += i;
		//	}
		//	System.out.print(sommaNumeriPari + ". La somma dei numeri dispari è: " + sommaNumeriDispari + ".");
		//}

		//Esercizio 3: numeri primi

		//int numero;
		//boolean primo = true;
		//int i = 3;
		//System.out.println("inserisci un numero intero positivo: ");
		//numero = input.nextInt();
		//while (numero < 2)
		//{
		//	System.out.println("Numero non valido perché non positivo o nullo o 1. Riprovare.");
		//	numero = input.nextInt();
		//}
		//if (numero != 2 && numero % 2 == 0)
		//	primo = false;
		//
		//while (primo && i <= (numero / 2))
		//{
		//	if (numero % i == 0)
		//	{
		//		primo = false;
		//		break;
		//	}
		//	i += 2;
		//}
		//if (primo)
		//	System.out.println(numero + " è primo.");
		//else
		//	System.out.println(numero + " non è primo.");

		//Esercizio 4: numeri perfetti

		int num;
		int sommaDivisori = 1;
		System.out.println("inserisci un numero intero positivo: ");
		num = input.nextInt();
		while (num < 2)
		{
			System.out.println("Numero non valido perché non positivo o nullo o è uno. Riprovare.");
			num = input.nextInt();
		}
		for (int i = 2; i < num; i++)
		{
			if (num % i == 0)
				sommaDivisori += i;
		}
		if (sommaDivisori == num)
			System.out.println("Il numero " + num + " è perfetto.");
		else
			System.out.println("Il numero " + num + " non è perfetto.");

		input.close();
	}
}
