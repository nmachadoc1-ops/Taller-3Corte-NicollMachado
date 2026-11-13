 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author MI EQUIPO
 */
public class Main{
     public static void main(String[] args) throws IOException {
         
         Bitacora bitacora=new Bitacora();
         
         bitacora.registrar("Se ha iniciado correctamente el sistema");
         bitacora.registrar("ERROR:Fallo de conexion");
         bitacora.registrar("Usuario conectado correctamente");
         bitacora.registrar("Usuario conectado correctamente");
         bitacora.registrar("ERROR: Archivo no encontrado");
         
         
         System.out.println("~~~~CONTENIDO DE LA BITACORA~~~~");
         
         List<String> contenido=bitacora.leer();
         
         
         for(String linea:contenido){
             System.out.println(linea);
         }
         
         int totalerrores=bitacora.contar("ERROR");
            System.out.println("Total de errores: "+totalerrores);
     }

    
}
