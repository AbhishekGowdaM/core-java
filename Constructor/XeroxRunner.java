class XeroxRunner{
    public static void main(String[] args) {

        Xerox x1 = new Xerox();
        x1.displayDetails();

        Xerox x2 = new Xerox("Canon", "Printer", 15000.0);
        x2.displayDetails();

        Xerox x3 = new Xerox("HP", "Photocopier", 20000.0);
        x3.displayDetails();

        Xerox x4 = new Xerox("Epson", "All-in-One", 18000.0, "White");
        x4.displayDetails();

        Xerox x5 = new Xerox("Brother", "Laser", 25000.0, "Black");
        x5.displayDetails();
    }
}