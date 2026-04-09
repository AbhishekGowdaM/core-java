class Sand{

    String type;
    String color;
    int price;

    Sand(String type, String color, int price) {
        this.type = type;
        this.color = color;
        this.price = price;
    }

    void displaySand() {
        System.out.println("Type : " + this.type);
        System.out.println("Color : " + this.color);
        System.out.println("Price : " + this.price);
    }
}