class TabletSystem{
    String[] tabletNames = new String[5];
    int total;

    void addTablet(String name) {
        System.out.println("Adding tablet");

        if (this.tabletNames != null) {
            System.out.println("Tablet: " + name);

            if (this.total < this.tabletNames.length) {
                this.tabletNames[this.total] = name;
                System.out.println("Stored at index: " + this.total);
                this.total++;
            } else {
                System.out.println("Storage full");
            }
        } else {
            System.out.println("List not available");
        }
    }

    void searchTablet(String name) {
        System.out.println("Searching tablet: " + name);

        if (name != null) {
            boolean found = false;

            for (int i = 0; i < this.tabletNames.length; i++) {
                if (this.tabletNames[i] == name) {
                    System.out.println("Found at index: " + i);
                    found = true;
                    break;
                }
            }

            if (found == false) {
                System.out.println("Tablet not found");
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}