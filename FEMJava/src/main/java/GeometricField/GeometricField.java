package GeometricField;

public class GeometricField {
// Generic class for a geometric field

// Protected members
   protected final String type;
   protected final String name;
   protected final int sizeX;
   protected final int sizeY;
   protected double[][] field;
   protected double[][] previousfield;

// Constructors
   protected GeometricField(String name, String type, int sizeX, int sizeY) {
   	// Construct an empty geometric field
      this.name  = name;
      this.type  = type;
      this.sizeX = sizeX;
      this.sizeY = sizeY;
      this.field = new double[sizeX][sizeY];
      this.previousfield = new double [sizeX][sizeY];
   }

   protected GeometricField(String name, String type, double[][] field) {
   	// Construct a geometric field from an array
      this.name  = name;
      this.type  = type;
      this.sizeX = field.length;
      this.sizeY = field[0].length;
      this.field = field;
      this.previousfield = new double [this.sizeX][this.sizeY];
   }

   protected GeometricField(GeometricField geo) {
   	// construct as a copy
      this.name  = geo.name;
      this.type  = geo.type;
      this.sizeX = geo.sizeX;
      this.sizeY = geo.sizeY;
      this.field = geo.field;
      this.previousfield = geo.previousfield;
   }

// Public Operators

	public String name() {
	// Returns  type name dimX x dimY.
	  return this.type + " " + this.name + ": " + this.sizeX + "x" + this.sizeY + "." ;
	}

	public double val(int indexX, int indexY) {  
	// Returns the value of the vector for a given index.
	  
	  if( indexX >= this.sizeX){
	  	throw new IllegalArgumentException(outofbounds(indexX,indexY));
	  }
	  if( indexY >= this.sizeY){
	  	throw new IllegalArgumentException(outofbounds(indexX,indexY));
	  }

	  return this.field[indexX][indexY];     
	}

	public void update(double[][] values) {
	// Updates the entire Geometric Field with a new field.
	   
	  if( values.length >= this.sizeX){
	  	throw new IllegalArgumentException(outofbounds(values.length,values[0].length));
	  }
	  if( values[0].length >= this.sizeY){
	  	throw new IllegalArgumentException(outofbounds(values.length,values[0].length));
	  }

	  this.field = values;
	}

	public void update(int indexX, int indexY, double value) {
	// Updates a specific value of the array using an index
	   
	  if( indexX >= this.sizeX){
	  	throw new IllegalArgumentException(outofbounds(indexX,indexY));
	  }
	  if( indexY >= this.sizeY){
	  	throw new IllegalArgumentException(outofbounds(indexY,indexY));
	  }

	  this.field[indexX][indexY] = value;
	}

	public void update(GeometricField field) {
	// Updates a specific value of the array using an index
	   
	  if( field.sizeX != this.sizeX && field.sizeY != this.sizeY && field.name  != this.name)
	  {
	  	throw new IllegalArgumentException("Attempeted to replace blablabla");
	  }

	  this.field = field.field;
	}

	public GeometricField add(GeometricField f2) {
	// returns a copy of this field + a field f2	
		GeometricField result = new GeometricField(this);

		if( this.sizeX == f2.sizeX && this.sizeY == f2.sizeY )
		{
			for(int i=0; i<sizeX; i++)
			{
				for(int j=0; j<sizeY; j++)
				{
					result.field[i][j] = this.field[i][j] + f2.field[i][j];
				}
			}
		}
		else
		{
			throw new IllegalArgumentException("Attempted to sum " + this.name  + " with " + f2.name + ".");
		}

		return result;
	}

	public void storePrevious() {
		previousfield = field;
	}

// Protected Operators

   protected String outofbounds(int indexX,int indexY) {
    // prints an out of bond error message and crashes the code.

	   return "Attempted to acess index of " + this.name + "out of bounds. \n" 
       + ". Index requested: " + indexX + "x" + indexY + ".";
   }

}
