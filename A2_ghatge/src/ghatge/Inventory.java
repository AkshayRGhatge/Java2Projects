package ghatge;
public class Inventory
{

	private String id="ABC-1234";
	private String name="New Item";
	private int qoh=0;
	private int rop=25;
	private double sellPrice=0;
	public Inventory()
	{

	}

	public Inventory(String id_1,String name_1,double sellPrice_1)
	{
		this.setId(id_1);
		this.setName(name_1);
		this.setSellPrice(sellPrice_1);
	}

	public Inventory(String id_1,String name_1,int qoh_1,int rop_1,double sellPrice_1)
	{
		this.setId(id_1);
		this.setName(name_1);
		this.setQoh(qoh_1);
		this.setRop(rop_1);
		this.setSellPrice(sellPrice_1);
	}

	public String getId()
	{
		return id;

	}

	public void setId(String id_)
	{

		id_ = id;

	}

	public String getName()
	{
		return name;
	}

	public void setName(String name_)
	{
		name_ = name;
	}

	public int getQoh()

	{

		return qoh;

	}

	public void setQoh(int qoh_)

	{
		qoh_ = qoh;
	}


	public int getRop()

	{
		return rop;

	}

	public void setRop(int rop_)

	{
		rop_ = rop;

	}


	public double getSellPrice()

	{
		return sellPrice;

	}

	public void setSellPrice(double sellPrice_)

	{
		sellPrice_ = sellPrice;
	}

	public String toString()

	{

		String  result=this.id +"("+this.name+"), QOH:"+this.qoh+", Price: $"+this.sellPrice;
		System.out.println(result);
		return result;
	}

	public boolean isAlphabet(String name)

	{
		int a=0;

		int b=0;

		for(int i=0;i<name.length();i++)

		{
			char val1 = name.charAt(i);

			if(Character.isAlphabetic(val1))

			{
				a++;
			}

			if(Character.isDigit(val1))
			{
				b++;
			}

		}

		if(a == 3 && b == 4 && name.charAt(4) != '-')
		{
			return true;
		}
		else

		{
			return false;
		}
	}

}//end of class