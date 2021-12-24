package sheridan;

public class ArrParm {
	public static void main(String[] args) 
	{
		ArrParm self = new ArrParm(); // Object of this class
		int[] numbers = {29,5,-7,101,-555};
		// Initialize array
		// Call method to calculate the average and print it
		System.out.println("The average is " + self.ave(numbers));
	}
	public double ave(int[] arr)
	{
		int total = 0;
		for (int index = 0; index < arr.length; index++)
		{total += arr[index]; 
		// Add up all the 
		}
		return (double)total/arr.length; // Calculate the average}}
	}
}

