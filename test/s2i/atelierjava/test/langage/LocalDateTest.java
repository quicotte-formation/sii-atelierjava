/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.test.langage;

import static org.testng.Assert.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.testng.annotations.Test;

/**
 *
 * @author quico
 */
public class LocalDateTest {
    
    @Test
    public void convertir_30_04_2020_vers_2020_04_30OK(){
        
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        LocalDate ld = LocalDate.parse("30-04-2020", f1);
        String texte = ld.format(f2);
        assertEquals(texte, "2020-04-30");
    }
    
    @Test
    public void ajouterUnAnUnMoisUnJourADateDuJourOK(){
        
        LocalDate now = LocalDate.now();
        now = now.plusYears(1);
        now = now.plusMonths(1);
        now = now.plusDays(1);
        
        System.out.println( now );
    }
}
