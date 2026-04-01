class Engine{

    String engineType;
    int power;
    String fuel;
    String coolingSystem;
    String brandName;
    double cost;
    String modelId;
    String madeYear;
    String origin;
    String purpose;
    String buildMaterial;
    String cylinderType;
    String torqueValue;
    String engineCapacity;
    String ignitionSystem;
    String lubricationType;
    String guarantee;
    String mass;
    String size;
    String performance;
    String emissionType;
    String packing;
    String provider;
    boolean turboEnabled;
    boolean electricMode;
    String designType;

    public Engine() {
        engineType = "Diesel";
        power = 150;
        fuel = "Diesel";
        coolingSystem = "Water Cooled";
        brandName = "Bosch";
        cost = 75000.50;
        modelId = "ENG123";
        madeYear = "2025";
        origin = "India";
        purpose = "Automobile";
        buildMaterial = "Steel";
        cylinderType = "4 Cylinder";
        torqueValue = "300Nm";
        engineCapacity = "2000cc";
        ignitionSystem = "Compression";
        lubricationType = "Oil";
        guarantee = "3 Years";
        mass = "150kg";
        size = "Large";
        performance = "High";
        emissionType = "BS6";
        packing = "Box";
        provider = "Bosch Store";
        turboEnabled = true;
        electricMode = false;
        designType = "Modern";

        System.out.println("Engine constructor");
    }

    void display() {
        System.out.println("Type: " + engineType);
        System.out.println("Horsepower: " + power);
        System.out.println("Fuel Type: " + fuel);
        System.out.println("Cooling Type: " + coolingSystem);
        System.out.println("Brand: " + brandName);
        System.out.println("Price: " + cost);
        System.out.println("Model Number: " + modelId);
        System.out.println("Manufacturing Date: " + madeYear);
        System.out.println("Country: " + origin);
        System.out.println("Usage: " + purpose);
        System.out.println("Material: " + buildMaterial);
        System.out.println("Cylinder: " + cylinderType);
        System.out.println("Torque: " + torqueValue);
        System.out.println("Displacement: " + engineCapacity);
        System.out.println("Ignition Type: " + ignitionSystem);
        System.out.println("Lubrication: " + lubricationType);
        System.out.println("Warranty: " + guarantee);
        System.out.println("Weight: " + mass);
        System.out.println("Dimensions: " + size);
        System.out.println("Efficiency: " + performance);
        System.out.println("Emission Standard: " + emissionType);
        System.out.println("Packaging: " + packing);
        System.out.println("Supplier: " + provider);
        System.out.println("Turbo: " + turboEnabled);
        System.out.println("Electric: " + electricMode);
        System.out.println("Design: " + designType);
    }
}