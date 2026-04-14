class BiometricRunner{
    public static void main(String[] args){

        BiometricSystem system = new BiometricSystem();

        system.saveUser("Abhishek");
        system.saveUser("Rahul");
        system.saveUser("Kiran");
        system.saveUser("Manoj");
        system.saveUser("Suresh");

        system.saveUser("Ravi");

        system.searchUser("Kiran");
        system.searchUser("Ravi");
    }
}