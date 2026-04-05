class Locket{

    public String brand;
    private String type;
    public double price;
    private String color;
    public int quantity;

    public Locket(){
        System.out.println("Default constructor called");
    }

    public Locket(String brand, String type, double price){
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    private Locket(String brand, String type, String color){
        this.brand = brand;
        this.type = type;
        this.color = color;
    }

    public Locket(String brand, String type, double price, String color){
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.color = color;
    }

    private Locket(String brand, String type, double price, String color, int quantity){
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    public void displayDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Quantity: " + quantity);
    }
}