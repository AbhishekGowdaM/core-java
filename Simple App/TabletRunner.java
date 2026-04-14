class TabletRunner{
    public static void main(String[] args){

        TabletSystem tablet = new TabletSystem();

        tablet.addTablet("Paracetamol");
        tablet.addTablet("Ibuprofen");
        tablet.addTablet("Aspirin");
        tablet.addTablet("Cetirizine");
        tablet.addTablet("Amoxicillin");

        tablet.addTablet("Dolo");

        tablet.searchTablet("Aspirin");
        tablet.searchTablet("Dolo");
    }
}