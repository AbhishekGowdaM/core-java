class GraphicCard{

    String chipsetType = "RTX";
    String manufacturer = "NVIDIA";
    int heatTemperature = 70;
    double performanceLevel = 8.5;
    boolean supportsRayTracing = true;

    String modelName;
    int coreClockSpeed;
    int memoryBusWidth;
    int powerConsumption;
    double cardWeight;
    boolean isOverclocked;
    String coolingSystem;
    int warrantyYears;
    String originCountry;
    double price;

    public GraphicCard() {
        System.out.println("GraphicCard object created");
    }
}