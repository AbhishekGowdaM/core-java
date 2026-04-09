class BurgerRunner{
    public static void main(String[] args){

        BurgerService service = new BurgerService("Food Zone", 5, "Mandya");
        service.displayShopDetails();
        Burger burger = service.createBurger();
        burger.displayBurger();
    }
}