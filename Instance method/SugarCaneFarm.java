class SugarCaneFarm{
    String farmerName;
    int totalCost;
    SugarCane sugarcane;
    String city = "Mandya";
    SugarCaneType type;

    SugarCaneFarm(String farmerName, int totalCost, SugarCane sugarcane, SugarCaneType type){
        this.farmerName = farmerName;
        this.totalCost = totalCost;
        this.sugarcane = sugarcane;
        this.type = type;
    }

    void showDetails() {
        System.out.println("Farmer: " + farmerName);
        System.out.println("Total Cost: " + totalCost);
        System.out.println("City: " + city);
        System.out.println("Type: " + type);

        if (sugarcane != null) {
            sugarcane.displayDetails();
        } else {
            System.out.println("No sugarcane details");
        }
    }
}