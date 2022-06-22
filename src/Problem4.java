import java.util.Scanner;

public class Problem4 {

    public static void Problem4(){
        Scanner kbd = new Scanner(System.in);

        int input = 0;
        int sum = 0;

        System.out.println("Enter an Integer: ");
        input = kbd.nextInt();

        if(input < 0) {
            input *= -1;
        }

        String stringInput = Integer.toString(input);

        for(int i = 0; i < stringInput.length(); i++){
            sum += Integer.parseInt(String.valueOf(stringInput.charAt(i)));
        }

        System.out.println("The sum of all digits of " + stringInput + " is: " + sum);
    }
}
