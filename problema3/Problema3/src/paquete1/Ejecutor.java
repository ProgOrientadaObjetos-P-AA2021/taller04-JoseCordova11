/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author Jose Cordova
 */
public class Ejecutor {
    public static void main(String[] args) {
        //Datos Auto 1
        String cedula = "1107132555";
        String marcVehi = "Ford";
        int aFabri = 2010;
        double valVehi = 55090.45;

        Auto auto1 = new Auto(cedula, marcVehi, aFabri, valVehi);

        auto1.establecerCedula(cedula);
        auto1.establecerMarca(marcVehi);
        auto1.establecerAFabricacion(aFabri);
        auto1.establecerValorVehiculo(valVehi);
        auto1.establecerValorMatricula();
        System.out.println(auto1);
        
        System.out.println(" ");

        //Datos Auto 2
        String cedula2 = "1105637837";
        String marcVehi2 = "KIA";
        int aFabri2 = 2019;
        double valVehi2 = 75000.00;

        Auto auto2 = new Auto(cedula2, marcVehi2, aFabri2, valVehi2);

        auto2.establecerCedula(cedula2);
        auto2.establecerMarca(marcVehi2);
        auto2.establecerAFabricacion(aFabri2);
        auto2.establecerValorVehiculo(valVehi2);
        auto2.establecerValorMatricula();
        System.out.println(auto2);

    }
    
}
