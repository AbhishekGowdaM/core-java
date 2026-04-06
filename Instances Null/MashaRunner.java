class MashaRunner{
    public static void main(String[] args){

        Masha masha = new Masha();
        MashaRun mashaRun = new MashaRun();
        mashaRun.showDetails(masha);
        masha = null;
        mashaRun.showDetails(masha);
    }
}