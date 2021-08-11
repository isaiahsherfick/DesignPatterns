public class Main
{
	public static void main(String[] args)
	{
		Beverage decafWithSoy = new SoyDecorator(new Decaf());
		System.out.printf("%s: %d\n",decafWithSoy.getDescription(),decafWithSoy.getCost());

		Beverage espressoWithSoy = new SoyDecorator(new Espresso());
		System.out.printf("%s: %d\n",espressoWithSoy.getDescription(),espressoWithSoy.getCost());

		Beverage decafWithSoyAndCaramel = new CaramelDecorator(new SoyDecorator(new Decaf()));
		System.out.printf("%s: %d\n",decafWithSoyAndCaramel.getDescription(),decafWithSoyAndCaramel.getCost());

		Beverage espressoWithSoyAndCaramelAnd2EspressoShots = new ExtraEspressoShotDecorator(new ExtraEspressoShotDecorator(new CaramelDecorator(new SoyDecorator(new Espresso()))));
		System.out.printf("%s: %d\n",espressoWithSoyAndCaramelAnd2EspressoShots.getDescription(),espressoWithSoyAndCaramelAnd2EspressoShots.getCost());
		
	}
}
