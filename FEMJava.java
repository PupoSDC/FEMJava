   class FEMJava {
      public static void main(String[] args){
        System.out.println("FEMJava");

      	Vector displacements = new Vector("Displacements",3);
      	//Vector stiffness     = new Matrix("Stiffness",3);

      	System.out.println(displacements.name());
      	System.out.println(displacements.val(1));
      }
   }