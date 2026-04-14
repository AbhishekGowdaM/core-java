class SolarSystem{
    String[] planets = new String[5];
    int total;

    void addPlanet(String name) {
        System.out.println("Adding planet");

        if (this.planets != null) {
            System.out.println("Planet: " + name);

            if (this.total < this.planets.length) {
                this.planets[this.total] = name;
                System.out.println("Stored at index: " + this.total);
                this.total++;
            } else {
                System.out.println("No space left");
            }
        } else {
            System.out.println("List not available");
        }
    }

    void searchPlanet(String name) {
        System.out.println("Searching planet: " + name);

        if (name != null) {
            boolean found = false;

            for (int i = 0; i < this.planets.length; i++) {
                if (this.planets[i] == name) {
                    System.out.println("Found at index: " + i);
                    found = true;
                    break;
                }
            }

            if (found == false) {
                System.out.println("Planet not found");
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}