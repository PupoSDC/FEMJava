package Mesh;

public class Point {

// protected members
	final int id;
	final int x;
	final int y;
	final int z;
	boolean fixed;

// constructors
	public Point(int id, int x, int y, int z)
	{
		this.id = id;
		this.x  = x;
		this.y  = y;
		this.z  = z;
		this.fixed = false;
	}

}