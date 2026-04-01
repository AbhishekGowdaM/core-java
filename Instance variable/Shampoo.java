class Shampoo{

    String brandName;
    String category;
    String scent;
    double cost;
    String volume;
    String liquidColor;
    String suitableHair;
    String composition;
    String purpose;
    String packType;
    String provider;
    String madeYear;
    String expiryYear;
    String origin;
    String guarantee;
    String productId;
    boolean herbal;
    boolean chemicalFree;
    String consistency;
    String foamType;
    String containerType;
    String style;
    String advantages;
    String phValue;
    String approval;
    String genderType;

    public Shampoo() {
        brandName = "Clinic Plus";
        category = "Anti-dandruff";
        scent = "Mild";
        cost = 250.75;
        volume = "200ml";
        liquidColor = "White";
        suitableHair = "All";
        composition = "Herbal";
        purpose = "Hair Wash";
        packType = "Bottle";
        provider = "Store";
        madeYear = "2025";
        expiryYear = "2027";
        origin = "India";
        guarantee = "N/A";
        productId = "SHP123";
        herbal = true;
        chemicalFree = false;
        consistency = "Smooth";
        foamType = "Foamy";
        containerType = "Plastic";
        style = "Modern";
        advantages = "Anti Hair Fall";
        phValue = "Balanced";
        approval = "ISO";
        genderType = "Unisex";

        System.out.println("Shampoo constructor");
    }

    void display() {
        System.out.println("Brand: " + brandName);
        System.out.println("Type: " + category);
        System.out.println("Fragrance: " + scent);
        System.out.println("Price: " + cost);
        System.out.println("Quantity: " + volume);
        System.out.println("Color: " + liquidColor);
        System.out.println("Hair Type: " + suitableHair);
        System.out.println("Ingredients: " + composition);
        System.out.println("Usage: " + purpose);
        System.out.println("Packaging: " + packType);
        System.out.println("Supplier: " + provider);
        System.out.println("Manufacturing Date: " + madeYear);
        System.out.println("Expiry Date: " + expiryYear);
        System.out.println("Country: " + origin);
        System.out.println("Warranty: " + guarantee);
        System.out.println("Model Number: " + productId);
        System.out.println("Herbal: " + herbal);
        System.out.println("Chemical Free: " + chemicalFree);
        System.out.println("Texture: " + consistency);
        System.out.println("Lather Type: " + foamType);
        System.out.println("Bottle Type: " + containerType);
        System.out.println("Design: " + style);
        System.out.println("Benefits: " + advantages);
        System.out.println("pH Level: " + phValue);
        System.out.println("Certification: " + approval);
        System.out.println("Target Gender: " + genderType);
    }
}