package Applicaton;

public class Elevator {

    private int[] Floor_no;
    Integer buttonpressed;
    Integer currentFloor=5;

    public Elevator(Integer FloorNo) {
        int[] Floor_no = new int[]{ -1,0,1,2,3,4,5 };
    }

    public void startelevator(int buttonpressed){
        System.out.println("ButtonPress" +buttonpressed);
        System.out.println("Current Floor" +currentFloor);
           while (buttonpressed <= currentFloor) {
               goUp();
           }

       }


    public void goUp(){
            System.out.println("Move up");

    }
}



