/**
 *
 */
package sheridan;
import java.util.Arrays;
/**
 * @author Akshay Ghatge
 *
 */
public class Database{

	/**
	 * @Author:Akshay Ghatge
	 */

	//Initializing field variable
    private String[] _database;

	//Constructor one argument
	public Database(int size){
		_database=new String[size];
	}

	//Add method to add value in the array
    public void add(String value, int index){
        _database[index]= value;

    }

	//Sort method
	public void sort(){
		Arrays.sort(_database);
	}

	//find method
	public void find(String value){

		if(Arrays.binarySearch(_database,value) >= 0){
			System.out.println("Data Found");
		}
		else{
			System.out.println("Data not Found");
		}
	}

	//print Method
	public void print(){
		System.out.println(Arrays.toString(_database));
	}
}