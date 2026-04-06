class CarromRunner{
    public static void main(String[] args){

        Carrom carrom = new Carrom();
        CarromRun carromRun = new CarromRun();
        carromRun.showDetails(carrom);
        carrom = null;
        carromRun.showDetails(carrom);
    }
}