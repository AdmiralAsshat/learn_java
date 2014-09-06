public class DateTest
{
	public static void main(String[] args)
	{
		Date today = new Date(9,6,2014);
		Date tomorrow = new Date(9,7,2014);

		System.out.println("Today is " + today.toString());
		System.out.println("Tomrrow is " + tomorrow.toString());

		tomorrow.setDay(5);
		System.out.println("Tomrrow is " + tomorrow.toString());
		System.out.println("Today is again " + today.getMonth() + "/" +
							today.getDay() + "/" + today.getYear());
	}
}