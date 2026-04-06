class NetRun{
    void showDetails(Net net){

        if (net != null){
            net.printInfo("FishingNet", 500);
        } else {
            System.out.println("Net is null");
        }
    }
}