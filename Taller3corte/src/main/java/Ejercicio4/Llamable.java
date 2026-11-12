/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author MI EQUIPO
 */
public interface Llamable {
    public void llamar(String numero);
    public void colgar();
   
    default String funcion(){
        return "Llamadas";
    }
}
