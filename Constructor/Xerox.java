class Xerox{

    public String brand;
    private String type;
    public double price;
    private String color;
    public int quantity;

    public Xerox(){
        System.out.println("Default constructor called");
    }

    public Xerox(String brand, String type, double price){
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    private Xerox(String brand, String type, String color){
        this.brand = brand;
        this.type = type;
        this.color = color;
    }

    public Xerox(String brand, String type, double price, String color){
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.color = color;
    }

    private Xerox(String brand, String type, double price, String color, int quantity){
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