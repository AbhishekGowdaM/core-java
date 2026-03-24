class TouristPlaces{
    public static void main(String[] args){
        String[] places ={"Goa", "Mysore", "Ooty", "Delhi", "Agra",
            "Jaipur", "Kerala", "Manali", "Shimla", "Kashmir",
            "Varanasi", "Amritsar", "Darjeeling", "Rishikesh", "Haridwar",
            "Coorg", "Hampi", "Udaipur", "Jaisalmer", "Andaman",
            "Lakshadweep", "Kodaikanal", "Chennai", "Mumbai", "Bangalore",
            "Hyderabad", "Pune", "Kolkata", "Ahmedabad", "Sikkim"  
        };

        places[3] = "Coorg";

        for (int pos = 0; pos < places.length; pos++) {
            System.out.println(places[pos]);
        }

        System.out.print("\n");

        for (int pos = places.length - 1; pos >= 0; pos--) {
            System.out.println(places[pos]);
        }

        System.out.print("\n");

        try {
            System.out.println(places[40]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index does not exist");
        }
    }
}