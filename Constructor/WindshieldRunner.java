class WindshieldRunner{
    public static void main(String[] args) {

        Windshield w1 = new Windshield();
        w1.displayDetails();

        Windshield w2 = new Windshield("SaintGobain", "Car", 5000.0);
        w2.displayDetails();

        Windshield w3 = new Windshield("Asahi", "Bike", 2000.0);
        w3.displayDetails();

        Windshield w4 = new Windshield("AIS", "SUV", 8000.0, "Transparent");
        w4.displayDetails();

        Windshield w5 = new Windshield("Pilkington", "Premium", 12000.0, "Clear");
        w5.displayDetails();
    }
}