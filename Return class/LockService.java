class LockService{

    String shopName;
    int quantity;
    String location;

    LockService(String shopName, int quantity, String location) {
        this.shopName = shopName;
        this.quantity = quantity;
        this.location = location;
    }

    void displayServiceDetails(){
        System.out.println("Shop Name : " + this.shopName);
        System.out.println("Quantity : " + this.quantity);
        System.out.println("Location : " + this.location);
    }

    Lock createLock(){
        Lock lock = new Lock("Godrej", "Door Lock", 500);
        return lock;
    }
}