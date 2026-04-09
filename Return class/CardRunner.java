class CardRunner{
    public static void main(String[] args){

        CardService service = new CardService("Abhishek", 2, "Mandya");
        service.displayServiceDetails();
        Card card = service.createCard();
        card.displayCard();
    }
}