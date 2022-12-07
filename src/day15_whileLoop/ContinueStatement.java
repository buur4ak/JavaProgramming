package day15_whileLoop;

public class ContinueStatement {

    public static void main(String[] args) {


        for (int i = 1; i < 6; i++) {

            if( i == 2){
                continue;
            }

            System.out.println(i);

        }

        System.out.println("------------------------------------------------");

        for (int i = 10; i < 21 ; i++) {

            if(i %2 == 0){ // if i is even
                continue; //skip the current iteration
            }

            System.out.println(i);


        }

        System.out.println("------------------------------------------------");

        for ( char i = 'A'; i <= 'G'; i++){

            if(i == 'B' || i == 'C' || i == 'D')
                continue;

            System.out.println(i);

        }





    }
}
