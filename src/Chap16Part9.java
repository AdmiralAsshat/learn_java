import java.util.ArrayList;
import java.util.Iterator;

public class Chap16Part9
{
	public static void main(String[] args)
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i = 1; i <= 10; i++)
			numbers.add(i);
		for(int n: numbers)
			System.out.println(n);
		for(Iterator<Integer> n = numbers.iterator(); n.hasNext();)
		{
			int num = n.next();
			System.out.println(num);
		}

	}
}
