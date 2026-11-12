/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7c;

import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class Promedio {
    
    public static double promedio(double[]notas)throws Exception{
        if(notas.length==0)throw new Exception();
        double suma=0;
        for(int i=0 ; i < notas.length ; i++){
            if(notas[i]<0 || notas[i]>5){
                 throw new Exception("Las notas deben estar entre 0 y 5");
            }
            
            suma+=notas[i];
        }
        return suma/notas.length;
        
    }
    
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
       try{
        
           System.out.println("Cuantas notas desea ingresar?");
           int n=Integer.parseInt(sc.nextLine());
           
           if(n<=0){
               throw new Exception("No puede ingresar 0 notas");
               
           }
           
             double[] notas = new double[n];
             
             for (int i = 0; i < n; i++) {

            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = Double.parseDouble(sc.nextLine());
        }

        System.out.println("Promedio: " + promedio(notas));

    } catch (NumberFormatException e) {

        System.out.println("Dato inválido: debe ingresar un número");

    } catch (Exception e) {

        System.out.println("Error: " + e.getMessage());

    } finally {

        sc.close();
    }
}

}
           
         
