class DiamondService{

    String shopName;
    int quantity;
    String location;

    DiamondService(String shopName, int quantity, String location) {
        this.shopName = shopName;
        this.quantity = quantity;
        this.location = location;
    }

    void displayServiceDetails(){
        System.out.println("Shop Name : " + this.shopName);
        System.out.println("Quantity : " + this.quantity);
        System.out.println("Location : " + this.location);
    }

    Diamond createDiamond(){
        Diamond diamond = new Diamond("Natural", "White", 50000);
        return diamond;
    }
}