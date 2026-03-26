class JoystickRunner{
    public static void main(String[] args) {

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