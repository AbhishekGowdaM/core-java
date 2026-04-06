class RotaterRunner{
    public static void main(String[] args){

        Rotater rotater = new Rotater();
        RotaterRun rotaterRun = new RotaterRun();
        rotaterRun.showDetails(rotater);
        rotater = null;
        rotaterRun.showDetails(rotater);
    }
}