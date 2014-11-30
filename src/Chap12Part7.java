public class Chap12Part7
{
	public static void main(String[] args)
	{
		Time theTime = new Time(9,0,1);
		Time aTime = new Time(9,0,0);

		if (theTime.equals(aTime))
			System.out.println("The times are the same.");
		else
			System.out.println("The times differ.");
	}
}