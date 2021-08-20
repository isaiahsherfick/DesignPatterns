public class March implements ICommand
{
	private Soldier s;
	public March(Soldier s)
	{
		this.s = s;
	}
	public void execute()
	{
		System.out.printf("%s marches in step\n",s.getName());
	}
}
