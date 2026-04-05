class Rocket{

    public String name;
    private String type;
    public double price;
    private String color;
    public int quantity;

    public Rocket(){
        System.out.println("Default constructor called");
    }

    public Rocket(String name, String type, double price){
        this.name = name;
        this.type = type;
        this.price = price;
    }

    private Rocket(String name, String type, String color){
        this.name = name;
        this.type = type;
        this.color = color;
    }

    public Rocket(String name, String type, double price, String color){
        this.name = name;
        this.type = type;
        this.price = price;
        this.color = color;
    }

    private Rocket(String name, String type, double price, String color, int quantity){
        this.name = name;
        this.type = type;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Quantity: " + quantity);
    }
}