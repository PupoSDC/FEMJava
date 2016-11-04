package Mesh;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import Element.*;
import GeometricField.*;

public class Mesh {

// protected members

   protected Point[]   points;
   protected Element[] elements; 

// constructors
   public Mesh(String path) {
      try {
         String text = new String(Files.readAllBytes(Paths.get(path)), StandardCharsets.UTF_8);
         
         JSONObject  jsonObject = new JSONObject(text);
         JSONArray    pointlist = (JSONArray) jsonObject.get("points");        
         JSONArray  elementlist = (JSONArray) jsonObject.get("elements");      
         points   = new Point[pointlist.length()];  

         for(int i =0; i < pointlist.length();i++)
         {
            JSONObject p = pointlist.getJSONObject(i);
            points[i] = new Point(p.getInt("id"),p.getInt("x"),p.getInt("y"),p.getInt("z"));
         }
         /*
         for(int i =0; i < elementlist.length();i++)
         {
            JSONObject p = elementlist.getJSONObject(i);
            Point[] pointarray = new Point(p.id,p.x,p.y,p.z);
            element[i] = new Element();
         }
         */       
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
      return points.length;
   }

// Private Operators



}