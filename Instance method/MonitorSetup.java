class MonitorSetup{
    String ownerName;
    int price;
    Monitor monitor;
    String country = "India";
    MonitorType type;

    MonitorSetup(String ownerName, int price, Monitor monitor, MonitorType type){
        this.ownerName = ownerName;
        this.price = price;
        this.monitor = monitor;
        this.type = type;
    }

    void showDetails(){
        System.out.println("Owner: " + ownerName);
        System.out.println("Price: " + price);
        System.out.println("Country: " + country);
        System.out.println("Type: " + type);

        if (monitor != null){
            monitor.displayDetails();
        } else {
            System.out.println("No monitor details");
        }
    }
}