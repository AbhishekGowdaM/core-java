class AcidService{

    String labName;
    int quantity;
    String location;

    AcidService(String labName, int quantity, String location) {
        this.labName = labName;
        this.quantity = quantity;
        this.location = location;
    }

    void displayServiceDetails() {
        System.out.println("Lab Name : " + this.labName);
        System.out.println("Quantity : " + this.quantity);
        System.out.println("Location : " + this.location);
    }

    Acid createAcid() {
        Acid acid = new Acid("Sulfuric Acid", "Strong", 98);
        return acid;
    }
}