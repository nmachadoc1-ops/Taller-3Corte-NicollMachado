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
       Smartphone s = new Smartphone(50,"IPHONE","PRO 17", 7000000);
       
       s.describir();
       s.llamar("3012696230");
       s.colgar();
       s.tomarFoto();
    }
}
