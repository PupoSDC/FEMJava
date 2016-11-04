package Element;
import  GeometricField.*;

public class Spring1D extends Element
{
    protected double[]   vector    =  new double[3];
    protected double     norm;
    protected double     stiff;

    // Constructors
    
        public Spring1D(double stiff, Point[] pointlist) {
          super(2,3,new String("Spring1D"),pointlist); 

          this.norm      = this.norm();
          this.vector    = this.vector();
          this.stiff     = stiff;
          
          stiffness =  new double[6][6];

          this.contructStiffness();

        }

    // Private Operators
        
        protected double norm() {
          // returns the norm between the 2 points.
            return Math.sqrt( Math.pow((points[0].x() - points[1].x()),2) 
                            + Math.pow((points[0].y() - points[1].y()),2) 
                            + Math.pow((points[0].z() - points[1].z()),2) );
        }

        protected double[] vector() {
          // Returns the  normalized vector connecting the 2 points
            return new double[] {
              (points[0].x() - points[2].x())/this.norm,
              (points[0].y() - points[2].y())/this.norm,
              (points[0].z() - points[2].z())/this.norm
            };
        }

        protected void contructStiffness(){
          // Populates stiffness matrix for a 1D string on a 3D environment

            stiffness[0][0]  = this.stiff*this.vector[0];
            stiffness[1][1]  = this.stiff*this.vector[1];
            stiffness[2][2]  = this.stiff*this.vector[2];

            stiffness[3][3]  = this.stiff*this.vector[0];
            stiffness[4][4]  = this.stiff*this.vector[1];
            stiffness[5][5]  = this.stiff*this.vector[2];

            stiffness[0][3]  = this.stiff*-1.0 * this.vector[0];
            stiffness[1][4]  = this.stiff*-1.0 * this.vector[1];
            stiffness[2][5]  = this.stiff*-1.0 * this.vector[2];

            stiffness[3][0]  = this.stiff*-1.0 * this.vector[0];
            stiffness[4][1]  = this.stiff*-1.0 * this.vector[1];
            stiffness[5][2]  = this.stiff*-1.0 * this.vector[2];
    
        }
}
