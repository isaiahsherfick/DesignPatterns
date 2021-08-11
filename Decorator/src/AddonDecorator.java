public abstract class AddonDecorator extends Beverage
{
	private Beverage beverage;
	public void setBeverage(Beverage b)
	{
		this.beverage = b;
	}
	public Beverage getBeverage()
	{
		return this.beverage;
	}
}
