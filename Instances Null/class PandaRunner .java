class PandaRunner{
    public static void main(String[] args){

        Panda panda = new Panda();
        PandaRun pandaRun = new PandaRun();
        pandaRun.showDetails(panda);
        panda = null;
        pandaRun.showDetails(panda);
    }
}