class FishTank{

    String material;
    double capacity;
    double weight;
    String color;
    boolean hasFilter;
    int price;
    String brand;
    String shape;
    String origin;
    boolean hasLight;

    public FishTank(String material, double capacity, double weight, String color,
                    boolean hasFilter, int price, String brand, String shape,
                    String origin, boolean hasLight){

        this.material = material;
        this.capacity = capacity;
        this.weight = weight;
        this.color = color;
        this.hasFilter = hasFilter;
        this.price = price;
        this.brand = brand;
        this.shape = shape;
        this.origin = origin;
        this.hasLight = hasLight;
    }
}