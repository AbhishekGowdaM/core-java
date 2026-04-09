class SwordService{

    String shopName;
    int quantity;
    String location;

    SwordService(String shopName, int quantity, String location) {
        this.shopName = shopName;
        this.quantity = quantity;
        this.location = location;
    }

    void displayServiceDetails() {
        System.out.println("Shop Name : " + this.shopName);
        System.out.println("Quantity : " + this.quantity);
        System.out.println("Location : " + this.location);
    }

    Sword createSword() {
        Sword sword = new Sword("Long Sword", "Steel", 7000);
        return sword;
    }
}