/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.interfaces;

/**
 *
 * @author quico
 */
public class RobotMuseeService {
    
    public InterfaceBorneMusee borne = new BorneMuseeTemporareEnAttendantMonCollegue();
    
    public void presenterOeuvre(int numO){
        this.borne.allumer();
        this.borne.lireOeuvreParNumero(numO);
        this.borne.eteindre();
    }
}
