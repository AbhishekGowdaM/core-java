class DiamondRunner{
    public static void main(String[] args) {

        DiamondService service = new DiamondService("Jewelry Shop", 2, "Mandya");
        service.displayServiceDetails();
        Diamond diamond = service.createDiamond();
        diamond.displayDiamond();
    }
}