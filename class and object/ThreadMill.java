class ThreadMill{

    String brand;
    double speed;
    double weightCapacity;
    String color;
    int price;
    boolean isAutomatic;
    double inclineLevel;
    String type;
    String origin;
    boolean hasDisplay;

    public ThreadMill(String brand, double speed, double weightCapacity, String color,
                      int price, boolean isAutomatic, double inclineLevel,
                      String type, String origin, boolean hasDisplay) {

        this.brand = brand;
        this.speed = speed;
        this.weightCapacity = weightCapacity;
        this.color = color;
        this.price = price;
        this.isAutomatic = isAutomatic;
        this.inclineLevel = inclineLevel;
        this.type = type;
        this.origin = origin;
        this.hasDisplay = hasDisplay;
    }
}