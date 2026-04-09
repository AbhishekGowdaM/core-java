class Tower{

    String name;
    String location;
    int height;

    Tower(String name, String location, int height) {
        this.name = name;
        this.location = location;
        this.height = height;
    }

    void displayTower() {
        System.out.println("Tower Name : " + this.name);
        System.out.println("Location : " + this.location);
        System.out.println("Height : " + this.height);
    }
}