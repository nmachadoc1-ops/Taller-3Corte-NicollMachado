/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

import java.util.Scanner;

/**
 *
 * @author MI EQUIPO
 */
public class Main {
    
     public static void main(String[] args) throws MontoInvalidoException{
         
         CuentaBancaria b=new CuentaBancaria("Nicoll Machado Contreras", 800000.0);
         Scanner scanner = new Scanner(System.in);
            int opcion = 0;
         
         do{
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1.Consultar");
            System.out.println("2.Depositar");
            System.out.println("3.Retirar");
            System.out.println("4.Salir");
            System.out.print("Elige una opcion: ");
            opcion= scanner.nextInt();
                
                switch(opcion){
                    case 1:
                         System.out.println("Haz escogido Consultar.");
                         System.out.println("Titular De La Cuenta: "+ b.getTitular()  + " Saldo " + b.getSaldo() );
                         
                        break;
                         
                    case 2:
                        try{
                        System.out.println("Haz escogido Depositar.");
                         System.out.println("Ingrese monto que desea depositar:" );
                         double monto=scanner.nextDouble();
                        b.depositar(monto);
                        
                          System.out.println("Deposito realizado correctamente.");
                            System.out.println("Nuevo saldo: " + b.getSaldo());
                    
                     }catch(MontoInvalidoException e){
                     System.out.println(e.getMessage());}
                break;
                
                    case 3:
                        
                          try {
                        System.out.println("Has escogido Retirar.");
                        System.out.println("Ingrese monto que desea retirar:");

                        double monto = scanner.nextDouble();

                        b.retirar(monto);

                        System.out.println("Retiro realizado correctamente.");
                        System.out.println("Nuevo saldo: " + b.getSaldo());

                    }catch(SaldoInsufiecienteException e){
                        System.out.println(e.getMessage());
                    }

                    break;
                    
                    case 4:
                        System.out.println("Saliendo...");
                }
                 
                }while(opcion !=4);
     }
     
}
        
         
