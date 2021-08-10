public class Duck
{

	private IFly flyStrategy;
	private IQuack quackStrategy;

	public Duck(IFly fs, IQuack qs)
	{
		this.flyStrategy = fs;
		this.quackStrategy = qs;
	}

	public String quack()
	{
		return this.quackStrategy.quack();
	}

	public String fly()
	{
		return this.flyStrategy.fly();
	}

	public static void main(String[] args)
	{
		System.out.println("Beginning duck test.");
		Duck c = new CityDuck();
		System.out.println("\nCity duck:");
		System.out.println(c.fly() + " " + c.quack());
		Duck f = new ForestDuck();
		System.out.println("\nForest duck:");
		System.out.println(f.fly() + " " + f.quack());
		Duck m = new MountainDuck();
		System.out.println("\nMountain duck:");
		System.out.println(m.fly() + " " + m.quack());
		Duck r = new RubberDuck();
		System.out.println("\nRubber duck:");
		System.out.println(r.fly() + " " + r.quack());
	}
}
