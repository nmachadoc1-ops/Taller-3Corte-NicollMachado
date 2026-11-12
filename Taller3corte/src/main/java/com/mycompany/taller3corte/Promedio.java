/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller3corte;

import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class Promedio {
    
    public static double promedio(double[]notas)throws Exception{
        if(notas.length==0)throw new Exception();
        int suma=0;
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
       
   }
