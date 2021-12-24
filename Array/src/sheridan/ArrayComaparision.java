/**
 *
 */
package sheridan;
import java.util.Arrays;
/**
 * @author AKSHAY
 *
 */
public class ArrayComaparision {

	/**
	 * @author :Akshay Ghatge
	 */
	//Initialization and declaring the method
	public boolean compareArrays(int[] arr1,int[] arr2)
	{
		return Arrays.equals(arr1,arr2);
	}
	public static void main(String[] args) {

		int[] array1={2,4,6,8,0};
		int[] array2={2,4,6,8,0};

		ArrayComaparision self=new ArrayComaparision();

		//to print the element of the array 1
		for(int index=0;index<array1.length;index++)
		{
			System.out.println("The element of the array 1 is:"+array1[index]);
		}

		//to print the element of the array 2
		for(int i=0;i<array2.length;i++)
		{
			System.out.println("The element of the array 2 is:"+array1[i]);
		}
        // printing the output whether array element are same or not
		System.out.println("Element of the array are same or not:"+self.compareArrays(array1, array2));

	}
}
