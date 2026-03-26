class CapRunner{
public static void main(String[] args) {

        Cap nikeCap = new Cap();
        Cap pumaCap = new Cap();
        Cap adidasCap = new Cap();
        Cap reebokCap = new Cap();
        Cap filaCap = new Cap();

        System.out.println("Default values:");
        System.out.println("Brand: " + nikeCap.capBrand);
        System.out.println("Color: " + nikeCap.capColor);
        System.out.println("Price: " + nikeCap.capPrice);
        System.out.println("Size: " + nikeCap.capSize);
        System.out.println("Available: " + nikeCap.capAvailable);

        nikeCap.capBrand = "Nike";
        nikeCap.capColor = "Black";
        nikeCap.capPrice = 500;
        nikeCap.capSize = 42;
        nikeCap.capAvailable = true;

        System.out.println("Updated values:");
        System.out.println("Brand: " + nikeCap.capBrand);
        System.out.println("Color: " + nikeCap.capColor);
        System.out.println("Price: " + nikeCap.capPrice);
        System.out.println("Size: " + nikeCap.capSize);
        System.out.println("Available: " + nikeCap.capAvailable);
    }
}