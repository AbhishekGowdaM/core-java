class Boomer{

    public String name;
    private String category;
    public double price;
    private String color;
    public int quantity;

    public Boomer(){
        System.out.println("Default constructor called");
    }

    public Boomer(String name, String category, double price){
        this.name = name;
        this.category = category;
        this.price = price;
    }

    private Boomer(String name, String category, String color){
        this.name = name;
        this.category = category;
        this.color = color;
    }

    public Boomer(String name, String category, double price, String color){
        this.name = name;
        this.category = category;
        this.price = price;
        this.color = color;
    }

    private Boomer(String name, String category, double price, String color, int quantity) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Quantity: " + quantity);
    }
}