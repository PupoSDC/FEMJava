public class Matrix extends GeometricField {

// protected members


// constructors

   public Matrix(String name, int size) {
      super(name,"Matrix",size,size);
   }

   public Matrix(String name, double[][] field) {
      super(name,"Matrix",field);
   }

    public Matrix(Matrix matrix) {
      super(matrix);
   }
   
// Public operators


// Private Operators

}