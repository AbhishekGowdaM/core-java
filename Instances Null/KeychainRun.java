class KeychainRun{
    void showDetails(Keychain keychain){

        if (keychain != null){
            keychain.printInfo("MetalKeychain", 150);
        } else {
            System.out.println("Keychain is null");
        }
    }
}