class Customer
{
        private int custId;
        private String name;
        private String address;
        private String phoneNo;

        // Constructor
        public Customer(int custId, String name, String address, String phoneNo) {
            this.custId = custId;
            this.name = name;
            this.address = address;
            this.phoneNo = phoneNo;
        }

        // Getters and Setters
        public int getCustId()
       {
            return custId;
        }
        public void setCustId(int custId)
        {
            this.custId = custId;
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

        // toString method
        public String toString() {
            return "Customer[custId=" + custId + ", name=" + name + ", address=" + address + ", phoneNo=" + phoneNo + "]";
        }

        public static void main(String[] args) {
            Customer[] customers = new Customer[5];

            customers[0] = new Customer(101, "Ravi", "Guwahati", "9876543210");
            customers[1] = new Customer(102, "Priya", "Delhi", "8888888888");
            customers[2] = new Customer(103, "Amit", "Mumbai", "9999999999");
            customers[3] = new Customer(104, "Sneha", "Kolkata", "7777777777");
            customers[4] = new Customer(105, "Rahul", "Chennai", "6666666666");

            for (Customer c : customers) {
                System.out.println(c.toString());
            }
        }
    }