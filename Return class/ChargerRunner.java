class ChargerRunner{
    public static void main(String[] args) {

        ChargerService service = new ChargerService("Mobile Store", 10, "Mandya");
        service.displayServiceDetails();
        Charger charger = service.createCharger();
        charger.displayCharger();
    }
}