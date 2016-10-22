package Mesh;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Mesh {

// protected members

   protected Point[] points;
  //protected final element[];

// constructors
   public Mesh(String path) {
      try {
         String text = new String(Files.readAllBytes(Paths.get(path)), StandardCharsets.UTF_8);
         
         JSONObject jsonObject = new JSONObject(text);
         JSONArray        list = (JSONArray) jsonObject.get("points");        
         points = new Point[list.length()];

         for(int i =0; i < list.length();i++)
         {
            JSONObject p = list.getJSONObject(i);
            points[i] = new Point(p.getInt("id"),p.getInt("x"),p.getInt("y"),p.getInt("z"));
         }
                  
      } 
      catch(Exception e){e.printStackTrace();}      
   }

   //public Mesh(Mesh mesh) {
      // construct as a copy
      //this.size     = mesh.size;
      //this.points   = mesh.points;
   //}


// Public operators

   public int size(){
      return points.length*3;
   }

// Private Operators



}