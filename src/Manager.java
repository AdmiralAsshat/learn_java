public class Manager extends Employee
{
	private String department;

	Manager(String n, int s, String d)
	{
		super(n, s);
		department = d;
	}

	public String getDepartment()
	{
		return department;
	}
}