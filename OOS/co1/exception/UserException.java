import java.util.*;

class LowBalanceException extends Exception {
    long amt;

    LowBalanceException(long a) {
        super("Insufficient balance! Attempted to withdraw: " + a);
        amt = a;
    }
}

class ExcessBalanceException extends Exception {
    long amt;

    ExcessBalanceException(long a) {
        super("Withdrawal limit exceeded! Attempted to withdraw: " + a);
        amt = a;
    }
}

class Bank {
    static long MAX_LIMIT = 10000;
    HashMap<Long, Long> accountBalances;  

    Bank() {
        accountBalances = new HashMap<>();
    }

    void insert(long accno, long amt) {
        accountBalances.put(accno, amt);
    }

    long getBalance(long accno) {
        return accountBalances.getOrDefault(accno, 0L);
    }

    public void withdraw(long accno, long amt) throws LowBalanceException, ExcessBalanceException {
        long balance = getBalance(accno);
        if (balance < amt) {
            throw new LowBalanceException(amt);
        } else if (amt > MAX_LIMIT) {
            throw new ExcessBalanceException(amt);
        } else {
            accountBalances.put(accno, balance - amt);
            System.out.println("Amount withdrawn successfully.");
        }
    }
}

public class UserException {
    public static void main(String[] args) {
        Bank ob = new Bank();
        ob.insert(1, 2000);
        ob.insert(2, 2500);
        ob.insert(3, 2900);

        try {
            ob.withdraw(2, 5000);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
