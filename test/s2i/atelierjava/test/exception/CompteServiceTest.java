/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.test.exception;

import java.util.logging.Level;
import java.util.logging.Logger;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import s2i.atelierjava.exception.CompteInconnuException;
import s2i.atelierjava.exception.MontantTropEleveException;
import s2i.atelierjava.service.CompteService;

/**
 *
 * @author quico
 */
public class CompteServiceTest {

    @Test
    public void retraitCompteConnuMontant1500OK() throws CompteInconnuException, MontantTropEleveException{
        CompteService srv = new CompteService();
        srv.retrait(5, "123");
    }
    
    @Test(expectedExceptions = {MontantTropEleveException.class})
    public void retraitMontant4000KO() throws CompteInconnuException, MontantTropEleveException{
        CompteService srv = new CompteService();
        srv.retrait(4000, "123");
    }
    
    @Test(expectedExceptions = {CompteInconnuException.class})
    public void retraitCompteNullKO() throws CompteInconnuException, MontantTropEleveException{
        CompteService srv = new CompteService();
        srv.retrait(2000, null);
    }
    
    @Test(expectedExceptions = {CompteInconnuException.class, MontantTropEleveException.class})
    public void retraitViolationContrainteKO() throws CompteInconnuException, MontantTropEleveException {
        CompteService service = new CompteService();
        service.retrait(12345, null);
    }
}
