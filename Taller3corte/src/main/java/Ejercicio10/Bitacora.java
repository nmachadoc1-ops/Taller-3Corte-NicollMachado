/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MI EQUIPO
 */

public class Bitacora {
    
    public void registrar(String mensaje) throws IOException {

    LocalDateTime fecha = LocalDateTime.now();

    DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    String fechaFormateada = fecha.format(formato);

    FileWriter archivo = new FileWriter("bitacora.txt", true);

    PrintWriter escribir = new PrintWriter(archivo);

    escribir.println("[" + fechaFormateada + "] " + mensaje);

    escribir.close();
}
    public List<String> leer() throws IOException{
        
        List<String> lineas=new ArrayList<>();
        
        BufferedReader br= new BufferedReader(new FileReader("bitacora.txt"));
        
        String linea;
        
        while((linea=br.readLine())!=null){
            lineas.add(linea);
        }
        
        br.close();
    
        return lineas;
    }
    
    public int contar(String palabra)throws IOException{
        List<String > lineas =leer();
        
        int contador=0;
        
        for(String linea:lineas){
            if(linea.toLowerCase().contains(palabra.toLowerCase())){
                contador++;
            }
        }
        return contador;
    }
    
}
