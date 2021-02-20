/*
Input   ->  1
Output  ->  Arun, 45000.0
            Girdhar, 35000.0
            Amit, -12000.0 (NEGATIVE)
*/




class BankAccount {  
	private String id = "";
	private String name = "";
	private double balance = 0.00;
	private boolean allowNegativeBalance = false;
	private int transactions = 0;
	private String transactionText = "";

	public BankAccount() {}

	public BankAccount(String id) {
		this.id = id;
		this.name = id;
	}

	public BankAccount(String id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public String getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getTransactionCount() {
		return transactions;
	}

	public String getTransactions() {
		return transactionText;
	}

	public void deposit(double amount) {
		if (0 <= amount) {
			balance += amount;
			transactionText += "deposit of $" + amount + "\n";
		}
		transactions++;
	}
	
	public void setAllowNegativeBalance(boolean allowNegativeBalance) {
		this.allowNegativeBalance = allowNegativeBalance;
	}
	
	public void setBalance(double balance) {
		if (balance >= 0 || allowNegativeBalance) {
			this.balance = balance;
		}
	}

	public void withdraw(double amount) {
		if (allowNegativeBalance || balance >= amount) {
			balance -= amount;
			transactionText += "withdrawal of $" + amount + "\n";
		}
		transactions++;
	}

	public String __toString() {
		return id;
	}
    public String toString()
    {
    if(balance<0)
        return (name+", "+balance+" (NEGATIVE)");    
    else
        return (name+", "+balance);
    }
    
class Main{
    public static void main(String[] args)
    {
      BankAccount o1 = new BankAccount("A","Arun",45000);
      BankAccount o2 = new BankAccount("G","Girdhar",35000);
      BankAccount o3 = new BankAccount("A2","Amit",-12000);
      System.out.println(o1);
      System.out.println(o2);
      System.out.println(o3);
    }
}