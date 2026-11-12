/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author MI EQUIPO
 */
public interface Fotografiable {
    
    
    public void tomarFoto();
    
    int getmegaPixeles();
    
    default String funcion(){
        return "Fotografia";
    }
}
