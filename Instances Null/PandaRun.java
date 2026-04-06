class PandaRun{
    void showDetails(Panda panda){

        if (panda != null){
            panda.printInfo("SoftToy", 500);
        } else {
            System.out.println("Panda is null");
        }
    }
}