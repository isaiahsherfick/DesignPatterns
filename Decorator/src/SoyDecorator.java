public class SoyDecorator extends AddonDecorator
{
	public SoyDecorator(Beverage b)
	{
		this.setBeverage(b);
	}
	public String getDescription()
	{
		return this.getBeverage().getDescription() + " + soy";
	}
	public int getCost()
	{
		return this.getBeverage().getCost() + 2;
	}
}
