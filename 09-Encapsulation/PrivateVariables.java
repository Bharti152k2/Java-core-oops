public class PrivateVariables {

    private int balance = 5000;

    public int getBalance() {

        return balance;
    }

    public static void main(String[] args) {

        PrivateVariables account = new PrivateVariables();

        System.out.println("Balance: " + account.getBalance());

        // Not allowed:
        // account.balance = 10000;
    }
}