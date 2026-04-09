class BurgerService{

    String shopName;
    int orderQuantity;
    String location;

    BurgerService(String shopName, int orderQuantity, String location) {
        this.shopName = shopName;
        this.orderQuantity = orderQuantity;
        this.location = location;
    }

    void displayShopDetails(){
        System.out.println("Shop Name : " + this.shopName);
        System.out.println("Order Quantity : " + this.orderQuantity);
        System.out.println("Location : " + this.location);
    }

    Burger createBurger(){
        Burger burger = new Burger("Veg", "Paneer", 150);
        return burger;
    }
}