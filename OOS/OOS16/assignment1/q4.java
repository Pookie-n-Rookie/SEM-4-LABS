import java.util.*;


class BankAccount {
    int accountNumber;
    float balance;
    String ownerName;

   
    BankAccount(int accountNumber, float balance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    
    void showBalance() {
        System.out.println("The current balance of the account is: " + this.balance);
    }

    
    void deposit(float amount) {
        this.balance += amount;
        System.out.println("Amount deposited successfully. New balance: " + this.balance);
    }

    
    void withdraw(float amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Amount withdrawn successfully. New balance: " + this.balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    
    void displayDetails() {
        System.out.println("Account Number: " + this.accountNumber + ", Balance: " + this.balance + ", Owner Name: " + this.ownerName);
    }
}


class AccountManager {
    ArrayList<BankAccount> accounts = new ArrayList<>();

    
    void createAccount(int accountNumber, String ownerName, float initialBalance) {
        BankAccount newAccount = new BankAccount(accountNumber, initialBalance, ownerName);
        accounts.add(newAccount);
        System.out.println("Account created successfully.");
    }

    
    void deleteAccount(int accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).accountNumber == accountNumber) {
                accounts.remove(i);
                System.out.println("Account deleted successfully.");
                return;
            }
        }
        System.out.println("Account not found.");
    }

    
    void depositToAccount(int accountNumber, float amount) {
        for (BankAccount account : accounts) {
            if (account.accountNumber == accountNumber) {
                account.deposit(amount);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    
    void withdrawFromAccount(int accountNumber, float amount) {
        for (BankAccount account : accounts) {
            if (account.accountNumber == accountNumber) {
                account.withdraw(amount);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    
    void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found.");
        } else {
            for (BankAccount account : accounts) {
                account.displayDetails();
            }
        }
    }
}


class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountManager manager = new AccountManager();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter details for account " + i + ":");
            System.out.print("Enter account number: ");
            int accNum = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Enter owner name: ");
            String owner = scanner.nextLine();
            System.out.print("Enter initial balance: ");
            float initBalance = scanner.nextFloat();
            manager.createAccount(accNum, owner, initBalance);
        }

       
        while (true) {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Create Account");
            System.out.println("2. Delete Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    int accNum = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter owner name: ");
                    String owner = scanner.nextLine();
                    System.out.print("Enter initial balance: ");
                    float initBalance = scanner.nextFloat();
                    manager.createAccount(accNum, owner, initBalance);
                    break;

                case 2:
                    System.out.print("Enter account number to delete: ");
                    int delAccNum = scanner.nextInt();
                    manager.deleteAccount(delAccNum);
                    break;

                case 3:
                    System.out.print("Enter account number to deposit into: ");
                    int depAccNum = scanner.nextInt();
                    System.out.print("Enter amount to deposit: ");
                    float depAmount = scanner.nextFloat();
                    manager.depositToAccount(depAccNum, depAmount);
                    break;

                case 4:
                    System.out.print("Enter account number to withdraw from: ");
                    int witAccNum = scanner.nextInt();
                    System.out.print("Enter amount to withdraw: ");
                    float witAmount = scanner.nextFloat();
                    manager.withdrawFromAccount(witAccNum, witAmount);
                    break;

                case 5:
                    manager.displayAllAccounts();
                    break;

                case 6:
                    System.out.println("Exiting. Thank you for using the bank system.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
