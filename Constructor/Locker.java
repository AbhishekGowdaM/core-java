class Locker{

    public String brand;
    private String type;
    public double price;
    private String color;
    public int capacity;

    public Locker(){
        System.out.println("Default constructor called");
    }

    public Locker(String brand, String type, double price){
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    private Locker(String brand, String type, String color){
        this.brand = brand;
        this.type = type;
        this.color = color;
    }

    public Locker(String brand, String type, double price, String color){
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.color = color;
    }

    private Locker(String brand, String type, double price, String color, int capacity){
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.color = color;
        this.capacity = capacity;
    }

    public void displayDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Capacity: " + capacity);
    }
}