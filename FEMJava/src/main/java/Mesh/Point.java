package Mesh;

public class Point {

// protected members
	final int id;
	final int x;
	final int y;
	final int z;
	final boolean fixed;

// constructors
	public Point(int id, int x, int y, int z, boolean fixed)
	{
		this.id = id;
		this.x  = x;
		this.y  = y;
		this.z  = z;
		this.fixed = fixed;
	}

}