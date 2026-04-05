class TyreRunner{
    public static void main(String[] args) {

        Tyre t1 = new Tyre();
        t1.displayDetails();

        Tyre t2 = new Tyre("MRF", "Car", 5000.0);
        t2.displayDetails();

        Tyre t3 = new Tyre("CEAT", "Bike", 2000.0);
        t3.displayDetails();

        Tyre t4 = new Tyre("Apollo", "Truck", 8000.0, "Black");
        t4.displayDetails();

        Tyre t5 = new Tyre("Bridgestone", "Premium", 10000.0, "Black");
        t5.displayDetails();
    }
}