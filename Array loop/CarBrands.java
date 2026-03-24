class CarBrands{
public static void main(String[] args) {
        String[] cars = {"BMW", "Audi", "Tesla", "Honda", "Hyundai",
            "Toyota", "Ford", "Kia", "Nissan", "Chevrolet",
            "Volkswagen", "Skoda", "Mahindra", "Tata", "Jeep",
            "Volvo", "Jaguar", "Porsche", "Ferrari", "Lamborghini",
            "Bentley", "Rolls Royce", "Mini", "Land Rover", "Suzuki"  
        };

        cars[2] = "Kia";

        for (int pos = 0; pos < cars.length; pos++) {
            System.out.println(cars[pos]);
        }

        System.out.println("\n");

        for (int pos = cars.length - 1; pos >= 0; pos--) {
            System.out.println(cars[pos]);
        }

        System.out.println("\n");

        try {
            System.out.println(cars[40]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index does not exist");
        }
    }
}