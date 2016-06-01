/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dam_ed04_actividad;

import static dam_ed04_actividad.Main.cuenta1;


public class Main {
    static CCuenta cuenta1;
    static double saldoActual;
    
    public static void operativa_cuenta(double ingreso, double retiro, float cantidad) {
        try {
            cuenta1.retirar(retiro);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            cuenta1.ingresar(ingreso);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }       
    
    public static void main(String[] args) {
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );
        
        operativa_cuenta(1000, 100, 0);
        
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );
        
    }
}