public class NameTest
{
	public static void main(String[] args)
	{
		//instantiation
		Name myName = new Name("Maynard", "James", "Keenan");
		Name yourName = new Name("Robin", "Williams");
		Name aName = new Name("Floyd");
		Name someName;
		System.out.println("myName: " + myName.toString());
		System.out.println("yourName: " + yourName.toString());
	}
}