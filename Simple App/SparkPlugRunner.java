class SparkPlugRunner{
    public static void main(String[] args){

        SparkPlugSystem spark = new SparkPlugSystem();

        spark.addPlug("Bosch");
        spark.addPlug("NGK");
        spark.addPlug("Denso");
        spark.addPlug("Champion");
        spark.addPlug("Autolite");

        spark.addPlug("ACDelco");

        spark.searchPlug("NGK");
        spark.searchPlug("ACDelco");
    }
}