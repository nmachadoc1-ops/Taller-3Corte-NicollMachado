/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author MI EQUIPO
 */
public class CuentaBancaria {
    private String titular;
    private Double Saldo;

    public CuentaBancaria(String titular, Double Saldo) {
        this.titular = titular;
        this.Saldo = Saldo;
    }
    
    public void depositar(double monto) throws MontoInvalidoException{

        
        if(monto<=0){
            throw new MontoInvalidoException(monto);
        }else{
            Saldo=Saldo+monto;
        }
    }
    
    public void retirar(double monto) throws MontoInvalidoException, SaldoInsufiecienteException{
        
        if(monto<=0){
            throw new MontoInvalidoException(monto);
        }
        
        if(monto>Saldo){
            throw new SaldoInsufiecienteException(Saldo, monto);
        }else{
            Saldo-=monto;
        }
    }

    public String getTitular() {
        return titular;
    }

    public Double getSaldo() {
        return Saldo;
    }
    
}
