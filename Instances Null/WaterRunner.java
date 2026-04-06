class WaterRunner{
    public static void main(String[] args) {

        Water water = new Water();
        WaterRun waterRun = new WaterRun();
        waterRun.showDetails(water);
        water = null;
        waterRun.showDetails(water);
    }
}