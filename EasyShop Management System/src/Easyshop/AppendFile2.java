/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Easyshop;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
/**
 *
 * @author sogobanjo
 */
public class AppendFile2 {
      //public static void main(String[] args) {

    public void ApendTextToFile()
    {
    
        String path = System.getProperty("user.dir") + "\\src\\filename.txt";
        String text = "\n Added text44";

        try {
            Files.write(Paths.get(path), text.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
        }
    }
        
   // }
}
