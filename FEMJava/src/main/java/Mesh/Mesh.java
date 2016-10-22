package Mesh;

import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Mesh {

// protected members
   protected final int size;
   protected final Point[] points;
   //protected final element[];

// constructors
   public Mesh(String path) throws IOException {
      try 
      {  
         BufferedReader br = new BufferedReader( new FileReader(path) ); 
         Point[] points = gson.fromJson(br, points);
      } 
      catch (IOException e) { e.printStackTrace(); } 

      this.size = 1;
      this.points = new Point[];
   }

   public Mesh(Mesh mesh) {
      // construct as a copy
      this.size     = mesh.size;
      this.points   = mesh.points;
   }


// Public operators


// Private Operators



}