class Router{

    String routerBrand = "TP-Link";
    String frequencyBand = "Dual Band";
    int speedMbps = 1200;
    double performanceLevel = 8.5;
    boolean supportsWifi6 = true;

    String routerColor;
    int antennaCount;
    int lanPortCount;
    int wanPortCount;
    double routerWeight;
    boolean isPortable;
    String usageType;
    int warrantyYears;
    String originCountry;
    double price;

    public Router() {
        System.out.println("Router object created");
    }
}