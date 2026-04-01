class Clock{

    String brandName;
    String clockCategory;
    String bodyColor;
    double cost;
    String screenType;
    String buildMaterial;
    String bodyShape;
    String energySource;
    boolean digitalType;
    boolean alarmFeature;
    String format;
    String modelId;
    String madeYear;
    String madeIn;
    String purpose;
    String guarantee;
    String mass;
    String dimension;
    String cellType;
    String style;
    String packingType;
    String provider;
    String tickSound;
    String glassMaterial;
    boolean waterProof;
    String installationType;

    public Clock(){
        brandName = "Titan";
        clockCategory = "Wall Clock";
        bodyColor = "Black";
        cost = 1500.50;
        screenType = "Analog";
        buildMaterial = "Plastic";
        bodyShape = "Round";
        energySource = "Battery";
        digitalType = false;
        alarmFeature = false;
        format = "12 Hour";
        modelId = "CLK123";
        madeYear = "2025";
        madeIn = "India";
        purpose = "Home";
        guarantee = "1 Year";
        mass = "500g";
        dimension = "30cm";
        cellType = "AA";
        style = "Classic";
        packingType = "Box";
        provider = "Titan Store";
        tickSound = "Tick";
        glassMaterial = "Normal";
        waterProof = false;
        installationType = "Wall";

        System.out.println("Clock constructor");
    }

    void display() {
        System.out.println("Brand: " + brandName);
        System.out.println("Type: " + clockCategory);
        System.out.println("Color: " + bodyColor);
        System.out.println("Price: " + cost);
        System.out.println("Display: " + screenType);
        System.out.println("Material: " + buildMaterial);
        System.out.println("Shape: " + bodyShape);
        System.out.println("Power Source: " + energySource);
        System.out.println("Digital: " + digitalType);
        System.out.println("Alarm: " + alarmFeature);
        System.out.println("Time Format: " + format);
        System.out.println("Model: " + modelId);
        System.out.println("Manufacture Year: " + madeYear);
        System.out.println("Country: " + madeIn);
        System.out.println("Usage: " + purpose);
        System.out.println("Warranty: " + guarantee);
        System.out.println("Weight: " + mass);
        System.out.println("Dimensions: " + dimension);
        System.out.println("Battery Type: " + cellType);
        System.out.println("Design: " + style);
        System.out.println("Packaging: " + packingType);
        System.out.println("Supplier: " + provider);
        System.out.println("Sound Type: " + tickSound);
        System.out.println("Glass Type: " + glassMaterial);
        System.out.println("Water Resistant: " + waterProof);
        System.out.println("Mount Type: " + installationType);
    }
}