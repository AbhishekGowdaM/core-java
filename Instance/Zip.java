class Zip{

    String fileFormat = "ZIP";
    String compressionType = "Lossless";
    int compressionLevel = 5;
    double compressionRatio = 2.5;
    boolean isPasswordProtected = false;

    String fileName;
    int fileSizeMB;
    int compressedSizeMB;
    int numberOfFiles;
    double processingTime;
    boolean isEncrypted;
    String usageType;
    int version;
    String originSoftware;
    double efficiencyRate;

    public Zip() {
        System.out.println("Zip object created");
    }
}