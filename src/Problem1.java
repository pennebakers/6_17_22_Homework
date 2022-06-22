import java.util.Scanner;

public class Problem1 {

    public static void Problem1(){
        Scanner kbd = new Scanner(System.in);

        int inputValue = 0;
        boolean loopTrip = true;

        System.out.println("Enter Any Integer Greater Than 0: ");
        inputValue = kbd.nextInt();

        while(loopTrip){
            if(inputValue <= 0){
                System.out.println("Error, Enter Any Integer Greater Than 0: ");
                inputValue = kbd.nextInt();
            }
            else{
                loopTrip = false;
            }
        }

        for(int i = 1; i <= inputValue; i++){
            if(i % 3 == 0){
                System.out.println(i + " is a multiple of 3");
            }
            else{
                continue;
            }
        }



    }
}
