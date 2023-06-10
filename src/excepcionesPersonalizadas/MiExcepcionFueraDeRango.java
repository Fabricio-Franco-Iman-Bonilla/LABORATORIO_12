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
public class MiExcepcionFueraDeRango extends Exception{
    
    private final static String MESSAGE=""
            + "Ey, parece que intentaste a un índice invalido en tu arreglo, "
            + "recuerda que estos tienen un tamaño definido, por favor "
            + "revisa el código.";

    public MiExcepcionFueraDeRango() {
        super(MESSAGE);
    }
    
    
}
