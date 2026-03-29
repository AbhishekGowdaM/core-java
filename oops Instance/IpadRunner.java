class IpadRunner{
    public static void main(String[] args){

        Ipad studentIpad = new Ipad();
        Ipad officeIpad = new Ipad();
        Ipad personalIpad = new Ipad();
        Ipad gamingIpad = new Ipad();
        Ipad spareIpad = new Ipad();

        System.out.println("Default values:");

        System.out.println("Brand: " + studentIpad.brand);
        System.out.println("Color: " + studentIpad.color);
        System.out.println("Price: " + studentIpad.price);
        System.out.println("Storage: " + studentIpad.storage);
        System.out.println("Available: " + studentIpad.available);

        System.out.println("Brand: " + officeIpad.brand);
        System.out.println("Color: " + officeIpad.color);
        System.out.println("Price: " + officeIpad.price);
        System.out.println("Storage: " + officeIpad.storage);
        System.out.println("Available: " + officeIpad.available);

        System.out.println("Brand: " + personalIpad.brand);
        System.out.println("Color: " + personalIpad.color);
        System.out.println("Price: " + personalIpad.price);
        System.out.println("Storage: " + personalIpad.storage);
        System.out.println("Available: " + personalIpad.available);

        System.out.println("Brand: " + gamingIpad.brand);
        System.out.println("Color: " + gamingIpad.color);
        System.out.println("Price: " + gamingIpad.price);
        System.out.println("Storage: " + gamingIpad.storage);
        System.out.println("Available: " + gamingIpad.available);

        System.out.println("Brand: " + spareIpad.brand);
        System.out.println("Color: " + spareIpad.color);
        System.out.println("Price: " + spareIpad.price);
        System.out.println("Storage: " + spareIpad.storage);
        System.out.println("Available: " + spareIpad.available);

        studentIpad.brand = "Apple";
        studentIpad.color = "Silver";
        studentIpad.price = 50000;
        studentIpad.storage = 128;
        studentIpad.available = true;

        System.out.println("Updated values:");

        System.out.println("Brand: " + studentIpad.brand);
        System.out.println("Color: " + studentIpad.color);
        System.out.println("Price: " + studentIpad.price);
        System.out.println("Storage: " + studentIpad.storage);
        System.out.println("Available: " + studentIpad.available);
    }
}