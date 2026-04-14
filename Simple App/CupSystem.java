class CupSystem{
    String[] cupNames = new String[5];
    int total;

    void addCup(String name) {
        System.out.println("Adding cup");

        if (this.cupNames != null) {
            System.out.println("Cup: " + name);

            if (this.total < this.cupNames.length) {
                this.cupNames[this.total] = name;
                System.out.println("Stored at index: " + this.total);
                this.total++;
            } else {
                System.out.println("Storage full");
            }
        } else {
            System.out.println("List not available");
        }
    }

    void searchCup(String name) {
        System.out.println("Searching cup: " + name);

        if (name != null) {
            boolean found = false;

            for (int i = 0; i < this.cupNames.length; i++) {
                if (this.cupNames[i] == name) {
                    System.out.println("Found at index: " + i);
                    found = true;
                    break;
                }
            }

            if (found == false) {
                System.out.println("Cup not found");
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}