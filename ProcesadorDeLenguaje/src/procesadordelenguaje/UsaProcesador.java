/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesadordelenguaje;

import java.io.*;


/**
 *
 * @author CHIPRES
 */
public class UsaProcesador {
    public static void execProc()throws IOException{
        
        Procesador p = new Procesador();
        
        File f1 = new File("/Users/5e/Downloads/pd18is5e-master/datasets/1cald.txt");
        File f2 = new File("/Users/5e/Downloads/pd18is5e-master/datasets/2cald.txt");
        File f3 = new File("/Users/5e/Downloads/pd18is5e-master/datasets/3cald.txt");
        
        System.out.println("Palabras con repeticion: ");
        System.out.println("Archivo 1:"+p.totalP(f1));
        System.out.println("Archivo 2:"+p.totalP(f2));
        System.out.println("Archivo 3:"+p.totalP(f3));
        
        System.out.println("\nPalabras sin repeticion: ");
        System.out.println("Archivo 1:"+p.palabrasSRep(f1));
        System.out.println("Archivo 2:"+p.palabrasSRep(f2));
        System.out.println("Archico 3:"+p.palabrasSRep(f3));
        
        File[] files ={f1, f2, f3};
        
        System.out.println("\nPalabras sin repeticion de todos los archivos: ");
        p.totalPSRep(files);
        
}
}
