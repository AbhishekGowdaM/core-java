class DayRunner{
    public static void main(String[] args) {

        DayService service = new DayService("Weekly Plan", 7, "Mandya");
        service.displayServiceDetails();
        Day day = service.createDay();
        day.displayDay();
    }
}