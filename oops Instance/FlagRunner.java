class FlagRunner{
    public static void main(String[] args){

        Flag indiaFlag = new Flag();
        Flag usaFlag = new Flag();
        Flag ukFlag = new Flag();
        Flag japanFlag = new Flag();
        Flag australiaFlag = new Flag();

        System.out.println("Default values:");

        System.out.println("Color: " + indiaFlag.color);
        System.out.println("Country: " + indiaFlag.country);
        System.out.println("Price: " + indiaFlag.price);
        System.out.println("Size: " + indiaFlag.size);
        System.out.println("Available: " + indiaFlag.available);

        System.out.println("Color: " + usaFlag.color);
        System.out.println("Country: " + usaFlag.country);
        System.out.println("Price: " + usaFlag.price);
        System.out.println("Size: " + usaFlag.size);
        System.out.println("Available: " + usaFlag.available);

        System.out.println("Color: " + ukFlag.color);
        System.out.println("Country: " + ukFlag.country);
        System.out.println("Price: " + ukFlag.price);
        System.out.println("Size: " + ukFlag.size);
        System.out.println("Available: " + ukFlag.available);

        System.out.println("Color: " + japanFlag.color);
        System.out.println("Country: " + japanFlag.country);
        System.out.println("Price: " + japanFlag.price);
        System.out.println("Size: " + japanFlag.size);
        System.out.println("Available: " + japanFlag.available);

        System.out.println("Color: " + australiaFlag.color);
        System.out.println("Country: " + australiaFlag.country);
        System.out.println("Price: " + australiaFlag.price);
        System.out.println("Size: " + australiaFlag.size);
        System.out.println("Available: " + australiaFlag.available);

        indiaFlag.color = "Tricolor";
        indiaFlag.country = "India";
        indiaFlag.price = 200;
        indiaFlag.size = 5;
        indiaFlag.available = true;

        System.out.println("Updated values:");

        System.out.println("Color: " + indiaFlag.color);
        System.out.println("Country: " + indiaFlag.country);
        System.out.println("Price: " + indiaFlag.price);
        System.out.println("Size: " + indiaFlag.size);
        System.out.println("Available: " + indiaFlag.available);
    }
}