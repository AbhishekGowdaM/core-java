class SandService{

    String supplierName;
    int quantity;
    String location;

    SandService(String supplierName, int quantity, String location) {
        this.supplierName = supplierName;
        this.quantity = quantity;
        this.location = location;
    }

    void displayServiceDetails() {
        System.out.println("Supplier Name : " + this.supplierName);
        System.out.println("Quantity : " + this.quantity);
        System.out.println("Location : " + this.location);
    }

    Sand createSand() {
        Sand sand = new Sand("River Sand", "Brown", 3000);
        return sand;
    }
}