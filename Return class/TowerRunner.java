class TowerRunner{
    public static void main(String[] args) {

        TowerService service = new TowerService("Telecom Ltd", 3, "Mandya");
        service.displayServiceDetails();
        Tower tower = service.createTower();
        tower.displayTower();
    }
}