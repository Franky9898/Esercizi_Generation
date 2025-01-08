package paradigmiOOP;

import java.util.Scanner;

import bank.BankAccount;

public class SecImpl extends BankAccount
{
	private int pin;

	SecImpl(String accountHolderName, double initialBalance, int pin) // Aggiunta pin
	{
		super(accountHolderName, initialBalance);
		this.pin = pin;
	}

	public boolean login() //Login con massimo 3 tentativi
	{
		Scanner input = new Scanner(System.in);
		boolean access = false;
		int c = 0;
		System.out.println("Inserisci pin per accedere: ");
		int inputPin = input.nextInt();
		while (c < 3)
		{
			if (inputPin == pin)
			{
				System.out.println("Accesso riuscito");
				c = 0;
				access = true;
				break;
			} else if (c < 2)
			{
				System.out.println("Pin errato, riprovare: ");
				inputPin = input.nextInt();
				c++;
			} else
			{
				System.out.println("Addio. ");
				System.exit(0);
			}
		}
		input.close();
		return access;
	}

	private int withdrawCounter = 0;

	public void secWithdraw(double amount) //Prelievo con massimo 3 prelievi
	{
		withdrawCounter++;
		if (withdrawCounter < 4)
			withdraw(amount);
		else
		{
			System.out.println("Troppi prelievi");
			System.exit(0);
		}
	}

	public static void main(String[] args)
	{
		SecImpl account = new SecImpl("Beppe", 500, 1234);
		account.login();
		account.secWithdraw(100);
		account.secWithdraw(100);
		account.secWithdraw(100);
		account.secWithdraw(100);

	}
}
