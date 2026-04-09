class FlowerService{

    String shopName;
    int quantity;
    String location;

    FlowerService(String shopName, int quantity, String location) {
        this.shopName = shopName;
        this.quantity = quantity;
        this.location = location;
    }

    void displayServiceDetails() {
        System.out.println("Shop Name : " + this.shopName);
        System.out.println("Quantity : " + this.quantity);
        System.out.println("Location : " + this.location);
    }

    Flower createFlower() {
        Flower flower = new Flower("Rose", "Red", 20);
        return flower;
    }
}