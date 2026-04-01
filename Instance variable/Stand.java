class Stand{

    String buildMaterial;
    String purpose;
    String bodyColor;
    double cost;
    String brandName;
    String category;
    String dimension;
    String mass;
    String style;
    String form;
    String strength;
    String compatibilityType;
    String heightValue;
    String widthValue;
    String lengthValue;
    String guarantee;
    String productId;
    String madeYear;
    String origin;
    String packing;
    String provider;
    boolean adjustable;
    boolean portable;
    String surfaceFinish;
    String balance;
    String supportLevel;

    public Stand() {
        buildMaterial = "Steel";
        purpose = "Laptop";
        bodyColor = "Black";
        cost = 1200.50;
        brandName = "Generic";
        category = "Foldable";
        dimension = "Medium";
        mass = "1kg";
        style = "Modern";
        form = "Rectangle";
        strength = "High";
        compatibilityType = "Universal";
        heightValue = "10cm";
        widthValue = "25cm";
        lengthValue = "30cm";
        guarantee = "1 Year";
        productId = "STD123";
        madeYear = "2025";
        origin = "India";
        packing = "Box";
        provider = "Local Store";
        adjustable = true;
        portable = true;
        surfaceFinish = "Matte";
        balance = "Strong";
        supportLevel = "Good";

        System.out.println("Stand constructor");
    }

    void display() {
        System.out.println("Material: " + buildMaterial);
        System.out.println("Usage: " + purpose);
        System.out.println("Color: " + bodyColor);
        System.out.println("Price: " + cost);
        System.out.println("Brand: " + brandName);
        System.out.println("Type: " + category);
        System.out.println("Size: " + dimension);
        System.out.println("Weight: " + mass);
        System.out.println("Design: " + style);
        System.out.println("Shape: " + form);
        System.out.println("Durability: " + strength);
        System.out.println("Compatibility: " + compatibilityType);
        System.out.println("Height: " + heightValue);
        System.out.println("Width: " + widthValue);
        System.out.println("Length: " + lengthValue);
        System.out.println("Warranty: " + guarantee);
        System.out.println("Model Number: " + productId);
        System.out.println("Manufacturing Date: " + madeYear);
        System.out.println("Country: " + origin);
        System.out.println("Packaging: " + packing);
        System.out.println("Supplier: " + provider);
        System.out.println("Adjustable: " + adjustable);
        System.out.println("Portable: " + portable);
        System.out.println("Finish: " + surfaceFinish);
        System.out.println("Stability: " + balance);
        System.out.println("Support: " + supportLevel);
    }
}