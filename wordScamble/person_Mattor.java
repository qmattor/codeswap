//Quincy Mattor
//java
//3/31/21
package wordScamble;

public class person_Mattor {
	private String Name;
	private double Height;
	private double Weight;
	public person_Mattor()
	{
		Name = "";
		Height = 0;
		Weight = 0;
	}
	public person_Mattor(String name)
	{
		Name = name;
		Height = 0;
		Weight = 0;
	}
	public person_Mattor(String name, double height, double weight)
	{
		Name = name;
		Height = height;
		Weight = weight;
	}
	public String getName()
	{
		return Name;
	}
	public double getHeight()
	{
		return Height;
	}
	public double getWeight()
	{
		return Weight;
	}
	public void setName(String name)
	{
		Name = name;
	}
	/* testing player_Mattor
	public static void main(String args[])
	{
		person_Mattor p = new person_Mattor("fren");
		try {
			p.setHeight(-2);
		}
		catch (Exception e)
		{
			System.out.println("this worked as intended");
		}
	}
	*/
	public void setHeight(double height) throws Exception
	{
		if (height >= 0)
			Height = height;
		else
			throw new Exception("person.java: height was a negative value");
	}
	public void setWeight(double weight) throws Exception
	{
		if (weight >= 0)
			Weight = weight;
		else
			throw new Exception("person.java: weight was a negative value");
	}
}
