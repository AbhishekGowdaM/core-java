class CapRunner{
    public static void main(String[] args){

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

        System.out.println("Brand: " + pumaCap.capBrand);
        System.out.println("Color: " + pumaCap.capColor);
        System.out.println("Price: " + pumaCap.capPrice);
        System.out.println("Size: " + pumaCap.capSize);
        System.out.println("Available: " + pumaCap.capAvailable);

        System.out.println("Brand: " + adidasCap.capBrand);
        System.out.println("Color: " + adidasCap.capColor);
        System.out.println("Price: " + adidasCap.capPrice);
        System.out.println("Size: " + adidasCap.capSize);
        System.out.println("Available: " + adidasCap.capAvailable);

        System.out.println("Brand: " + reebokCap.capBrand);
        System.out.println("Color: " + reebokCap.capColor);
        System.out.println("Price: " + reebokCap.capPrice);
        System.out.println("Size: " + reebokCap.capSize);
        System.out.println("Available: " + reebokCap.capAvailable);

        System.out.println("Brand: " + filaCap.capBrand);
        System.out.println("Color: " + filaCap.capColor);
        System.out.println("Price: " + filaCap.capPrice);
        System.out.println("Size: " + filaCap.capSize);
        System.out.println("Available: " + filaCap.capAvailable);

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