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

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class characterstream {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) throws FileNotFoundException, IOException {
      
        FileReader fr=new FileReader("c:\\PAVITHRA T\\javaprograms\\src\\filehandling\\speec.mp3");
        FileWriter fw=new FileWriter("c:\\PAVITHRA T\\javaprograms\\src\\filehandling\\Speech.mp3");
        int readd;
       
        while((readd=fr.read())!=-1){
            System.out.println((char)readd);
            fw.write((char)readd);
        }
    }
   
}