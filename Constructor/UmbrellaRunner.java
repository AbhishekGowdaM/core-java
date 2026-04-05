class UmbrellaRunner{
    public static void main(String[] args) {

        Umbrella u1 = new Umbrella();
        u1.displayDetails();

        Umbrella u2 = new Umbrella("Popy", "Rain", 300.0);
        u2.displayDetails();

        Umbrella u3 = new Umbrella("Skyline", "Foldable", 500.0);
        u3.displayDetails();

        Umbrella u4 = new Umbrella("VIP", "Automatic", 800.0, "Black");
        u4.displayDetails();

        Umbrella u5 = new Umbrella("Johns", "Premium", 1200.0, "Blue");
        u5.displayDetails();
    }
}