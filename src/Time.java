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

	public String toString()
	{
		return "Hours: " + hours + "\n" +
				"Minutes " + minutes + "\n" + 
				"Seconds " + seconds;
	}

	public String display()
	{
		String hrs, mins, secs;
		if (hours < 10)
			hrs = "0" + hours;
		else
			hrs = hours + "";
		if (minutes < 10)
			mins = "0" + minutes;
		else
			mins = minutes + "";
		if (seconds < 10)
			secs = "0" + seconds;
		else
			secs = seconds + "";

		return hrs + ":" + mins + ":" + secs;
	}
}