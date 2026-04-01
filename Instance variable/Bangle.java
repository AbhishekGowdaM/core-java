class Bangle{

    String baseMaterial;
    String shade;
    double cost;
    String fitSize;
    String designType;
    String brandName;
    String category;
    String mass;
    String form;
    String surfaceFinish;
    String texturePattern;
    String eventUse;
    String targetGroup;
    String guarantee;
    String productCode;
    String madeYear;
    String origin;
    String purpose;
    String packing;
    String seller;
    boolean adjustable;
    boolean handmade;
    String coatingType;
    String strength;
    String comboType;
    String fashionStyle;

   public Bangle(){
        baseMaterial = "Gold";
        shade = "Red";
        cost = 5000.75;
        fitSize = "Medium";
        designType = "Traditional";
        brandName = "Tanishq";
        category = "Jewelry";
        mass = "20g";
        form = "Round";
        surfaceFinish = "Glossy";
        texturePattern = "Floral";
        eventUse = "Wedding";
        targetGroup = "Female";
        guarantee = "1 Year";
        productCode = "BNG123";
        madeYear = "2025";
        origin = "India";
        purpose = "Occasion Wear";
        packing = "Box";
        seller = "Jewelry Store";
        adjustable = false;
        handmade = true;
        coatingType = "Gold Polish";
        strength = "High";
        comboType = "Pair";
        fashionStyle = "Ethnic";

        System.out.println("Bangle constructor");
    }

    void display() {
        System.out.println("Material: " + baseMaterial);
        System.out.println("Color: " + shade);
        System.out.println("Price: " + cost);
        System.out.println("Size: " + fitSize);
        System.out.println("Design: " + designType);
        System.out.println("Brand: " + brandName);
        System.out.println("Type: " + category);
        System.out.println("Weight: " + mass);
        System.out.println("Shape: " + form);
        System.out.println("Finish: " + surfaceFinish);
        System.out.println("Pattern: " + texturePattern);
        System.out.println("Occasion: " + eventUse);
        System.out.println("Gender: " + targetGroup);
        System.out.println("Warranty: " + guarantee);
        System.out.println("Model Number: " + productCode);
        System.out.println("Manufacturing Date: " + madeYear);
        System.out.println("Country: " + origin);
        System.out.println("Usage: " + purpose);
        System.out.println("Packaging: " + packing);
        System.out.println("Supplier: " + seller);
        System.out.println("Adjustable: " + adjustable);
        System.out.println("Handmade: " + handmade);
        System.out.println("Polish Type: " + coatingType);
        System.out.println("Durability: " + strength);
        System.out.println("Set Type: " + comboType);
        System.out.println("Style: " + fashionStyle);
    }
}