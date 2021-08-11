public class CaramelDecorator extends AddonDecorator
{
	public CaramelDecorator(Beverage b)
	{
		this.setBeverage(b);
	}
	public String getDescription()
	{
		return this.getBeverage().getDescription() + " + caramel";
	}
	public int getCost()
	{
		return this.getBeverage().getCost() + 1;
	}
}
