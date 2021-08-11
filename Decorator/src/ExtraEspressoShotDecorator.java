public class ExtraEspressoShotDecorator extends AddonDecorator
{
	public ExtraEspressoShotDecorator(Beverage b)
	{
		this.setBeverage(b);
	}

	public String getDescription()
	{
		return this.getBeverage().getDescription() + " + extra espresso shot";
	}
	public int getCost()
	{
		return this.getBeverage().getCost() + 1;
	}
}
