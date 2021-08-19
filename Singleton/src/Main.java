public class Main
{
	public static void main(String[] args)
	{
		Singleton s = Singleton.getInstance();
		System.out.println(s);
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s == s2);
		System.out.println(s == s3);
		System.out.println(s2 == s3);
	}
}
