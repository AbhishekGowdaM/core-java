class AlloyRunner{
    public static void main(String[] args){

        AlloySystem alloy = new AlloySystem();

        alloy.addMaterial("Steel");
        alloy.addMaterial("Brass");
        alloy.addMaterial("Bronze");
        alloy.addMaterial("Aluminium");
        alloy.addMaterial("Copper");

        alloy.addMaterial("Iron");

        alloy.searchMaterial("Bronze");
        alloy.searchMaterial("Iron");
    }
}