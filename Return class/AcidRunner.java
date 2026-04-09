class AcidRunner{
    public static void main(String[] args) {

        AcidService service = new AcidService("Chem Lab", 10, "Mandya");
        service.displayServiceDetails();
        Acid acid = service.createAcid();
        acid.displayAcid();
    }
}