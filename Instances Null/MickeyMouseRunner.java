class MickeyMouseRunner{
    public static void main(String[] args) {

        MickeyMouse mickeyMouse = new MickeyMouse();
        MickeyMouseRun mickeyMouseRun = new MickeyMouseRun();
        mickeyMouseRun.showDetails(mickeyMouse);
        mickeyMouse = null;
        mickeyMouseRun.showDetails(mickeyMouse);
    }
}