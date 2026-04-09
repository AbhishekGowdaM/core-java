class CardService{

    String holderName;
    int quantity;
    String location;

    CardService(String holderName, int quantity, String location){
        this.holderName = holderName;
        this.quantity = quantity;
        this.location = location;
    }

    void displayServiceDetails(){
        System.out.println("Holder Name : " + this.holderName);
        System.out.println("Quantity : " + this.quantity);
        System.out.println("Location : " + this.location);
    }

    Card createCard(){
        Card card = new Card("Debit", "SBI", 123456);
        return card;
    }
}