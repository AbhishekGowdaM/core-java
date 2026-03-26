class FlightRunner{

    public static void main(String[] args) {

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