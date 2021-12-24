/**
 *
 */
package sheridan;

/**
 * @author AKSHAY
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1=new Player("Akshay",2.0,5,100.0);
		Player p2=new Player("Ark",2.0,6,90.0);

		p1.updateScore(3);
		p2.levelUp();
		p1.hitHealth();

		p2.updateScore(10);
		p2.levelUp();
		p1.printInfo();
		p2.printInfo();
	}

}
