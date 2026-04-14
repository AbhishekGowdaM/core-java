class FlightSystem{
    String[] travellers = new String[5];
    int total;

    void bookSeat(String personName) {
        System.out.println("Booking seat");

        if (this.travellers != null) {
            System.out.println("Name: " + personName);

            if (this.total < this.travellers.length) {
                this.travellers[this.total] = personName;
                System.out.println("Seat booked at index: " + this.total);
                this.total++;
            } else {
                System.out.println("No seats available");
            }
        } else {
            System.out.println("Data not available");
        }
    }

    void findPerson(String personName) {
        System.out.println("Searching: " + personName);

        if (personName != null) {
            boolean found = false;

            for (int i = 0; i < this.travellers.length; i++) {
                if (this.travellers[i] == personName) {
                    System.out.println("Found at index: " + i);
                    found = true;
                    break;
                }
            }

            if (found == false) {
                System.out.println("Not found");
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}