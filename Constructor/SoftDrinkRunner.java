class SoftDrinkRunner{
    public static void main(String[] args) {

        SoftDrink s1 = new SoftDrink();
        s1.displayDetails();

        SoftDrink s2 = new SoftDrink("CocaCola", "Cola", 40.0);
        s2.displayDetails();

        SoftDrink s3 = new SoftDrink("Pepsi", "Cola", 35.0);
        s3.displayDetails();

        SoftDrink s4 = new SoftDrink("Sprite", "Lemon", 30.0, "Clear");
        s4.displayDetails();

        SoftDrink s5 = new SoftDrink("Fanta", "Orange", 30.0, "Orange");
        s5.displayDetails();
    }
}