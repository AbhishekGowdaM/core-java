class Burger{

    String burgerType;
    String mainIngredient;
    int price;

    Burger(String burgerType, String mainIngredient, int price) {
        this.burgerType = burgerType;
        this.mainIngredient = mainIngredient;
        this.price = price;
    }

    void displayBurger(){
        System.out.println("Burger Type : " + this.burgerType);
        System.out.println("Main Ingredient : " + this.mainIngredient);
        System.out.println("Price : " + this.price);
    }
}