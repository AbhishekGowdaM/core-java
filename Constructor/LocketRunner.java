class LocketRunner{
    public static void main(String[] args){

        Locket l1 = new Locket();
        l1.displayDetails();

        Locket l2 = new Locket("Tanishq", "Gold", 25000.0);
        l2.displayDetails();

        Locket l3 = new Locket("Malabar", "Silver", 15000.0);
        l3.displayDetails();

        Locket l4 = new Locket("Kalyan", "Diamond", 50000.0, "Golden");
        l4.displayDetails();

        Locket l5 = new Locket("JoyAlukkas", "Premium", 75000.0, "Shiny");
        l5.displayDetails();
    }
}