/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionesPersonalizadas;

/**
 *
 * @author Fabricio
 */
public class MiExcepcionDividePor0 extends Exception {
    
    private final static String MESSAGE=""
            + "Ey, parece que al intentar realizar una división, "
            + "terminaste queriendo dividir por cero, esto no es posible,"
            + "revisa el código.";

    public MiExcepcionDividePor0() {
        super(MESSAGE);
    }
    
    
}
