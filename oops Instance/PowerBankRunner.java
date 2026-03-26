class PowerBankRunner{
public static void main(String[] args) {

        PowerBank pb1 = new PowerBank();
        PowerBank pb2 = new PowerBank();
        PowerBank pb3 = new PowerBank();
        PowerBank pb4 = new PowerBank();
        PowerBank pb5 = new PowerBank();

        System.out.println("Default values:");
        System.out.println(pb1.brand);
        System.out.println(pb1.capacity);
        System.out.println(pb1.price);
        System.out.println(pb1.color);
        System.out.println(pb1.available);

        pb1.brand = "Mi";
        pb1.capacity = 20000;
        pb1.price = 1500;
        pb1.color = "Black";
        pb1.available = true;

        System.out.println("Updated values:");
        System.out.println(pb1.brand);
        System.out.println(pb1.capacity);
        System.out.println(pb1.price);
        System.out.println(pb1.color);
        System.out.println(pb1.available);
    }
}