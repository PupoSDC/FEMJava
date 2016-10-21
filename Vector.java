public class Vector extends GeometricField {

// protected members

   protected double[] vectorValuesPrevious;

// constructors

   public Vector(String name, int size) {
      super(name,"vector",1,size);
      vectorValuesPrevious = field[0];
   }

// Public operators

   public double val(int index) {
   // Returns the value of the vector for a given index.  
      return super.val(0,index);
   }

   public void update(double[] values) {
    // Updates the entire vector with a new array.
      double[][] anArray = new double[this.sizeX][this.sizeY];
      anArray[0] = values;
      super.update(anArray);
   }

   public void update(int index, double value) {
    // Updates a specific value of the array using an index
      super.update(0,index,value);
   }

// Private Operators

}