class SpecsRunner{
    public static void main(String[] args) {

        Specs s1 = new Specs();
        s1.displayDetails();

        Specs s2 = new Specs("RayBan", "Sunglasses", 5000.0);
        s2.displayDetails();

        Specs s3 = new Specs("Fastrack", "Eyeglass", 3000.0);
        s3.displayDetails();

        Specs s4 = new Specs("Oakley", "Sports", 7000.0, "Black");
        s4.displayDetails();

        Specs s5 = new Specs("Titan", "Premium", 9000.0, "Brown");
        s5.displayDetails();
    }
}