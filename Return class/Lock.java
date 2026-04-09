class Lock{

    String brand;
    String type;
    int price;

    Lock(String brand, String type, int price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    void displayLock(){
        System.out.println("Brand : " + this.brand);
        System.out.println("Type : " + this.type);
        System.out.println("Price : " + this.price);
    }
}