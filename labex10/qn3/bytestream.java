/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PAVITHRA T
 */
package javaprograms;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class bytestream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
       
        FileInputStream fis=new FileInputStream("c:\\PAVITHRA T\\javaprograms\\src\\filehandling\\speec.mp3");
        FileOutputStream fos=new FileOutputStream("c:\\PAVITHRA T\\javaprograms\\src\\filehandling\\Speech.mp3");
        int read;
        while((read=fis.read())!=-1){
            fos.write(read);
            System.out.println(read);
        }
       
    }
   
}
    

