public class Employee
{
	private String name;
	protected int salary;

	Employee(String n, int s)
	{
		name = n;
		salary = s;
	}

	public String getName()
	{
		return name;
	}

	public int getSalary()
	{
		return salary;
	}

	public String displayEmpInfo()
	{
		return "Name: " + name + "\n" +
				"Salary: " + salary + "\n";
	}
}