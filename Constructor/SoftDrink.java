class SoftDrink{

    public String brand;
    private String flavor;
    public double price;
    private String color;
    public int quantity;

    public SoftDrink(){
        System.out.println("Default constructor called");
    }

    public SoftDrink(String brand, String flavor, double price){
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
    }

    private SoftDrink(String brand, String flavor, String color){
        this.brand = brand;
        this.flavor = flavor;
        this.color = color;
    }

    public SoftDrink(String brand, String flavor, double price, String color){
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
        this.color = color;
    }

    private SoftDrink(String brand, String flavor, double price, String color, int quantity){
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    public void displayDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Flavor: " + flavor);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Quantity: " + quantity);
    }
}