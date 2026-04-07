class SugarRunner{
    public static void main(String[] args){

        SugarCane sugarcane = new SugarCane(300, 18.5);
        SugarCaneFarm farm = new SugarCaneFarm("Abhishek",60000,sugarcane,SugarCaneType.ORGANIC
        );
        farm.showDetails();
    }
}