package day08_ternary_switch;

public class elevator {

    public static void main(String[] args) {

        int floorNumber = 4;

        String result ="Invalid Floor";

        if (floorNumber >=1 && floorNumber <= 3){
            result = "Floor "+floorNumber+" is selected.Companies: ";

            if( floorNumber == 1){
                result += "Lobby, Verizon, Starbucks";
            }else if(floorNumber == 2){
                result +="Cydeo, NASA, Intelsat";
            }else{
                result += "Lyft, BofA, Stake house";
            }


        }else{
            result = "Invalid Floor";
        }

        System.out.println(result);









    }
}
 /*
        if(floorNumber >= 1 && floorNumber <= 3){
            if(floorNumber == 1){
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
            }else if(floorNumber == 2){
                System.out.println("Floor 2 selected. Companies: Cydeo, NASA, Intelsat");
            }else{
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
            }
        }else{
            System.out.println("Invalid floor");
        }
*/
