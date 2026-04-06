class PowderRun{
    void showDetails(Powder powder){

        if (powder != null) {
            powder.printInfo("FacePowder", 200);
        } else {
            System.out.println("Powder is null");
        }
    }
}