import java.util.Scanner;

public class Problem2 {
    public static void Problem2(){
        Scanner kbd = new Scanner(System.in);

        int inputValue = 0;
        int sum = 0;


        System.out.println("Please enter a positive integer: ");
        inputValue = kbd.nextInt();

        for(int i = 1; i <= inputValue; i++){
            if( i % 2 == 0){
                sum += i;
            }
            else{
                continue;
            }
        }

        System.out.println("The sume of all even numbers between 1 and " + inputValue + " is: " + sum);

    }
}
