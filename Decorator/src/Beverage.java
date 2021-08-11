public abstract class Beverage
{
	private String description;
	private int cost;
	public String getDescription()
	{
		return this.description;
	}
	public int getCost()
	{
		return this.cost;
	}
	public void setCost(int cost)
	{
		this.cost = cost;
	}
	public void setDescription(String desc)
	{
		this.description = desc;
	}
}
