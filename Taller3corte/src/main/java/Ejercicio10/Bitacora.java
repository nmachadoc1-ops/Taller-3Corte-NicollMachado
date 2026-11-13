/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
        List<String> lineas=Files.readAllLines(Path.of("bitacora.txt"));
        
        return lineas;
    }
}
