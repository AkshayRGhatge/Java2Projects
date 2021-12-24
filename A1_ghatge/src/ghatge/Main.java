package ghatge;

import java.util.Scanner;
/**
 * @author AKSHAY GHATGE
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String args[])
	{
		Inventory self = new Inventory();
		Scanner input = new Scanner(System.in);

		boolean value;
		do
		{
			System.out.print("Enter Inventory Item ID:");
			String i_id = input.next();
			value = self.isAlphabet(i_id);
			self.setId(i_id);
			if(value != true)
			{
				System.out.println("Error:Inventory ID must be in the form ABC-1234");
			}
		}while(value != true);


	    while(true)
		{
	    	String s2="";
	    	String s3=null;
			System.out.print("Enter Item Name:");
			String s1=input.next();
			self.setName(s1);
			if(s1.equals(s2) || s1.equals(s3))
			{
				System.out.println("Error:you must enter an item name");
			}
			else
			{
				break;
			}
		}

		int qty;
		while(true)
		{
			System.out.print("Qty on hand:");
			qty=input.nextInt();
			self.setQoh(qty);
			if(qty < 0)
			{
				System.out.println("Error:QOH must be 0 or more");
			}
			else
			{
				break;
			}

		}


		int reoPoint;
		while(true)
		{
			System.out.print("Re-Order Point:");
			reoPoint=input.nextInt();
			self.setRop(reoPoint);
			if(reoPoint < 0)
			{
				System.out.println("Error: ROP must be 0 or more");
			}
			else
			{
				break;
			}

		}

		while(true)
		{
			System.out.print("Selling Price:");
			double sellingPrice=input.nextDouble();
			self.setSellPrice(sellingPrice);
			if(sellingPrice < 0)
			{
				System.out.println("Error: Selling Price must be 0 or more");
			}
			else
			{
				break;
			}
		}

		self.toString();

		if(reoPoint >= qty)
		{
			System.out.println("You need to order more:"+self.getName()+","+self.getRop()+"kg");
		}

		System.out.print("Enter # of unit to buy:");
		double total=input.nextDouble();
		if(total >= 0)
		{
			System.out.printf("Total Cost: %.2f",+total*self.getSellPrice()*13);
		}
		else
		{
			System.out.printf("Total Cost: $0.00");
		}


	}

}

