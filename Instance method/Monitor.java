class Monitor{
    String brand;
    int size;

    Monitor(String brand, int size){
        this.brand = brand;
        this.size = size;
    }

    void displayDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Size: " + size + " inches");
    }
}