import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
public class MusicianFactory
{
	private boolean trumpeter,guitarist,bassist,saxophonist,pianist = false;
	public Musician randomMusician()
	{
		//random int from 0-4
		while(true)
		{
			int x = ThreadLocalRandom.current().nextInt(0,5);
			if (x == 1)
			{
				if (!this.trumpeter)
				{
					return new Trumpeter("Miles Davis");
				}
			}
			else if (x == 2)
			{
				if (!this.guitarist)
				{
					return new Guitarist("Joe Pass");
				}
			}
			else if (x == 3)
			{
				if (!this.bassist)
				{
					return new Bassist("Jaco Pastorious");
				}
			}
			else if (x == 4)
			{
				if (!this.saxophonist)
				{
					return new Saxophonist("John Coltrane");
				}
			}
			else if (x == 5)
			{
				if (!this.pianist)
				{
					return new Trumpeter("Oscar Peterson");
				}
			}
		}
	}
	public static void main(String[] args)
	{
		MusicianFactory juliard = new MusicianFactory();
		ArrayList<Musician> band = new ArrayList<>();
		for (int i=0;i<5;i++)
		{
			band.add(juliard.randomMusician());
		}
		for (int i=0;i<5;i++)
		{
			band.get(i).play();
		}
	}
}
