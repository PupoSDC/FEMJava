import GeometricField.*;
import Mesh.*;

class FEMJava {
  public static void main(String[] args){
    System.out.println("FEMJava");

    Mesh mesh = new Mesh("\\mesh.json");

  	//Vector displacements = new Vector("Displacements",2);
  	//Vector forces        = new Vector("forces",2);
  	//Matrix stiffness     = new Matrix("Stiffness",2);

  	//System.out.println(displacements.name());
  	//System.out.println(displacements.val(1));
  }
}