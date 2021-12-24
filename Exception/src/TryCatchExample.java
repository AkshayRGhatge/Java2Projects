import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class TryCatchExample {
    private Random _rand = new Random();

    public static void main(String[] args) {
        // Create objects needed below
        Scanner inp = new Scanner(System.in);
        TryCatchExample self = new TryCatchExample();

        // Repeatedly prompt the user to enter a whole number then
        // print a random number from 1 to the number entered.

        while (true) {

            System.out.print("Please enter a whole number: ");
           try{
            int limit = inp.nextInt();
            if (limit == 0) {          // Quit when the user enters 0
                break;

            }

            // Generate and print random number
            int num = self.calculate(limit);
            System.out.println("The random number is " + num);
           }
           catch(InputMismatchException e)
           {
        	   System.out.println("Enter valid input");
        	   inp.nextLine();
           }
           catch(IllegalArgumentException e)
           {
        	   System.out.println("Enter valid input between range 1 to 100");
        	   inp.nextLine();
           }
           catch(NoSuchElementException e)
           {
        	   System.out.println("Error");
        	   break;
           }

        }
    }

    // Generate a random number from 1 to 'limit'.
    public int calculate(int limit) {
    	 if(limit<=0 || limit >100)
    		throw new IllegalArgumentException ("Error  of limit");

              return _rand.nextInt(limit) + 1;
    }

}