class FlowerRunner{
    public static void main(String[] args) {

        FlowerService service = new FlowerService("Flower Shop", 30, "Mandya");
        service.displayServiceDetails();
        Flower flower = service.createFlower();
        flower.displayFlower();
    }
}