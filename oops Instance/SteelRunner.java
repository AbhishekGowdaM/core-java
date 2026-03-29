class SteelRunner{
    public static void main(String[] args){

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

        System.out.println("Type: " + steel2.type);
        System.out.println("Brand: " + steel2.brand);
        System.out.println("Price: " + steel2.price);
        System.out.println("Weight: " + steel2.weight);
        System.out.println("Available: " + steel2.available);

        System.out.println("Type: " + steel3.type);
        System.out.println("Brand: " + steel3.brand);
        System.out.println("Price: " + steel3.price);
        System.out.println("Weight: " + steel3.weight);
        System.out.println("Available: " + steel3.available);

        System.out.println("Type: " + steel4.type);
        System.out.println("Brand: " + steel4.brand);
        System.out.println("Price: " + steel4.price);
        System.out.println("Weight: " + steel4.weight);
        System.out.println("Available: " + steel4.available);

        System.out.println("Type: " + steel5.type);
        System.out.println("Brand: " + steel5.brand);
        System.out.println("Price: " + steel5.price);
        System.out.println("Weight: " + steel5.weight);
        System.out.println("Available: " + steel5.available);

        steel1.type = "Alloy";
        steel1.brand = "Tata";
        steel1.price = 500;
        steel1.weight = 50;
        steel1.available = true;

        System.out.println("Updated values:");

        System.out.println("Type: " + steel1.type);
        System.out.println("Brand: " + steel1.brand);
        System.out.println("Price: " + steel1.price);
        System.out.println("Weight: " + steel1.weight);
        System.out.println("Available: " + steel1.available);
    }
}