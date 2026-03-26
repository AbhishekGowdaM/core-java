class PlayStationRunner{
    public static void main(String[] args) {

        PlayStation homePlayStation = new PlayStation();
        PlayStation gamingPlayStation = new PlayStation();
        PlayStation sparePlayStation = new PlayStation();
        PlayStation livingRoomPlayStation = new PlayStation();
        PlayStation backupPlayStation = new PlayStation();

        System.out.println("Default values:");
        System.out.println(homePlayStation.brand);
        System.out.println(homePlayStation.model);
        System.out.println(homePlayStation.price);
        System.out.println(homePlayStation.storage);
        System.out.println(homePlayStation.available);

        homePlayStation.brand = "Sony";
        homePlayStation.model = "PS5";
        homePlayStation.price = 50000;
        homePlayStation.storage = 825;
        homePlayStation.available = true;

        System.out.println("Updated values:");
        System.out.println(homePlayStation.brand);
        System.out.println(homePlayStation.model);
        System.out.println(homePlayStation.price);
        System.out.println(homePlayStation.storage);
        System.out.println(homePlayStation.available);
    }
}