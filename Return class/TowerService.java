class TowerService{

    String companyName;
    int quantity;
    String area;

    TowerService(String companyName, int quantity, String area) {
        this.companyName = companyName;
        this.quantity = quantity;
        this.area = area;
    }

    void displayServiceDetails(){
        System.out.println("Company Name : " + this.companyName);
        System.out.println("Quantity : " + this.quantity);
        System.out.println("Area : " + this.area);
    }

    Tower createTower(){
        Tower tower = new Tower("Signal Tower", "City Center", 200);
        return tower;
    }
}