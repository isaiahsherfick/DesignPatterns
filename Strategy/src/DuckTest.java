import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuckTest
{
	@Test 
	void MountainDuckTest()
	{
		m = new MountainDuck();
		assertEquals("This duck flies far.", m.fly());
		assertEquals("Quack!", m.quack());
	}
	@Test 
	void ForestDuckTest()
	{
		m = new MountainDuck();
		assertEquals("This duck flies far.", m.fly());
		assertEquals("Quack!", m.quack());
	}
	@Test 
	void CityDuckTest()
	{
		m = new MountainDuck();
		assertEquals("This duck flies briefly.", m.fly());
		assertEquals("Quack!", m.quack());
	}
	@Test 
	void MountainDuckTest()
	{
		m = new MountainDuck();
		assertEquals("This duck does not fly.", m.fly());
		assertEquals("...", m.quack());
	}
}


