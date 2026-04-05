class RocketRunner{
    public static void main(String[] args) {

        Rocket r1 = new Rocket();
        r1.displayDetails();

        Rocket r2 = new Rocket("Falcon", "Space", 5000000.0);
        r2.displayDetails();

        Rocket r3 = new Rocket("PSLV", "Satellite", 3000000.0);
        r3.displayDetails();

        Rocket r4 = new Rocket("GSLV", "Launch", 7000000.0, "White");
        r4.displayDetails();

        Rocket r5 = new Rocket("Starship", "Heavy", 9000000.0, "Silver");
        r5.displayDetails();
    }
}