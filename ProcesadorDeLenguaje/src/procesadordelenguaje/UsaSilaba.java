/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesadordelenguaje;

import java.io.*;

/**
 *
 * @author 5e
 */
public class UsaSilaba {
    public void execSilaba()throws IOException{ 
     Silaba s = new Silaba();
     
     File f1 = new File("/Users/5e/Downloads/pd18is5e-master/datasets/1cald.txt");
     File f2 = new File("/Users/5e/Downloads/pd18is5e-master/datasets/2cald.txt");
     File f3 = new File("/Users/5e/Downloads/pd18is5e-master/datasets/3cald.txt");
     
     System.out.println(s.totalSilabas(f1));
     System.out.println(s.totalSilabas(f2));
     System.out.println(s.totalSilabas(f3));
    }
}
