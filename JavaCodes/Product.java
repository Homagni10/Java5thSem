class Product {
        private int itemNo;
        private String name;
        private double price;
        private int quantity;

        // Constructor
        public Product(int itemNo, String name, double price, int quantity) {
            this.itemNo = itemNo;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        // Getters and Setters
        public int getItemNo()
        {
            return itemNo;
        }
        public void setItemNo(int itemNo)
        {
            this.itemNo = itemNo;
        }

        public String getName()
        {
            return name;
        }
        public void setName(String name)
        {
            this.name = name;
        }

        public double getPrice()
        {
            return price;
        }
        public void setPrice(double price)
        {
            this.price = price;
        }

        public int getQuantity()
        {
            return quantity;
        }
        public void setQuantity(int quantity)
        {
            this.quantity = quantity;
        }

        // toString method
        public String toString() {
            return "Product[itemNo=" + itemNo + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
        }

        public static void main(String[] args) {
            Product[] products = new Product[5];

            products[0] = new Product(1, "Pen", 10.5, 100);
            products[1] = new Product(2, "Notebook", 45.0, 50);
            products[2] = new Product(3, "Eraser", 5.0, 200);
            products[3] = new Product(4, "Pencil", 7.5, 150);
            products[4] = new Product(5, "Marker", 20.0, 80);

            for (Product p : products) {
                System.out.println(p.toString());
            }
        }
    }