/**
 *
 */
package sheridan;
import java.util.Scanner;
/**
 * @author AKSHAY
 *
 */
public class MaxOverloadning {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MaxOverloadning self=new MaxOverloadning();
		System.out.println("The max number between 2 integer is"+self.max(2,3));
		System.out.println("The max number between 2 double is"+self.max(8.6,2.5));
		System.out.println("The max number between 3 integer is"+self.max(2,5,8));

	}
	public int max(int num1,int num2)
	{
		return Math.max(num1,num2);
	}
    public double max(double num1,double num2)
    {
    	return Math.max(num1,num2);
    }
    public int max(int num1,int num2,int num3)
    {
    	return Math.max(Math.max(num1,num2),num3);
    }
}
