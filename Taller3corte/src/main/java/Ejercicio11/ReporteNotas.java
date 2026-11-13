/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author MI EQUIPO
 */
public class ReporteNotas {
    public static void main(String[] args) throws IOException {
        
         System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));
        try(FileReader fr=new FileReader("notas.csv", StandardCharsets.UTF_8);BufferedReader br=new BufferedReader(fr)){
            String linea=br.readLine();
            
            while((linea=br.readLine())!= null){
                try{
                    String[] columnas = linea.split(",");
                    
                    System.out.println("Codigo: " + columnas[0]);
                    System.out.println("Nombre: " + columnas[1]);
                    System.out.println("Nota 1: " + columnas[2]);
                    System.out.println("Nota 2: " + columnas[3]);
                    System.out.println("Nota 3: " + columnas[4]);
                    
                    double nota1 = Double.parseDouble(columnas[2]);
                    double nota2 = Double.parseDouble(columnas[3]);
                    double nota3 = Double.parseDouble(columnas[4]);
                    
                    double promedio= (nota1 + nota2 + nota3) / 3;
                    System.out.println("Promedio: " + promedio);
                    
                    if (promedio>= 3.0) {
                        System.out.println("APROBADO");
                    } else {
                        System.out.println("REPROBADO");
                    }

                    System.out.println("----------------------");

                }catch(NumberFormatException ex){
                     System.out.println("Error: una nota no es un numero.");
                }catch (ArrayIndexOutOfBoundsException ex) {
                    System.out.println("Error: fila incompleta en el archivo.");
                }
        }
    }catch(IOException ex){
         System.out.println("Error al leer el archivo: "+ex.getMessage());
    }
}
}
    
