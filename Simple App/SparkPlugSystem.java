class SparkPlugSystem{
    String[] plugNames = new String[5];
    int total;

    void addPlug(String name) {
        System.out.println("Adding spark plug");

        if (this.plugNames != null) {
            System.out.println("Plug: " + name);

            if (this.total < this.plugNames.length) {
                this.plugNames[this.total] = name;
                System.out.println("Stored at index: " + this.total);
                this.total++;
            } else {
                System.out.println("Storage full");
            }
        } else {
            System.out.println("List not available");
        }
    }

    void searchPlug(String name) {
        System.out.println("Searching plug: " + name);

        if (name != null) {
            boolean found = false;

            for (int i = 0; i < this.plugNames.length; i++) {
                if (this.plugNames[i] == name) {
                    System.out.println("Found at index: " + i);
                    found = true;
                    break;
                }
            }

            if (found == false) {
                System.out.println("Plug not found");
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}