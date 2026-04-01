class Wheel{

    double radius;
    String material;
    double weight;
    String color;
    String type;
    int price;
    String brand;
    double thickness;
    boolean isTubeless;
    String origin;

    public Wheel(double radius, String material, double weight, String color,
                 String type, int price, String brand, double thickness,
                 boolean isTubeless, String origin) {

        this.radius = radius;
        this.material = material;
        this.weight = weight;
        this.color = color;
        this.type = type;
        this.price = price;
        this.brand = brand;
        this.thickness = thickness;
        this.isTubeless = isTubeless;
        this.origin = origin;
    }
}