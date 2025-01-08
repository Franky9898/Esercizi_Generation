package bankCheckFeatues;

import java.util.ArrayList;

import bank.BankAccount;

public class NewImpl extends BankAccount
{
	private ArrayList<String> list = new ArrayList<String>();

	public NewImpl(String accountHolderName, double initialBalance) //Costruttore
	{
		super(accountHolderName, initialBalance);
	}

	protected void withdrawalIterest(double amount) //Metodo di prelievo
	{
		if (amount <= 500 && amount > 0 && getBalance() > amount) //Controllo sul saldo, necessario getBalance perché privato
		{
			withdraw(amount);
			list.add("Hai prelevato " + amount + ". Saldo attuale: " + getBalance());
		} else if (amount > 0 && getBalance() > amount) //Interesse
		{
			withdraw(amount);
			list.add("Hai prelevato " + amount * 0.9 + " con commissione di " + amount * 0.1 + ". Saldo attuale: " + getBalance());
		} else
			System.out.println("Errore");
	}

	protected void depositInterest(double amount)
	{
		if (amount > 0)
		{
			deposit(amount);
			list.add("Hai depositato " + amount + ". Saldo attuale: " + getBalance());
		} else
			System.out.println("Errore");
	}

	public void transactionList() //Print la lista delle transazioni
	{
		System.out.println(list);
	}

	public static void main(String[] args)
	{
		NewImpl account = new NewImpl("Ciao", 300);
		account.depositInterest(500);
		account.withdrawalIterest(600);
		account.transactionList();
		System.out.println(account.getBalance());
	}
}
