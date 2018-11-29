/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesadordelenguaje;
import java.io.*;
/**
 *
 * @author USUARIO
 */
public class Char {
    public static String totalCaract(File f) throws IOException{
        FileInputStream fs = new FileInputStream(f);
        InputStreamReader input = new InputStreamReader(fs);
        BufferedReader reader = new BufferedReader(input);
        
        String line;
        int characterCount = 0;
        
        while((line = reader.readLine()) != null){
            if(!(line.equals(""))){
                characterCount += line.length();
            }
        }
        
        String total = "Total de caracteres en el archivo "+ f.getName()
                +": "+characterCount;
        
        
        reader.close();
        return total;
}
}
