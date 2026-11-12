/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author MI EQUIPO
 */
public class Smartphone extends Dispositivo implements Fotografiable, Llamable{
    private int megaPixeles;

    public Smartphone(int megaPixeles, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.megaPixeles = megaPixeles;
    }
    
    

    @Override
    public String funcion() {
        return "Llamadas y fotografia";
        
        
    }

    @Override
    public void describir() {
        System.out.println("Smartphone "+ marca + "-" + modelo + "-" +  precio + "-" + funcion());
    }

    @Override
    public void tomarFoto() {
        System.out.println( marca + " tomo una foto de " + megaPixeles + "MP");
    }

    @Override
    public int getmegaPixeles() {
        return megaPixeles;
    }

    @Override
    public void llamar(String numero) {
         System.out.println( marca + " llamando a " + numero);
    }

    @Override
    public void colgar() {
         System.out.println( marca + " finalizo llamada ");
    }

    
    
}
