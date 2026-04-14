class CupRunner{
    public static void main(String[] args){

        CupSystem cup = new CupSystem();

        cup.addCup("Tea Cup");
        cup.addCup("Coffee Cup");
        cup.addCup("Glass Cup");
        cup.addCup("Steel Cup");
        cup.addCup("Paper Cup");

        cup.addCup("Plastic Cup");

        cup.searchCup("Steel Cup");
        cup.searchCup("Plastic Cup");
    }
}