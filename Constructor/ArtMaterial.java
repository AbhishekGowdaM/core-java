class ArtMaterial{

    public String brand;
    private String type;
    public double cost;
    private String shade;
    public int stock;

    public ArtMaterial(){
        System.out.println("Default constructor called");
    }

    public ArtMaterial(String brand, String type, double cost){
        this.brand = brand;
        this.type = type;
        this.cost = cost;
    }

    private ArtMaterial(String brand, String type, String shade){
        this.brand = brand;
        this.type = type;
        this.shade = shade;
    }

    public ArtMaterial(String brand, String type, double cost, String shade){
        this.brand = brand;
        this.type = type;
        this.cost = cost;
        this.shade = shade;
    }

    private ArtMaterial(String brand, String type, double cost, String shade, int stock){
        this.brand = brand;
        this.type = type;
        this.cost = cost;
        this.shade = shade;
        this.stock = stock;
    }

    public void displayDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Cost: " + cost);
        System.out.println("Shade: " + shade);
        System.out.println("Stock: " + stock);
    }
}