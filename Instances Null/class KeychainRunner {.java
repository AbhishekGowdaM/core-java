class KeychainRunner{
    public static void main(String[] args){

        Keychain keychain = new Keychain();
        KeychainRun keychainRun = new KeychainRun();
        keychainRun.showDetails(keychain);
        keychain = null;
        keychainRun.showDetails(keychain);
    }
}