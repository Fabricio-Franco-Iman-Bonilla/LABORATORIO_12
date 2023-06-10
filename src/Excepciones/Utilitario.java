/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

import excepcionesPersonalizadas.MiExcepcionDividePor0;
import excepcionesPersonalizadas.MiExcepcionFueraDeRango;
import excepcionesPersonalizadas.MiExcepcionGenerica;
import excepcionesPersonalizadas.MiExcepcionNula;
import excepcionesPersonalizadas.MiExcepcionNumerica;

/**
 *
 * @author Fabricio
 */
public class Utilitario {

    /*
    Esta funcion permite convertir un texto en numero 
    y controlar los errores que se pueden presentar 
    a partir de ello 
    
     */
    public static int convertir(String numeroEnTexto)
            throws MiExcepcionNumerica,
            MiExcepcionGenerica {
        try {
            return Integer.parseInt(numeroEnTexto);
        } catch (NumberFormatException s) {
            throw new MiExcepcionNumerica();

        } catch (Exception ex) {
            throw new MiExcepcionGenerica();

        }
//finally sirve para ejecutar un bloque de código después de terminar de 
//ejecutar el catch 
//finally{
//            return 0;
//        }

    }

    public static int obtenerCantidadCaracteres(String texto)
            throws MiExcepcionNula {
        try {
            return texto.length();
        } catch (NullPointerException s) {
            throw new MiExcepcionNula();

        }
        

    }
    public static int accedeAIndiceEnArreglo(int[] numeros, int indice)
            throws MiExcepcionFueraDeRango {
        try {
            return numeros[indice];
        } catch (ArrayIndexOutOfBoundsException s) {
            throw new MiExcepcionFueraDeRango();

        }
        
    }
    public static int divideDosNumeros(int a, int b)
            throws MiExcepcionDividePor0 {
        try {
            return a/b;
        } catch (ArithmeticException s) {
            throw new MiExcepcionDividePor0();

        }
        
    }
}
