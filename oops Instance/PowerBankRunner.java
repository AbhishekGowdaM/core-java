class PowerBankRunner{
    public static void main(String[] args){

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

        System.out.println(pb2.brand);
        System.out.println(pb2.capacity);
        System.out.println(pb2.price);
        System.out.println(pb2.color);
        System.out.println(pb2.available);

        System.out.println(pb3.brand);
        System.out.println(pb3.capacity);
        System.out.println(pb3.price);
        System.out.println(pb3.color);
        System.out.println(pb3.available);

        System.out.println(pb4.brand);
        System.out.println(pb4.capacity);
        System.out.println(pb4.price);
        System.out.println(pb4.color);
        System.out.println(pb4.available);

        System.out.println(pb5.brand);
        System.out.println(pb5.capacity);
        System.out.println(pb5.price);
        System.out.println(pb5.color);
        System.out.println(pb5.available);

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