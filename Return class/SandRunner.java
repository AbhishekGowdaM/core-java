class SandRunner{
    public static void main(String[] args) {

        SandService service = new SandService("ABC Suppliers", 50, "Mandya");
        service.displayServiceDetails();
        Sand sand = service.createSand();
        sand.displaySand();
    }
}