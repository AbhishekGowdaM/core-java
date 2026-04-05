class ChainRunner{
    public static void main(String[] args) {

        Chain c1 = new Chain();
        c1.displayDetails();

        Chain c2 = new Chain("GoldChain", "Jewelry", 15000.0);
        c2.displayDetails();

        Chain c3 = new Chain("SilverChain", "Jewelry", 20000.0);
        c3.displayDetails();

        Chain c4 = new Chain("PlatinumChain", "Luxury", 50000.0, "Silver");
        c4.displayDetails();

        Chain c5 = new Chain("DiamondChain", "Premium", 100000.0, "Shiny");
        c5.displayDetails();
    }
}