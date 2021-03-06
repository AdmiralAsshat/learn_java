public class Rectangle_interface implements Shape_interface
{
	private int x;
	private int y;
	private int width;
	private int height;

	Rectangle_interface(int xcor, int ycor, int w, int h)
	{
		x = xcor;
		y = ycor;
		width = w;
		height = h;
	}

	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}

	public void setX(int xcor)
	{
		x = xcor;
	}

	public void setY(int ycor)
	{
		y = ycor;
	}

	public void draw()
	{
		System.out.println("Drawing a rectangle");
	}
}