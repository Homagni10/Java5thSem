class BankAccount {
        // private fields
        private String accountNumber;
        private double balance;

        // Constructor
        public BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        // Getter for accountNumber
        public String getAccountNumber() {
            return accountNumber;
        }

        // Setter for accountNumber
        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        // Getter for balance
        public double getBalance() {
            return balance;
        }

        // Setter for balance
        public void setBalance(double balance) {
            if (balance >= 0) {  // validation
                this.balance = balance;
            } else {
                System.out.println("Balance cannot be negative!");
            }
        }
    }

    // Main class to test
    class SBI {
        public static void main(String[] args) {
            // Create BankAccount object
            BankAccount account = new BankAccount("ACC123", 5000);

            // Accessing details using getters
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Balance: " + account.getBalance());

            // Updating details using setters
            account.setAccountNumber("ACC456");
            account.setBalance(7000);

            System.out.println("Updated Account Number: " + account.getAccountNumber());
            System.out.println("Updated Balance: " + account.getBalance());

            // Trying to set negative balance
            account.setBalance(-1000);
        }
    }
