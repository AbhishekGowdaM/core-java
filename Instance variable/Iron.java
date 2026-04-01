class Iron{

    String category;
    int wattage;
    String brandName;
    String bodyColor;
    double cost;
    String buildMaterial;
    boolean steamSupport;
    boolean portable;
    String tempControl;
    String plateType;
    String wireType;
    int mass;
    String powerVoltage;
    String guarantee;
    String productId;
    String madeYear;
    String origin;
    String purpose;
    String tankCapacity;
    String heatingTime;
    String safetyType;
    String style;
    String packing;
    String provider;
    boolean autoOff;
    String indicator;

   public Iron() {
        category = "Steam";
        wattage = 1000;
        brandName = "Philips";
        bodyColor = "Blue";
        cost = 2500.75;
        buildMaterial = "Plastic";
        steamSupport = true;
        portable = true;
        tempControl = "Adjustable";
        plateType = "Ceramic";
        wireType = "360 Swivel";
        mass = 2;
        powerVoltage = "220V";
        guarantee = "2 Years";
        productId = "PH1234";
        madeYear = "2025";
        origin = "India";
        purpose = "Home";
        tankCapacity = "300ml";
        heatingTime = "30 sec";
        safetyType = "Overheat Protection";
        style = "Modern";
        packing = "Box";
        provider = "Philips Store";
        autoOff = true;
        indicator = "LED";

        System.out.println("Iron constructor");
    }

    void display() {
        System.out.println("Type: " + category);
        System.out.println("Power: " + wattage);
        System.out.println("Brand: " + brandName);
        System.out.println("Color: " + bodyColor);
        System.out.println("Price: " + cost);
        System.out.println("Material: " + buildMaterial);
        System.out.println("Steam: " + steamSupport);
        System.out.println("Portable: " + portable);
        System.out.println("Temperature Control: " + tempControl);
        System.out.println("Soleplate Type: " + plateType);
        System.out.println("Cord Type: " + wireType);
        System.out.println("Weight: " + mass);
        System.out.println("Voltage: " + powerVoltage);
        System.out.println("Warranty: " + guarantee);
        System.out.println("Model Number: " + productId);
        System.out.println("Manufacturing Date: " + madeYear);
        System.out.println("Country: " + origin);
        System.out.println("Usage: " + purpose);
        System.out.println("Water Tank Capacity: " + tankCapacity);
        System.out.println("Heat Up Time: " + heatingTime);
        System.out.println("Safety Feature: " + safetyType);
        System.out.println("Design: " + style);
        System.out.println("Packaging: " + packing);
        System.out.println("Supplier: " + provider);
        System.out.println("Auto Shut Off: " + autoOff);
        System.out.println("Indicator Type: " + indicator);
    }
}