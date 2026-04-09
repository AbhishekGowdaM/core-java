class SwordRunner{
    public static void main(String[] args) {

        SwordService service = new SwordService("Weapon Store", 4, "Mandya");
        service.displayServiceDetails();
        Sword sword = service.createSword();
        sword.displaySword();
    }
}