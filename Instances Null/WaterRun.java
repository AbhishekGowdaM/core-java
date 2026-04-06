class WaterRun{
    void showDetails(Water water){
		
        if (water != null){
            water.printInfo("MineralWater", 20);
        } else {
            System.out.println("Water is null");
        }
    }
}