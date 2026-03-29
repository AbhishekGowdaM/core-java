class FlightRunner{
    public static void main(String[] args){

        Flight domesticFlight = new Flight();
        Flight internationalFlight = new Flight();
        Flight morningFlight = new Flight();
        Flight eveningFlight = new Flight();
        Flight backupFlight = new Flight();

        System.out.println("Default values:");

        System.out.println(domesticFlight.name);
        System.out.println(domesticFlight.source);
        System.out.println(domesticFlight.destination);
        System.out.println(domesticFlight.price);
        System.out.println(domesticFlight.available);

        System.out.println(internationalFlight.name);
        System.out.println(internationalFlight.source);
        System.out.println(internationalFlight.destination);
        System.out.println(internationalFlight.price);
        System.out.println(internationalFlight.available);

        System.out.println(morningFlight.name);
        System.out.println(morningFlight.source);
        System.out.println(morningFlight.destination);
        System.out.println(morningFlight.price);
        System.out.println(morningFlight.available);

        System.out.println(eveningFlight.name);
        System.out.println(eveningFlight.source);
        System.out.println(eveningFlight.destination);
        System.out.println(eveningFlight.price);
        System.out.println(eveningFlight.available);

        System.out.println(backupFlight.name);
        System.out.println(backupFlight.source);
        System.out.println(backupFlight.destination);
        System.out.println(backupFlight.price);
        System.out.println(backupFlight.available);

        domesticFlight.name = "IndiGo";
        domesticFlight.source = "Bangalore";
        domesticFlight.destination = "Delhi";
        domesticFlight.price = 6000;
        domesticFlight.available = true;

        System.out.println("Updated values:");

        System.out.println(domesticFlight.name);
        System.out.println(domesticFlight.source);
        System.out.println(domesticFlight.destination);
        System.out.println(domesticFlight.price);
        System.out.println(domesticFlight.available);
    }
}