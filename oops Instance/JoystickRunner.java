class JoystickRunner{
    public static void main(String[] args){

        Joystick gamingJoystick = new Joystick();
        Joystick wirelessJoystick = new Joystick();
        Joystick wiredJoystick = new Joystick();
        Joystick spareJoystick = new Joystick();
        Joystick backupJoystick = new Joystick();

        System.out.println("Default values:");

        System.out.println(gamingJoystick.brand);
        System.out.println(gamingJoystick.type);
        System.out.println(gamingJoystick.price);
        System.out.println(gamingJoystick.color);
        System.out.println(gamingJoystick.available);

        System.out.println(wirelessJoystick.brand);
        System.out.println(wirelessJoystick.type);
        System.out.println(wirelessJoystick.price);
        System.out.println(wirelessJoystick.color);
        System.out.println(wirelessJoystick.available);

        System.out.println(wiredJoystick.brand);
        System.out.println(wiredJoystick.type);
        System.out.println(wiredJoystick.price);
        System.out.println(wiredJoystick.color);
        System.out.println(wiredJoystick.available);

        System.out.println(spareJoystick.brand);
        System.out.println(spareJoystick.type);
        System.out.println(spareJoystick.price);
        System.out.println(spareJoystick.color);
        System.out.println(spareJoystick.available);

        System.out.println(backupJoystick.brand);
        System.out.println(backupJoystick.type);
        System.out.println(backupJoystick.price);
        System.out.println(backupJoystick.color);
        System.out.println(backupJoystick.available);

        gamingJoystick.brand = "Sony";
        gamingJoystick.type = "Wireless";
        gamingJoystick.price = 4000;
        gamingJoystick.color = "Black";
        gamingJoystick.available = true;

        System.out.println("Updated values:");

        System.out.println(gamingJoystick.brand);
        System.out.println(gamingJoystick.type);
        System.out.println(gamingJoystick.price);
        System.out.println(gamingJoystick.color);
        System.out.println(gamingJoystick.available);
    }
}