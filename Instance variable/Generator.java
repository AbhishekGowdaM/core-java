class Generator{

    String fuel;
    int loadCapacity;
    String brandName;
    double cost;
    String modelId;
    String bodyColor;
    String phaseType;
    String coolingSystem;
    String ignitionType;
    String outputVoltage;
    String frequencyRate;
    String engineCategory;
    int outputPower;
    String soundLevel;
    String tankSize;
    String runningTime;
    String buildMaterial;
    String purpose;
    String guarantee;
    String madeYear;
    String originCountry;
    String panelType;
    boolean portable;
    boolean electricStart;
    String packing;
    String provider;

    public Generator(){
        fuel = "Petrol";
        loadCapacity = 5000;
        brandName = "Honda";
        cost = 45000.75;
        modelId = "GEN5000";
        bodyColor = "Red";
        phaseType = "Single Phase";
        coolingSystem = "Air Cooled";
        ignitionType = "Manual";
        outputVoltage = "230V";
        frequencyRate = "50Hz";
        engineCategory = "4 Stroke";
        outputPower = 4500;
        soundLevel = "70dB";
        tankSize = "15L";
        runningTime = "8 hours";
        buildMaterial = "Metal";
        purpose = "Home Backup";
        guarantee = "2 Years";
        madeYear = "2025";
        originCountry = "India";
        panelType = "Digital";
        portable = true;
        electricStart = false;
        packing = "Box";
        provider = "Honda Store";

        System.out.println("Generator constructor");
    }

    void display() {
        System.out.println("Fuel Type: " + fuel);
        System.out.println("Capacity: " + loadCapacity);
        System.out.println("Brand: " + brandName);
        System.out.println("Price: " + cost);
        System.out.println("Model Number: " + modelId);
        System.out.println("Color: " + bodyColor);
        System.out.println("Phase: " + phaseType);
        System.out.println("Cooling Type: " + coolingSystem);
        System.out.println("Start Type: " + ignitionType);
        System.out.println("Voltage: " + outputVoltage);
        System.out.println("Frequency: " + frequencyRate);
        System.out.println("Engine Type: " + engineCategory);
        System.out.println("Power Output: " + outputPower);
        System.out.println("Noise Level: " + soundLevel);
        System.out.println("Fuel Tank Capacity: " + tankSize);
        System.out.println("Runtime: " + runningTime);
        System.out.println("Material: " + buildMaterial);
        System.out.println("Usage: " + purpose);
        System.out.println("Warranty: " + guarantee);
        System.out.println("Manufacturing Date: " + madeYear);
        System.out.println("Country: " + originCountry);
        System.out.println("Control Panel: " + panelType);
        System.out.println("Portable: " + portable);
        System.out.println("Electric Start: " + electricStart);
        System.out.println("Packaging: " + packing);
        System.out.println("Supplier: " + provider);
    }
}