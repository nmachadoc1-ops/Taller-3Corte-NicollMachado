/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author MI EQUIPO
 */
public class SaldoInsufiecienteException  extends Exception{
    private double saldo;
    private double monto;
    
    public double getFaltante(){
        return monto-saldo;
    }

    public SaldoInsufiecienteException(double saldo, double monto) {
        super("Su saldo no es suficiente, le hace falta: "+ (monto-saldo));
        this.saldo = saldo;
        this.monto = monto;
    }

    
 
    
    
}
