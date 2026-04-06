class MickeyMouseRun{

    void showDetails(MickeyMouse mickeyMouse){
        if (mickeyMouse != null) {
            mickeyMouse.printInfo("CartoonToy", 400);
        } else {
            System.out.println("MickeyMouse is null");
        }
    }
}