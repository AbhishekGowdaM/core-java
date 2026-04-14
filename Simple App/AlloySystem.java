class AlloySystem{

    String[] materials = new String[5];
    int total;

    void addMaterial(String materialName) {
        System.out.println("Adding material");

        if (this.materials != null) {
            System.out.println("Material: " + materialName);

            if (this.total < this.materials.length) {
                this.materials[this.total] = materialName;
                System.out.println("Stored at index: " + this.total);
                this.total++;
            } else {
                System.out.println("Storage full");
            }
        } else {
            System.out.println("List not available");
        }
    }

    void searchMaterial(String materialName) {
        System.out.println("Searching material: " + materialName);

        if (materialName != null) {
            boolean found = false;

            for (int i = 0; i < this.materials.length; i++) {
                if (this.materials[i] == materialName) {
                    System.out.println("Found at index: " + i);
                    found = true;
                    break;
                }
            }

            if (found == false) {
                System.out.println("Material not found");
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}