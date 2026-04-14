class BiometricSystem{
    String[] names = new String[5];
    int count;

    void saveUser(String userName) {
        System.out.println("Saving user");

        if (this.names != null) {
            System.out.println("User: " + userName);

            if (this.count < this.names.length) {
                this.names[this.count] = userName;
                System.out.println("Saved at position: " + this.count);
                this.count++;
            } else {
                System.out.println("No space left");
            }
        } else {
            System.out.println("List not available");
        }
    }

    void searchUser(String userName) {
        System.out.println("Searching user: " + userName);

        if (userName != null) {
            boolean found = false;

            for (int i = 0; i < this.names.length; i++) {
                if (this.names[i] == userName) {
                    System.out.println("Found at position: " + i);
                    found = true;
                    break;
                }
            }

            if (found == false) {
                System.out.println("User not found");
            }
        } else {
            System.out.println("Invalid name");
        }
    }
}