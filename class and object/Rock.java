class Rock{

    String type;
    double weight;
    String color;
    String texture;
    int price;
    String origin;
    boolean isPrecious;
    double hardness;
    String shape;
    boolean isPolished;

    public Rock(String type, double weight, String color, String texture,
                int price, String origin, boolean isPrecious,
                double hardness, String shape, boolean isPolished) {

        this.type = type;
        this.weight = weight;
        this.color = color;
        this.texture = texture;
        this.price = price;
        this.origin = origin;
        this.isPrecious = isPrecious;
        this.hardness = hardness;
        this.shape = shape;
        this.isPolished = isPolished;
    }
}