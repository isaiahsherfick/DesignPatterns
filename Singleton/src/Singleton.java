public class Singleton
{
	private static Singleton onlyInstance;
	private Singleton() //PRIVATE CONSTRUCTOR
	{

	}
	public static Singleton getInstance()
	{
		if (onlyInstance == null)
		{
			onlyInstance = new Singleton();
		}
		return onlyInstance;
	}
}
