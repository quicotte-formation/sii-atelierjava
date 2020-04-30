/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.test;

import static org.testng.Assert.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.testng.annotations.Test;

/**
 *
 * @author quico
 */
public class DatesEtHeuresTest {
    
    @Test
    public void conversionStrinVersDateOK() throws ParseException{
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        Date maDate = format.parse("30/04/2020 11:42");
        
        SimpleDateFormat format2 = new SimpleDateFormat("Y-MM-dd hh:mm");
        
        System.out.println(format2.format(maDate));
    }
    
//    @Test
    public void conversionDateVersStringOK(){
        
        Date maDate = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm");// 30/04/2020 11:42
        String texteDate = format.format(maDate);
        
        System.out.println( texteDate );
    }
}
