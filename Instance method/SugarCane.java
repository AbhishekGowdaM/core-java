class SugarCane{
    int weight;
    double sugarContent;

    SugarCane(int weight, double sugarContent){
        this.weight = weight;
        this.sugarContent = sugarContent;
    }

    void displayDetails(){
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Sugar Content: " + sugarContent + " %");
    }
}