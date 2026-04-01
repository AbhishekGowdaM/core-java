class Monitor{

    String maker;
    int screenSize;
    String displayResolution;
    String panel;
    int refreshHz;
    String bodyColor;
    double cost;
    String ports;
    boolean curved;
    boolean speakersAvailable;
    String displayType;
    String ratio;
    String response;
    String luminance;
    String contrast;
    String mount;
    String purpose;
    String powerUsage;
    String guarantee;
    String productCode;
    String yearMade;
    String origin;
    String stand;
    boolean touchEnabled;
    String packing;
    String provider;

   public Monitor(){
        maker = "Dell";
        screenSize = 24;
        displayResolution = "1920x1080";
        panel = "IPS";
        refreshHz = 75;
        bodyColor = "Black";
        cost = 15000.50;
        ports = "HDMI, VGA";
        curved = false;
        speakersAvailable = true;
        displayType = "LED";
        ratio = "16:9";
        response = "5ms";
        luminance = "250 nits";
        contrast = "1000:1";
        mount = "Wall Mount";
        purpose = "Office";
        powerUsage = "30W";
        guarantee = "3 Years";
        productCode = "DELL1234";
        yearMade = "2025";
        origin = "India";
        stand = "Adjustable";
        touchEnabled = false;
        packing = "Box";
        provider = "Dell Store";

        System.out.println("Monitor constructor");
    }

    void display() {
        System.out.println("Brand: " + maker);
        System.out.println("Size: " + screenSize);
        System.out.println("Resolution: " + displayResolution);
        System.out.println("Panel Type: " + panel);
        System.out.println("Refresh Rate: " + refreshHz);
        System.out.println("Color: " + bodyColor);
        System.out.println("Price: " + cost);
        System.out.println("Connectivity: " + ports);
        System.out.println("Curved: " + curved);
        System.out.println("Speakers: " + speakersAvailable);
        System.out.println("Screen Type: " + displayType);
        System.out.println("Aspect Ratio: " + ratio);
        System.out.println("Response Time: " + response);
        System.out.println("Brightness: " + luminance);
        System.out.println("Contrast Ratio: " + contrast);
        System.out.println("Mount Type: " + mount);
        System.out.println("Usage: " + purpose);
        System.out.println("Power Consumption: " + powerUsage);
        System.out.println("Warranty: " + guarantee);
        System.out.println("Model Number: " + productCode);
        System.out.println("Manufacturing Date: " + yearMade);
        System.out.println("Country: " + origin);
        System.out.println("Stand Type: " + stand);
        System.out.println("Touch Screen: " + touchEnabled);
        System.out.println("Packaging: " + packing);
        System.out.println("Supplier: " + provider);
    }
}