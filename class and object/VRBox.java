class VRBox{

    String brand;
    double price;
    String lensType;
    double weight;
    String color;
    String compatibility;
    boolean isWireless;
    int batteryLife;
    double fieldOfView;
    String origin;

    public VRBox(String brand, double price, String lensType, double weight,
                 String color, String compatibility, boolean isWireless,
                 int batteryLife, double fieldOfView, String origin){

        this.brand = brand;
        this.price = price;
        this.lensType = lensType;
        this.weight = weight;
        this.color = color;
        this.compatibility = compatibility;
        this.isWireless = isWireless;
        this.batteryLife = batteryLife;
        this.fieldOfView = fieldOfView;
        this.origin = origin;
    }
}