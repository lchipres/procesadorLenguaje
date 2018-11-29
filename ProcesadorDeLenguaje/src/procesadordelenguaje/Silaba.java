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
public class Silaba {
    public static String totalSilabas(File f)throws IOException{
        FileInputStream fs = new FileInputStream(f);
        InputStreamReader input = new InputStreamReader(fs);
        BufferedReader reader = new BufferedReader(input);

        int syllables = 0;
        String line;
        
        while((line = reader.readLine())!=null){
            syllables += contarSilabas(line);
        }
        
        String total = "Total de silabas en "+f.getName()+
                ": "+syllables;
        reader.close();
        return total;
    }
    
    public static int contarSilabas(String word){
        int count = 0;
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '\"' || word.charAt(i) == '\'' || word.charAt(i) == '-' || word.charAt(i) == ',' || word.charAt(i) == ')' || word.charAt(i) == '(') {
                word = word.substring(0,i)+word.substring(i+1, word.length());
            }
        }
        boolean flag = false;
        for (int j = 0; j < word.length(); j++) {
            if (word.contains("a") || word.contains("e") || word.contains("i") || word.contains("o") || word.contains("u")) {
                if (esUnaVocal(word.charAt(j)) && !((word.charAt(j) == 'e') && (j == word.length()-1))) {
                    if (flag == false) {
                        count++;
                        flag = true;
                    }
                } else {
                    flag = false;
                }
            } else {
                count++;
                break;
            }
        }
        return count;
        
}
    public static boolean esUnaVocal(char c){
        
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        } else {
            return false;
        }
    }
    
}

