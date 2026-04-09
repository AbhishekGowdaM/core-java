class Day{

    String name;
    String type;
    int number;

    Day(String name, String type, int number){
        this.name = name;
        this.type = type;
        this.number = number;
    }

    void displayDay(){
        System.out.println("Day Name : " + this.name);
        System.out.println("Type : " + this.type);
        System.out.println("Day Number : " + this.number);
    }
}