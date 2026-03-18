class Ticket{
    static int getPriceByPlace(String place){
        System.out.println("Place: " + place);
        return 30;
    }

    static int getPriceByMovie(String movie, String seatType, String theater) {
        System.out.println("Movie: " + movie);
        return 50;
    }

    static String getEmail(String name) {
        return name + "@gmail.com";
    }

    static long getMobile(String name) {
        return 7975230;
    }
}

    