class MonitorRunner{
    public static void main(String[] args) {
        Monitor monitor = new Monitor("LG", 24);
        MonitorSetup monitorsetup = new MonitorSetup( "Abhishek", 18000,monitor,MonitorType.LED);
        monitorsetup.showDetails();
    }
}