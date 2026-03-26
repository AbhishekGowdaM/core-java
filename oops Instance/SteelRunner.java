class SteelRunner{

    public static void main(String[] args) {

        Steel steel1 = new Steel();
        Steel steel2 = new Steel();
        Steel steel3 = new Steel();
        Steel steel4 = new Steel();
        Steel steel5 = new Steel();

        System.out.println("Default values:");
        System.out.println("Type: " + steel1.type);
        System.out.println("Brand: " + steel1.brand);
        System.out.println("Price: " + steel1.price);
        System.out.println("Weight: " + steel1.weight);
        System.out.println("Available: " + steel1.available);

        steel1.type = "Alloy";
        steel1.brand = "Tata";
        steel1.price = 500;
        steel1.weight = 50;
        steel1.available = true;

        System.out.println("updated Values:");

        System.out.println("Type: " + steel1.type);
        System.out.println("Brand: " + steel1.brand);
        System.out.println("Price: " + steel1.price);
        System.out.println("Weight: " + steel1.weight);
        System.out.println("Available: " + steel1.available);
    }
}