
package procesadordelenguaje;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Procesador {


    
    public static String totalP(File file) throws IOException{
        
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);
        
        String line;
        int countWord=0;
        while((line = reader.readLine())!= null){
            
            if(!(line.equals(""))){
                
                String[] wordList = line.split("\\s+");
                countWord += wordList.length;
            }
        }
        
        return "Total de palabras en el archivo "+file.getName()+": "+countWord;
    }
    
    public static String palabrasSRep(File file)throws IOException{
        
        Map<String, Integer> words = new HashMap<String, Integer>();
        
        String line = "";
        int countWord=0;
        
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);
        
        while((line = reader.readLine()) != null){
            line.replaceAll("[a-zA-Z09]+","");
            
            String[] wordLine = line.split("\\s+");
            for(String w : wordLine){
                if(!words.containsKey(w.toLowerCase()))
                    words.put(w.toLowerCase(), 1);
                else
                    words.put(w.toLowerCase(),words.get(w.toLowerCase()) +1);
            }
        }
        
        reader.close();
        
        for(Map.Entry<String, Integer> e : words.entrySet()){
            countWord += 1;
        }
        
        return "Total de palabras sin repetir en el archivo "+file.getName()+": "+countWord;
                
    }
    
    public static void totalPSRep(File[] files) throws IOException{
        
        int countWord = 0;
        String line = "";
        Map<String, Integer> words = new HashMap<String, Integer>();
        
        for(int i = 0; i<files.length; i++){
            FileInputStream fileStream = new FileInputStream(files[i]);
            InputStreamReader input = new InputStreamReader(fileStream);
            BufferedReader reader = new BufferedReader(input);
            
            while((line = reader.readLine()) != null){
                line.replaceAll("[a-zA-Z0-9]+","");
                
                String[] wordLine = line.split("\\s+");
                for(String w : wordLine){
                    if(!words.containsKey(w.toLowerCase()))
                        words.put(w.toLowerCase(), 1);
                    else
                        words.put(w.toLowerCase(),words.get(w.toLowerCase()) +1);
                }
            }
            
            reader.close();
        }
        
        for(Map.Entry<String, Integer> e : words.entrySet()){
            countWord += 1;
        }
        
        System.out.println("Total: "+countWord);
    }
    
}
