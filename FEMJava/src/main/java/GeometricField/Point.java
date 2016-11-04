package GeometricField;

public class Point {

// protected members
	final private int id;
	final private int x;
	final private int y;
	final private int z;
	private boolean[] constrain = new boolean[6]; // [x,y,z,xx,yy,zz]

// constructors
	public Point(int id, int x, int y, int z)
	{
		this.id    = id;
		this.x     = x;
		this.y     = y;
		this.z     = z;
	}

// public operators
	public double x(){ return this.x; }
	public double y(){ return this.x; }
	public double z(){ return this.x; }
}