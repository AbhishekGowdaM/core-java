class PlayStationRunner{
    public static void main(String[] args){

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

        System.out.println(gamingPlayStation.brand);
        System.out.println(gamingPlayStation.model);
        System.out.println(gamingPlayStation.price);
        System.out.println(gamingPlayStation.storage);
        System.out.println(gamingPlayStation.available);

        System.out.println(sparePlayStation.brand);
        System.out.println(sparePlayStation.model);
        System.out.println(sparePlayStation.price);
        System.out.println(sparePlayStation.storage);
        System.out.println(sparePlayStation.available);

        System.out.println(livingRoomPlayStation.brand);
        System.out.println(livingRoomPlayStation.model);
        System.out.println(livingRoomPlayStation.price);
        System.out.println(livingRoomPlayStation.storage);
        System.out.println(livingRoomPlayStation.available);

        System.out.println(backupPlayStation.brand);
        System.out.println(backupPlayStation.model);
        System.out.println(backupPlayStation.price);
        System.out.println(backupPlayStation.storage);
        System.out.println(backupPlayStation.available);

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