class CoinRunner{
    public static void main(String[] args){

        Coin coin = new Coin();
        CoinRun coinRun = new CoinRun();
        coinRun.showDetails(coin);
        coin = null;
        coinRun.showDetails(coin);
    }
}