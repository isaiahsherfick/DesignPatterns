import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
public class MusicianFactory
{
	private boolean trumpeter,guitarist,bassist,saxophonist,pianist;
	public MusicianFactory()
	{
		this.trumpeter = false;
		this.guitarist = false;
		this.bassist = false;
		this.saxophonist = false;
		this.pianist = false;
	}
	public Musician randomMusician()
	{
		while(true)
		{
			//random int from 0-4
			int x = ThreadLocalRandom.current().nextInt(0,5);
			if (x == 0)
			{
				if (!this.trumpeter)
				{
					this.trumpeter = true;
					return new Trumpeter("Miles Davis");
				}
			}
			else if (x == 1)
			{
				if (!this.guitarist)
				{
					this.guitarist = true;
					return new Guitarist("Joe Pass");
				}
			}
			else if (x == 2)
			{
				if (!this.bassist)
				{
					this.bassist = true;
					return new Bassist("Jaco Pastorious");
				}
			}
			else if (x == 3)
			{
				if (!this.saxophonist)
				{
					this.saxophonist = true;
					return new Saxophonist("John Coltrane");
				}
			}
			else if (x == 4)
			{
				if (!this.pianist)
				{
					this.pianist = true;
					return new Pianist("Oscar Peterson");
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
