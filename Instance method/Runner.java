class Runner{
    public static void main(String[] args) {

        SolarPanel solarpanel = new SolarPanel(500, 50);
        SolarSetup setup = new SolarSetup("Tata",90000,solarpanel,PanelType.COMMERCIAL);
        setup.showDetails();
    }
}