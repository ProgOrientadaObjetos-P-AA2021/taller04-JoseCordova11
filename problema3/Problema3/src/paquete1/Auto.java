package paquete1;

/**
 *
 * @author Jose Cordova
 */
public class Auto {
    private String cedula;
    private String marca;
    private int aFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    public Auto(String cedu, String marc, int aFab, double valorVehi) {
        cedula = cedu;
        marca = marc;
        aFabricacion = aFab;
        valorVehiculo = valorVehi;

    }

    public void establecerCedula(String cedu) {
        cedula = cedu;
    }

    public void establecerMarca(String marc) {
        marca = marc;
    }

    public void establecerAFabricacion(int aFab) {
        aFabricacion = aFab;
    }

    public void establecerValorVehiculo(double valorV) {
        valorVehiculo = valorV;
    }

    public void establecerValorMatricula() {
        valorMatricula = (2021 - aFabricacion) * (valorVehiculo * 0.002);
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerMarca() {
        return marca;
    }

    public int obtenerAFabricacion() {
        return aFabricacion;
    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {
        String cadena = String.format("\tDatos del Auto\n"
                + "Cedula del dueño: %s\n"
                + "Marca del vehiculo: %s\n"
                + "Año de fabricación: %d\n"
                + "Valor del vehículo: %.2f\n"
                + "Valor de la matricula: %.2f",
                obtenerCedula(),
                obtenerMarca(),
                obtenerAFabricacion(),
                obtenerValorVehiculo(),
                obtenerValorMatricula());
        return cadena;
    }
    
    
}
