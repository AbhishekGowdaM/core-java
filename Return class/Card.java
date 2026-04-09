class Card{

    String cardType;
    String bankName;
    int cardNumber;

    Card(String cardType, String bankName, int cardNumber){
        this.cardType = cardType;
        this.bankName = bankName;
        this.cardNumber = cardNumber;
    }

    void displayCard(){
        System.out.println("Card Type : " + this.cardType);
        System.out.println("Bank Name : " + this.bankName);
        System.out.println("Card Number : " + this.cardNumber);
    }
}