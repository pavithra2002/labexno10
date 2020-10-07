/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PAVITHRA T
 */
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
public class lowercase {

   
     public static void main(String[] args) throws FileNotFoundException, IOException{
        // TODO code application logic here
        DataInputStream ds=new DataInputStream(new BufferedInputStream(new FileInputStream ("c:\\PAVITHRA T\\javaprograms\\src\\filehandling\\friendship.txt")));
        FileWriter fw=new FileWriter("c:\\PAVITHRA T\\javaprograms\\src\\filehandling\\friendship_to_lower.txt");
        String line;
        while((line=ds.readLine())!=null)
        {
           
            fw.write(line.toLowerCase());
            fw.write("\n");
    }
        fw.close();
       
    }
}
   
    
    

