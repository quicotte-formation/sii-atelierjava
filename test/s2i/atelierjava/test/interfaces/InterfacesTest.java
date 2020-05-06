/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.test.interfaces;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import org.testng.annotations.Test;

/**
 *
 * @author quico
 */
public class InterfacesTest {
    
    @Test
    public void test(){
        List<String> l = new LinkedList<>();
        
        l.add("coucou");
        l.remove("hello");
        l.add("hi");
        l.add("hola");
        l.add("salam");
        l.add("buenos dias");
        
        System.out.println( l );
    }
    
}
