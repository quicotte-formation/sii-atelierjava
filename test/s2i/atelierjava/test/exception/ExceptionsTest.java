/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.test.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.testng.annotations.Test;

/**
 *
 * @author quico
 */
public class ExceptionsTest {
    
    public void declencherException() throws Exception{
        throw new Exception("ERREUR");
    }
    
//    @Test
    public void exceptionNonRuntime() {
        try {
            this.fonctionContenantExceptionsNonRuntime();
        } catch (MalformedURLException ex) {
            System.out.println("URL incorrecte");
        } catch (FileNotFoundException ex) {
            System.out.println("Fichier non trouvé");
        }
    }
    
    public void fonctionContenantExceptionsNonRuntime() throws MalformedURLException, FileNotFoundException{
        URL url = new URL("http://google.fr");
        
        new FileReader(new File("test"));
    }
          
    
//    @Test
    public void tryCatchOK(){
        
        try{
            this.niv1();
        }catch(Exception e){
            System.out.println("Il s'est produit une erreur non fatale." + e.getMessage());
        }
        System.out.println("OK");
    }
    
    public void niv1(){
        this.niv2Affiche();
         System.out.println("* niv1 OK");
    }
    
    public void niv2Affiche(){
        
        int a=1, b=0;
        
        int c = a/b;
        
        System.out.println("* niv2Affiche OK");
    }

    private void FileReader(File file) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
