class LiftSystem{
    int[] floors = new int[5];
    int total;

    void addFloor(int floorNumber) {
        System.out.println("Adding floor");

        if (this.floors != null) {
            System.out.println("Floor: " + floorNumber);

            if (this.total < this.floors.length) {
                this.floors[this.total] = floorNumber;
                System.out.println("Stored at index: " + this.total);
                this.total++;
            } else {
                System.out.println("Lift is full");
            }
        } else {
            System.out.println("List not available");
        }
    }

    void searchFloor(int floorNumber) {
        System.out.println("Searching floor: " + floorNumber);

        boolean found = false;

        for (int i = 0; i < this.floors.length; i++) {
            if (this.floors[i] == floorNumber) {
                System.out.println("Found at index: " + i);
                found = true;
                break;
            }
        }

        if (found == false) {
            System.out.println("Floor not found");
        }
    }
}