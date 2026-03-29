class CupRunner{
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

        System.out.println("Material: " + glassCup.cupMaterial);
        System.out.println("Brand: " + glassCup.cupBrand);
        System.out.println("Price: " + glassCup.cupPrice);
        System.out.println("Capacity: " + glassCup.cupCapacity);
        System.out.println("In Stock: " + glassCup.cupInStock);

        System.out.println("Material: " + plasticCup.cupMaterial);
        System.out.println("Brand: " + plasticCup.cupBrand);
        System.out.println("Price: " + plasticCup.cupPrice);
        System.out.println("Capacity: " + plasticCup.cupCapacity);
        System.out.println("In Stock: " + plasticCup.cupInStock);

        System.out.println("Material: " + ceramicCup.cupMaterial);
        System.out.println("Brand: " + ceramicCup.cupBrand);
        System.out.println("Price: " + ceramicCup.cupPrice);
        System.out.println("Capacity: " + ceramicCup.cupCapacity);
        System.out.println("In Stock: " + ceramicCup.cupInStock);

        System.out.println("Material: " + paperCup.cupMaterial);
        System.out.println("Brand: " + paperCup.cupBrand);
        System.out.println("Price: " + paperCup.cupPrice);
        System.out.println("Capacity: " + paperCup.cupCapacity);
        System.out.println("In Stock: " + paperCup.cupInStock);

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