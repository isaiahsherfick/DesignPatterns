public abstract class Musician
{
	protected String name;
	protected String instrument;
	public void play()
	{
		System.out.printf("%s plays the %s.\n",this.name,this.instrument);
	}
	public void practice()
	{
		System.out.printf("%s runs some scales on the %s.\n",this.name,this.instrument);
	}
}
