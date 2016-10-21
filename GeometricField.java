public class GeometricField {
// Generic class for a geometric field

// Protected members
   protected final String type;
   protected final String name;
   protected final int sizeX;
   protected final int sizeY;
   protected double[][] field;

// Constructors
   protected GeometricField(String name, String type, int sizeX, int sizeY) {
      this.name  = name;
      this.type  = type;
      this.sizeX = sizeX;
      this.sizeY = sizeY;
      this.field = new double[sizeX][sizeY];
   }

// Public Operators

	public String name() {
	  return this.type + " " + this.name + ": " + this.sizeX + "x" + this.sizeY + "." ;
	}

	public double val(int indexX, int indexY) {  
	// Returns the value of the vector for a given index.
	  
	  if( indexX >= this.sizeX){
	  	throw new IllegalArgumentException(outofbounds(indexX));
	  }
	  if( indexY >= this.sizeY){
	  	throw new IllegalArgumentException(outofbounds(indexY));
	  }

	  return this.field[indexX][indexY];     
	}

	public void update(double[][] values) {
	// Updates the entire Geometric Field with a new field.
	   
	  if( values.length >= this.sizeX){
	  	throw new IllegalArgumentException(outofbounds(values.length));
	  }
	  if( values[0].length >= this.sizeY){
	  	throw new IllegalArgumentException(outofbounds(values[0].length));
	  }

	  this.field = values;
	}

	public void update(int indexX, int indexY, double value) {
	// Updates a specific value of the array using an index
	   
	  if( indexX >= this.sizeX){
	  	throw new IllegalArgumentException(outofbounds(indexX));
	  }
	  if( indexY >= this.sizeY){
	  	throw new IllegalArgumentException(outofbounds(indexY));
	  }

	  this.field[indexX][indexY] = value;
	}


// Protected Operators

   protected String outofbounds(int index) {
    // prints an out of bond error message and crashes the code.

	   return "Attempted to acess index of " + this.type  + " " + this.name + "out of bounds. \n" 
	   + this.type + " size: " + this.sizeX + "x" + this.sizeY 
       + ". Index requested: " + index + ".";
   }

}
