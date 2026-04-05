class BoomerRunner{
    public static void main(String[] args){

        Boomer b1 = new Boomer();
        b1.displayDetails();

        Boomer b2 = new Boomer("SuperBoom", "Toy", 120.0);
        b2.displayDetails();

        Boomer b3 = new Boomer("MegaBoom", "Game", 250.0);
        b3.displayDetails();

        Boomer b4 = new Boomer("UltraBoom", "Outdoor", 400.0, "Red");
        b4.displayDetails();

        Boomer b5 = new Boomer("PowerBoom", "Sports", 300.0, "Blue");
        b5.displayDetails();
    }
}