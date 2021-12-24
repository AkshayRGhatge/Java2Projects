/**
 *
 */
package sheridan;

/**
 * @author AKSHAY
 *
 */
public class Player {
	private String _name;
	private double _score;
	private int _currentlevel;
	private double _healthpercent;

	public Player(String name,double score,int currentlevel,double healthpercent)
	{
		_name=name;
		_score=score;
		_currentlevel=currentlevel;
		_healthpercent=healthpercent;

	}
	public void setName(String newName)
	{
		this._name=newName;
	}

	public String getName()
	{
		return _name;
	}

	public void setScore(double newScore)
	{
		this._score=newScore;
	}

	public double getScore()
	{
		return _score;
	}
	public void setLevel(int newcurrentLevel)
	{
		this._currentlevel=newcurrentLevel;
	}

	public int getLevel()
	{
		return _currentlevel;
	}
	public void sethealthpercent(double newhealthpercent)
	{
		this._healthpercent=newhealthpercent;
	}
	public double gethealthpercent()
	{
		return _healthpercent;
	}

    public void updateScore(double updatedScore)
    {
    	_score=_score+updatedScore;

    }
    public void levelUp()
    {
    	_currentlevel++;

    }
    public void hitHealth()
    {
    _healthpercent -= 5.5;

    }
    public void printInfo()
    {
    System.out.println("Name:"+this._name);
    System.out.println("Score:"+this._score);
    System.out.println("CurrentLevel:"+this._currentlevel);
    System.out.println("healthpercent:"+this._healthpercent);
    }
}