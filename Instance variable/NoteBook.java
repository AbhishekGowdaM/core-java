class NoteBook{

    String dimension;
    int pageCount;
    String brandName;
    String category;
    String coverColor;
    double cost;
    String paperType;
    String binding;
    boolean ruled;
    boolean hardCover;
    String maker;
    String origin;
    double mass;
    String form;
    String coverType;
    String sheetColor;
    int thicknessLevel;
    String style;
    boolean ecoFriendly;
    String purpose;
    String penUsage;
    String packing;
    String editionYear;
    String languageType;
    String productCode;
    String provider;

    public NoteBook(){
        dimension = "25cm";
        pageCount = 100;
        brandName = "Classmate";
        category = "Spiral";
        coverColor = "Blue";
        cost = 120.50;
        paperType = "Premium";
        binding = "Spiral Binding";
        ruled = true;
        hardCover = false;
        maker = "ITC";
        origin = "India";
        mass = 0.5;
        form = "Rectangle";
        coverType = "Cardboard";
        sheetColor = "White";
        thicknessLevel = 2;
        style = "Plain";
        ecoFriendly = true;
        purpose = "School";
        penUsage = "Ball Pen";
        packing = "Single";
        editionYear = "2024";
        languageType = "English";
        productCode = "NB123456";
        provider = "Local Store";

        System.out.println("no arg constructor");
    }

    void display() {
        System.out.println("Size: " + dimension);
        System.out.println("Pages: " + pageCount);
        System.out.println("Brand: " + brandName);
        System.out.println("Type: " + category);
        System.out.println("Color: " + coverColor);
        System.out.println("Price: " + cost);
        System.out.println("Paper Quality: " + paperType);
        System.out.println("Binding: " + binding);
        System.out.println("Ruled: " + ruled);
        System.out.println("Hard Cover: " + hardCover);
        System.out.println("Manufacturer: " + maker);
        System.out.println("Country: " + origin);
        System.out.println("Weight: " + mass);
        System.out.println("Shape: " + form);
        System.out.println("Cover: " + coverType);
        System.out.println("Page Color: " + sheetColor);
        System.out.println("Thickness: " + thicknessLevel);
        System.out.println("Design: " + style);
        System.out.println("Eco Friendly: " + ecoFriendly);
        System.out.println("Usage: " + purpose);
        System.out.println("Ink Type: " + penUsage);
        System.out.println("Packaging: " + packing);
        System.out.println("Edition: " + editionYear);
        System.out.println("Language: " + languageType);
        System.out.println("Barcode: " + productCode);
        System.out.println("Supplier: " + provider);
    }
}