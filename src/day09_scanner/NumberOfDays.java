package day09_scanner;

public class NumberOfDays {

    public static void main(String[] args) {

        int month = 9;

        String result = "";

        switch (month){
            case 2 :
                result ="28 Days";
            break;

            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                result = "31 Days";
                break;

            case 4: case 6: case 9: case 11:
                result = "30 Days";
                break;

            default:
                result = "No such a month";

        }
        System.out.println(result);












    }
}
