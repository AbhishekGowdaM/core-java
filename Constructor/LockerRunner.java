class LockerRunner{
    public static void main(String[] args) {

        Locker l1 = new Locker();
        l1.displayDetails();

        Locker l2 = new Locker("Godrej", "Home", 15000.0);
        l2.displayDetails();

        Locker l3 = new Locker("Samsung", "Office", 20000.0);
        l3.displayDetails();

        Locker l4 = new Locker("LG", "Digital", 30000.0, "Grey");
        l4.displayDetails();

        Locker l5 = new Locker("SafeBox", "Premium", 50000.0, "Black");
        l5.displayDetails();
    }
}