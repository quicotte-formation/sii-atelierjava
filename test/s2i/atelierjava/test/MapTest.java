/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.test;

import java.util.HashMap;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author quico
 */
public class MapTest {
    
    @Test
    public void transformeMapCommunesEnMapCodesPostaux(){
        HashMap<String,Integer> communes = new HashMap<>();
        communes.put("paris", 75000);
        communes.put("marseille", 13000);
        communes.put("toulouse", 31000);
        
        HashMap<Integer, String> codesPostaux = new HashMap<>();
        for( String commune : communes.keySet() ){
            
            int codePostal = communes.get(commune);
            
            codesPostaux.put(codePostal , commune);
        }
        
        System.out.println( codesPostaux );
        Assert.assertEquals(codesPostaux.get(13000), "marseille");
    }
}
