public class Vector extends GeometricField {

// protected members


// constructors

   public Vector(String name, int size) {
    // Construct an empty geometric field
      super(name,"Vector",1,size);
   }

   public Vector(String name, double[] field) {
    // Construct a geometric field from an array
      super(name,"Vector",new double [1][field.length]);
      this.update(field);
   }

   public Vector(Vector vector) {
    // construct as a copy
      super(vector);
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