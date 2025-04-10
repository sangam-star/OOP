// BankAccount class demonstrating function overloading
class BankAccount {
    public String accountNumber;
    public String customerName;
    public double balance;

    // Constructor to initialize account details
    public BankAccount(String accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

  
    public void displayInfo() {
        System.out.println("Customer Name: " + customerName);
    }

    
    public void displayInfo(boolean showAccountNumber) {
        System.out.println("Customer Name: " + customerName);
        if (showAccountNumber) {
            System.out.println("Account Number: " + accountNumber);
        }
    }

    
    public void displayInfo(boolean showAccountNumber, boolean showBalance) {
        System.out.println("Customer Name: " + customerName);
        if (showAccountNumber) {
            System.out.println("Account Number: " + accountNumber);
        }
        if (showBalance) {
            System.out.println("Balance: $" + balance);
        }
    }
}

    
    
    
public class function_overloading {
    public static void main(String[] args) {
        
        BankAccount customer1 = new BankAccount("123456789", "Sangam Sedai", 2000);

        
        System.out.println("Displaying only customer name:");
        customer1.displayInfo();  

        System.out.println("Displaying name and account number:");
        customer1.displayInfo(true);   
        System.out.println();

        System.out.println("Displaying all details:");
        customer1.displayInfo(true, true);   
    }
}
    

