package day16_switch_ternary;

public class Elevetor {
    public static void main(String[] args){
        int floorNum = 4;

        if(floorNum == 1){
            System.out.println("Floor 1 selected. Companies: Lobby," +
                    "verizon, Starbucks");
        }else if(floorNum == 2){
            System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");

        }else if(floorNum == 3){
            System.out.println("Floor 3 selected.Companies: Lyft, BofA, Stake house");

        }else{
            System.out.println("Invalied floor  " + floorNum);
        }
         switch(floorNum){
             case 1:
                 System.out.println("Floor 1 selected. Companies: Lobby," +
                         "verizon, Starbucks");
                 break;//exit the switch statement
             case 2:
                 System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
                 break;
             case 3:
                 System.out.println("Floor 3 selected.Companies: Lyft, BofA, Stake house");
             default:
                 System.out.println("invalid floor  "+floorNum);
                 break;
         }

    }
}
