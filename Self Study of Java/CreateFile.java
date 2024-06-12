
import java.io.*;


public class CreateFile {
public static void main(String[] args) {
  File f = new File("pathname:piyud.txt");
  try {
    if (f.createNewFile()) {
      System.out.println("File Is done");
    } else {
      System.out.println("file is not created. ");
      
    }
    
  } catch (Exception e) {
    System.out.println("Somthing went ");
    
  }
  
}
  
}