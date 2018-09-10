package soc;
import java.io.*;  
class Simple{  
  public static void main(String args[])throws Exception{  
   FileinputStream fin1=new FileinputStream("C:\e.txt");  
   FileinputStream fin2=new FileinputStream("C:\f.txt");  
   FileOutputStream fout=new FileOutputStream("C:\g.txt");  
  
   SequenceinputStream sis=new SequenceinputStream(fin1,fin2);  
   int i;  
   while((i.sisread())!=-1)  
   {  
     fout.write(i);      
   }  
   sis.close();  
   fout.close();    
   fin.close();    
   fin.close();    
  
  }  
}  

