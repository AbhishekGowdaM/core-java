class CoinRun{
    void showDetails(Coin coin){
        if (coin != null){
            coin.printInfo("GoldCoin", 10000);
        } else {
            System.out.println("Coin is null");
        }
    }
}