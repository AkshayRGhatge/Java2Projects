/**
 *
 */
package sheridan;
import java.util.Scanner;
/**
 * @author Akshay Ghatge
 *
 */
public class DatabaseTester {
	//field variable
	private static final int _size=10;

	public static void main(String[] args) {
		//creating an object
		Database self=new Database(_size);
		Scanner input=new Scanner(System.in);

		String value;

		//for loop use to add value in the array
        for(int index=0;index<_size;index++){
            System.out.print("Enter some value to Compare: ");
            value=input.next();
            self.add(value, index);

        }

		//printing
        System.out.println("Element of the Array are:");

		self.print();//calling the print method

        System.out.println("Sorted Array:");
		self.sort();//calling the sort method


		self.print();//for calling the sorted array print

		self.find("Akshay");//call find method


	}//end of main method

}//end of class DatabaseTester
