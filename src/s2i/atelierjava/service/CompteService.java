/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.service;

import s2i.atelierjava.exception.CompteInconnuException;
import s2i.atelierjava.exception.MontantTropEleveException;

/**
 *
 * @author quico
 */
public class CompteService {
    
    public void retrait(int montant, String numCompte) throws CompteInconnuException, MontantTropEleveException{
        
        if( numCompte==null ){
            throw new CompteInconnuException();
        }
        if( montant>3000 ){
            throw new MontantTropEleveException();
        }
        
        // Accès base de données.
    }
}
