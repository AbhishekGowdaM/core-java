class Ethernet{

    String cableBrand = "DLink";
    String cableCategory = "Cat6";
    int speedMbps = 1000;
    double performanceLevel = 8.5;
    boolean supportsGigabit = true;

    String cableColor;
    int cableLengthMeters;
    int connectorCount;
    int bandwidthMHz;
    double cableWeight;
    boolean isShielded;
    String usageType;
    int warrantyYears;
    String originCountry;
    double price;

    public Ethernet() {
        System.out.println("Ethernet object created");
    }
}