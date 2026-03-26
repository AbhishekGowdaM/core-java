class CupRunner {
public static void main(String[] args) {

        Cup steelCup = new Cup();
        Cup glassCup = new Cup();
        Cup plasticCup = new Cup();
        Cup ceramicCup = new Cup();
        Cup paperCup = new Cup();

        System.out.println("Default values:");
        System.out.println("Material: " + steelCup.cupMaterial);
        System.out.println("Brand: " + steelCup.cupBrand);
        System.out.println("Price: " + steelCup.cupPrice);
        System.out.println("Capacity: " + steelCup.cupCapacity);
        System.out.println("In Stock: " + steelCup.cupInStock);

        steelCup.cupMaterial = "Steel";
        steelCup.cupBrand = "Tata";
        steelCup.cupPrice = 100;
        steelCup.cupCapacity = 250;
        steelCup.cupInStock = true;

        System.out.println("Updated values:");
        System.out.println("Material: " + steelCup.cupMaterial);
        System.out.println("Brand: " + steelCup.cupBrand);
        System.out.println("Price: " + steelCup.cupPrice);
        System.out.println("Capacity: " + steelCup.cupCapacity);
        System.out.println("In Stock: " + steelCup.cupInStock);
    }
}