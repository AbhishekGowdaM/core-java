class CarromRun{
    void showDetails(Carrom carrom){
        if (carrom != null) {
            carrom.printInfo("WoodenCarrom", 1500);
        } else {
            System.out.println("Carrom is null");
        }
    }
}