/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author MI EQUIPO
 */
public class Camara extends Dispositivo implements Fotografiable{
    private int megaPixeles;

    public Camara(int MegaPixeles, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.megaPixeles = megaPixeles;
    }

    @Override
    public String funcion() {
        return "Fotografia";
    }

    @Override
    public void describir() {
         System.out.println("Camara MARCA:"+ marca + " -MODELO:" + modelo + " -PRECIO:" +  precio + "-FUNCION:" + funcion());
    }

    @Override
    public void tomarFoto() {
          System.out.println("Camara" + marca + " tomo una foto profesional de " + megaPixeles + "MP");
    }

    @Override
    public int getmegaPixeles() {
        return megaPixeles;
    }
    

    
    
    
}
