class Account {
        protected long accNo;
        protected String name;
        protected String address;
        protected String phoneNo;
        protected String dob;
        protected double balance;

        // Constructor
        public Account(long accNo, String name, String address, String phoneNo, String dob, double balance) {
            this.accNo = accNo;
            this.name = name;
            this.address = address;
            this.phoneNo = phoneNo;
            this.dob = dob;
            this.balance = balance;
        }

        // Getters and Setters
        public long getAccNo()
        {
            return accNo;
        }
        public void setAccNo(long accNo)
        {
            this.accNo = accNo;
        }

        public String getName()
        {
            return name;
        }
        public void setName(String name)
        {
            this.name = name;
        }

        public String getAddress()
        {
            return address;
        }
        public void setAddress(String address)
        {
            this.address = address;
        }

        public String getPhoneNo()
        {
            return phoneNo;
        }
        public void setPhoneNo(String phoneNo)
        {
            this.phoneNo = phoneNo;
        }

        public String getDob()
        {
            return dob;
        }
        public void setDob(String dob)
        {
            this.dob = dob;
        }

        public double getBalance()
        {
            return balance;
        }
        public void setBalance(double balance)
        {
            this.balance = balance;
        }
    }

    class SavingAccount extends Account {

        public SavingAccount(long accNo, String name, String address, String phoneNo, String dob, double balance) {
            super(accNo, name, address, phoneNo, dob, balance);
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        }

        public void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount + ", Remaining Balance: " + balance);
            } else {
                System.out.println("Insufficient balance!");
            }
        }

        public static void main(String[] args) {
            SavingAccount sa = new SavingAccount(1234567890L, "Anjali", "Guwahati", "9123456780", "12-05-2000", 5000.0);
            System.out.println("Account Holder: " + sa.getName());
            sa.deposit(2000);
            sa.withdraw(1500);
            sa.withdraw(7000); // Will show insufficient balance
        }
    }

