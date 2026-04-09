class DayService{

    String scheduleName;
    int totalDays;
    String location;

    DayService(String scheduleName, int totalDays, String location) {
        this.scheduleName = scheduleName;
        this.totalDays = totalDays;
        this.location = location;
    }

    void displayServiceDetails(){
        System.out.println("Schedule Name : " + this.scheduleName);
        System.out.println("Total Days : " + this.totalDays);
        System.out.println("Location : " + this.location);
    }

    Day createDay(){
        Day day = new Day("Monday", "Weekday", 1);
        return day;
    }
}