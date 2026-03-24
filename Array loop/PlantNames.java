class PlantNames{
    public static void main(String[] args) {
        String[] plants = {"Neem", "Tulsi", "Rose", "Aloe Vera", "Bamboo",
            "Cactus", "Sunflower", "Lily", "Jasmine", "Hibiscus",
            "Mint", "Coriander", "Spinach", "Fern", "Orchid",
            "Lavender", "Marigold", "Peepal", "Banana", "Mango",
            "Apple", "Guava", "Papaya", "Coconut", "Teak",
            "Pine", "Oak", "Maple", "Grass", "Lotus" 
        };

        plants[3] = "Amla";

        for (int pos = 0; pos < plants.length; pos++) {
            System.out.println(plants[pos]);
        }

        System.out.print("\n");

        for (int pos = plants.length - 1; pos >= 0; pos--) {
            System.out.println(plants[pos]);
        }

        System.out.print("\n");

        try {
            System.out.println(plants[40]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index does not exist");
        }
    }
}