class IpadRunner{
public static void main(String[] args) {

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