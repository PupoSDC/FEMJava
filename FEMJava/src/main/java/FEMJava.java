package FEMJava;

import GeometricField.*;
import Mesh.*;

class FEMJava {
  public static void main(String[] args){
    System.out.println("FEMJava");

    Mesh mesh = new Mesh("mesh.json");

  	Vector displacements = new Vector("Displacements",mesh.size());
  	Vector forces        = new Vector("forces",2);
  	Matrix stiffness     = new Matrix("Stiffness",mesh.size());

  	System.out.println(displacements.name());
  	System.out.println(stiffness.name());
  }
}