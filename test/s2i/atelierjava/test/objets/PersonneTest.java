/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.test.objets;

import static org.testng.Assert.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.testng.annotations.Test;
import s2i.atelierjava.objets.Personne;

/**
 *
 * @author quico
 */
public class PersonneTest {
    
    @Test
    public void test(){
        LocalDate d = LocalDate.parse("04/05/1967", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Personne p = new Personne("Blondy", "Alpha", d);
        assertEquals(p.toString(), "Alpha Blondy : 04/05/1967");
    }
    
}
