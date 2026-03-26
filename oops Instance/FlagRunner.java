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