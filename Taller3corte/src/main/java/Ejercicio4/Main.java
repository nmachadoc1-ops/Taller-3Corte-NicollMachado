/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author MI EQUIPO
 */
public class Main {
    public static void main(String[] args) {
       Dispositivo[] dispositivos = { new Smartphone(80, "Iphone", "Xs", 900000), 
           new Smartphone(90, "Oppo", "A6 5G", 1149900),
           new Camara(180, "Sony", "Alpha a6100", 3000000)
       };
            int mayorresolucion=0;
    
            for(Dispositivo d: dispositivos){
             d.describir();
     
            if(d instanceof Fotografiable){
                
                Fotografiable f = (Fotografiable)d;
                
                f.tomarFoto();
                
                if(f.getmegaPixeles()>mayorresolucion){
                    mayorresolucion=f.getmegaPixeles();
                }
            }
            
            if(d instanceof Llamable){
                
                ((Llamable)d).llamar("3012696230");
                ((Llamable)d).colgar();
            }
            
            System.out.println();
            
    }   
            
            System.out.println("Mayor Resolucion: "+mayorresolucion+"MP");

}
    
}
