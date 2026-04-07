class SolarSetup{
    String companyName;
    int cost;
    SolarPanel panel;
    String origincountry = "India";
    PanelType type;

    SolarSetup(String companyName, int cost, SolarPanel panel, PanelType type){
        this.companyName = companyName;
        this.cost = cost;
        this.panel = panel;
        this.type = type;
    }

    void showDetails() {
        System.out.println("Compny: " + companyName);
        System.out.println("Cost: " + cost);
        System.out.println("OriginCountry: " + origincountry);
        System.out.println("Panel Type: " + type);

        if (panel != null) {
            panel.displayDetails();
        } else {
            System.out.println("No panel details");
        }
    }
}