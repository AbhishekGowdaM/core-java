class FlightRunner{
    public static void main(String[] args){

        FlightSystem flight = new FlightSystem();

        flight.bookSeat("Arjun");
        flight.bookSeat("Vijay");
        flight.bookSeat("Ramesh");
        flight.bookSeat("Sanjay");
        flight.bookSeat("Deepak");

        flight.bookSeat("Kumar");

        flight.findPerson("Ramesh");
        flight.findPerson("Kumar");
    }
}