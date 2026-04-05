class InkPadRunner{
    public static void main(String[] args) {

        InkPad i1 = new InkPad();
        i1.displayDetails();

        InkPad i2 = new InkPad("Camel", "Stamp", 120.0);
        i2.displayDetails();

        InkPad i3 = new InkPad("Faber", "Office", 150.0);
        i3.displayDetails();

        InkPad i4 = new InkPad("Doms", "School", 200.0, "Blue");
        i4.displayDetails();

        InkPad i5 = new InkPad("Classmate", "Premium", 250.0, "Black");
        i5.displayDetails();
    }
}