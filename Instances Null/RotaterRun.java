class RotaterRun{
    void showDetails(Rotater rotater){

        if (rotater != null){
            rotater.printInfo("FanRotater", 300);
        } else {
            System.out.println("Rotater is null");
        }
    }
}