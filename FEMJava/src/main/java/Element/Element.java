package Element;
import  GeometricField.*;

public abstract class Element {
// Generic class for an Element (for now spring element)

  protected final String      type;
  protected final int         numberofpoints;
  protected final int         numberofDOFs;  
  protected final Point[]     points;
  protected       double[][]  stiffness;

  // Constructor
  protected Element(int numberofpoints, int numberofDOFs, String type, Point[] pointlist)
  {
    if (pointlist.length != numberofpoints)
    {
      throw new IllegalArgumentException( 
        "Input Error: " + type + " uses exactly "
        + this.numberofpoints +" points!");
    }

    this.numberofpoints = numberofpoints;
    this.numberofDOFs   = numberofDOFs;
    this.type           = type;
    this.stiffness      = new double[numberofpoints*numberofDOFs][numberofpoints*numberofDOFs];
    this.points         = pointlist;   
  }

  // Private opreators
    
    abstract protected void contructStiffness();

  // public operators 


} 
