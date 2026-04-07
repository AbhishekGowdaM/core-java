class SolarPanel{
    int wattage;
    double efficiency;

    SolarPanel(int wattage, double efficiency) {
        this.wattage = wattage;
        this.efficiency = efficiency;
    }

    void displayDetails() {
        System.out.println("Wattage: " + wattage + " W");
        System.out.println("Efficiency: " + efficiency + " %");
    }
}