package soc;
import java.io.*;  
public class Student{  
 private static ObjectOutputStream out;

public static void main(String args[])throws Exception{  
  Student s1 =new Student();    
  FileOutputStream fout=new FileOutputStream("f.txt");  
  out = new ObjectOutputStream(fout);  
  out.writeObject(s1);  
  out.flush();  
  System.out.println("success");  
 }  
}  
