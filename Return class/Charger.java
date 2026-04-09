class Charger{

    String brand;
    String type;
    int power;

    Charger(String brand, String type, int power) {
        this.brand = brand;
        this.type = type;
        this.power = power;
    }

    void displayCharger(){
        System.out.println("Brand : " + this.brand);
        System.out.println("Type : " + this.type);
        System.out.println("Power : " + this.power);
    }
}