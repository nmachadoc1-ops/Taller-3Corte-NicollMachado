/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author MI EQUIPO
 */
public class MontoInvalidoException extends Exception{

    public MontoInvalidoException(Double monto) {
        super("Monto invalido: " + monto + " Debe ser mayor que cero");
    }
    
    
    
}
