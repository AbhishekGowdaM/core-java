class Sword{

    String type;
    String material;
    int price;

    Sword(String type, String material, int price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    void displaySword() {
        System.out.println("Type : " + this.type);
        System.out.println("Material : " + this.material);
        System.out.println("Price : " + this.price);
    }
}