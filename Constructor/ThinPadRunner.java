class ThinPadRunner{
    public static void main(String[] args) {

        ThinPad t1 = new ThinPad();
        t1.displayDetails();

        ThinPad t2 = new ThinPad("Lenovo", "Laptop", 70000.0);
        t2.displayDetails();

        ThinPad t3 = new ThinPad("HP", "Notebook", 60000.0);
        t3.displayDetails();

        ThinPad t4 = new ThinPad("Dell", "Ultrabook", 80000.0, "Silver");
        t4.displayDetails();

        ThinPad t5 = new ThinPad("Asus", "Slim", 75000.0, "Black");
        t5.displayDetails();
    }
}