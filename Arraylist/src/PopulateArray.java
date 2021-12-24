import java.io.File;
import java.io.PrintWriter;
import java.util.*;
public class PopulateArray {

	public static void main(String args[])
	{
		final int MAX=10;

		Person p1=new Person("Akshay","akshay@gmail.com");
		Person p2=new Person("Ark","ark@gmail.com");
		Person p3=new Person("Bains","bains@gmail.com");
		Person p4=new Person("Raghav","raghav@gmail.com");

		ArrayList<Person>person=new ArrayList<>();
		person.add(p1);
		person.add(p2);
		person.add(p3);
		person.add(p4);

		 try{

			 PrintWriter out =new PrintWriter("C:/temp/arraylist.txt");

			 for(int i=0;i<person.size();i++)
				 out.println(person.get(i).getName()+"."+person.get(i).getEmail());


			 out.close();
		 }
		 catch(Exception e)
		 {
			 System.out.println("File Not Found");
		 }

        finally{
        	System.out.println("Please check the file");
        }




	}


}
