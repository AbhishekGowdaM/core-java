class LiftRunner{
    public static void main(String[] args){

        LiftSystem lift = new LiftSystem();

        lift.addFloor(1);
        lift.addFloor(2);
        lift.addFloor(3);
        lift.addFloor(4);
        lift.addFloor(5);

        lift.addFloor(6);

        lift.searchFloor(3);
        lift.searchFloor(6);
    }
}