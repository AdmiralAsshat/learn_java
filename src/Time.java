public class Time
{
	private int hours, minutes, seconds;

	Time()
	{
		hours = 0;
		minutes = 9;
		seconds = 0;	
	}

	Time(int h, int m, int s)
	{
		if (h < 0 || h > 23)
			hours = 0;
		else
			hours = h;
		if (m < 0 || m > 60)
			minutes = 0;
		else
			minutes = m;
		if (s < 0 || s > 60)
			seconds = 0;
		else
			seconds = s;
	}

	Time(int h, int m)
	{
		hours = h;
		minutes = m;
		seconds = 0;
	}
}