class PowderRunner{
    public static void main(String[] args){
       
	   Powder powder = new Powder();
       PowderRun powderRun = new PowderRun();
       powderRun.showDetails(powder);
       powder = null;
       powderRun.showDetails(powder);
    }
}