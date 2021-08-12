public abstract class Musician
{
	protected String name;
	protected String instrument;
	public void play()
	{
		System.out.printf("%s plays their %s.\n",this.name,this.instrument);
	}
	public void practice()
	{
		System.out.printf("%s runs some scales on their %s.\n",this.name,this.instrument);
	}
}
