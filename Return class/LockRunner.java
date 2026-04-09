class LockRunner{
    public static void main(String[] args) {
       
	   LockService service = new LockService("Hardware Store", 8, "Mandya");
       service.displayServiceDetails();
       Lock lock = service.createLock();
       lock.displayLock();
    }
}