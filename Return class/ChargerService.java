class ChargerService{

    String shopName;
    int quantity;
    String location;

    ChargerService(String shopName, int quantity, String location) {
        this.shopName = shopName;
        this.quantity = quantity;
        this.location = location;
    }

    void displayServiceDetails(){
        System.out.println("Shop Name : " + this.shopName);
        System.out.println("Quantity : " + this.quantity);
        System.out.println("Location : " + this.location);
    }

    Charger createCharger(){
        Charger charger = new Charger("Samsung", "Fast Charger", 25);
        return charger;
    }
}