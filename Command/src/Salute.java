public class Salute implements ICommand
{
	private Soldier s;
	public Salute(Soldier s)
	{
		this.s = s;
	}
	public void execute()
	{
		System.out.printf("%s salutes the drill sergeant\n",s.getName());
	}
}

