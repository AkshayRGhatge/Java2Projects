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

	public Inventory(String id,String name,double sellPrice)
	{
		this.setId(id);
		this.setName(name);
		this.setSellPrice(sellPrice);
	}

	public Inventory(String id,String name,int qoh,int rop,double sellPrice)
	{
		this.setId(id);
		this.setName(name);
		this.setQoh(qoh);
		this.setRop(rop);
		this.setSellPrice(sellPrice);
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getQoh()
	{
		return qoh;
	}

	public void setQoh(int qoh)
	{
		this.qoh = qoh;
	}

	public int getRop()
	{
		return rop;
	}

	public void setRop(int rop)
	{
		this.rop = rop;
	}

	public double getSellPrice()
	{
		return sellPrice;
	}

	public void setSellPrice(double sellPrice)
	{
		this.sellPrice = sellPrice;
	}

	public String toString()
	{
		String  s1=this.id +"("+this.name+"), QOH:"+this.qoh+", Price: $"+this.sellPrice;
		System.out.println(s1);
		return s1;
	}

	public boolean isAlphabet(String name)
	{
		int c1=0;
		int c2=0;

		for(int i=0;i<name.length();i++)
		{
			char val1 = name.charAt(i);
			if(Character.isAlphabetic(val1))
			{
				c1++;
			}
			if(Character.isDigit(val1))
			{
				c2++;
			}
		}
		if(c1 == 3 && c2 == 4 && name.charAt(4) != '-')
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}//end of class

