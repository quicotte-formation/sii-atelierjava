/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.test.langage;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.testng.annotations.Test;

/**
 *
 * @author quico
 */
public class BigIntegerEtBigDecimal {
    
    @Test
    public void calculOK(){
        BigInteger bi = new BigInteger("12345678901234567890123456789012345678901234567890123456789");
        System.out.println( bi.add(new BigInteger("1")).pow(100) );
        
        BigDecimal bd = new BigDecimal("12345678901234567890123456789012345678901234567890123456789.12345678901234567890123456789012345678901234567890123456789");
        System.out.println( bd.pow(1000) );
    }
}
