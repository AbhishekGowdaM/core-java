class StampRunner{
    public static void main(String[] args) {

        Stamp s1 = new Stamp();
        s1.displayDetails();

        Stamp s2 = new Stamp("IndiaPost", "Postal", 10.0);
        s2.displayDetails();

        Stamp s3 = new Stamp("Heritage", "Collectible", 50.0);
        s3.displayDetails();

        Stamp s4 = new Stamp("Official", "Office", 100.0, "Blue");
        s4.displayDetails();

        Stamp s5 = new Stamp("Premium", "Special", 200.0, "Red");
        s5.displayDetails();
    }
}