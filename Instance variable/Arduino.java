class Arduino{

    String model;
    int pinCount;
    String microcontroller;
    String voltage;
    String clockSpeed;
    String memory;
    String connectivity;
    String brand;
    double price;
    String usage;
    String language;
    String usbType;
    String powerSource;
    String compatibility;
    String size;
    String weight;
    String warranty;
    String manufactureYear;
    String originCountry;
    String packaging;
    String supplier;
    boolean wifiEnabled;
    boolean bluetoothEnabled;
    String version;
    String design;
    String support;

   public Arduino() {
        model = "UNO";
        pinCount = 14;
        microcontroller = "ATmega328P";
        voltage = "5V";
        clockSpeed = "16MHz";
        memory = "32KB";
        connectivity = "USB";
        brand = "Arduino";
        price = 1200.50;
        usage = "Projects";
        language = "C++";
        usbType = "USB-B";
        powerSource = "External";
        compatibility = "Windows/Linux";
        size = "Small";
        weight = "50g";
        warranty = "1 Year";
        manufactureYear = "2025";
        originCountry = "Italy";
        packaging = "Box";
        supplier = "Arduino Store";
        wifiEnabled = false;
        bluetoothEnabled = false;
        version = "R3";
        design = "Compact";
        support = "Online";

        System.out.println("Arduino constructor");
    }

    void display() {
        System.out.println("Model: " + model);
        System.out.println("Pins: " + pinCount);
        System.out.println("Microcontroller: " + microcontroller);
        System.out.println("Voltage: " + voltage);
        System.out.println("Clock Speed: " + clockSpeed);
        System.out.println("Memory: " + memory);
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Usage: " + usage);
        System.out.println("Programming Language: " + language);
        System.out.println("USB Type: " + usbType);
        System.out.println("Power Source: " + powerSource);
        System.out.println("Compatibility: " + compatibility);
        System.out.println("Size: " + size);
        System.out.println("Weight: " + weight);
        System.out.println("Warranty: " + warranty);
        System.out.println("Manufacture Year: " + manufactureYear);
        System.out.println("Country: " + originCountry);
        System.out.println("Packaging: " + packaging);
        System.out.println("Supplier: " + supplier);
        System.out.println("WiFi Enabled: " + wifiEnabled);
        System.out.println("Bluetooth Enabled: " + bluetoothEnabled);
        System.out.println("Version: " + version);
        System.out.println("Design: " + design);
        System.out.println("Support: " + support);
    }
}