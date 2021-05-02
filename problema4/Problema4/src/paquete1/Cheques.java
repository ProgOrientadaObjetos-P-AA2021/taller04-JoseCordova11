package paquete1;

/**
 *
 * @author Asus
 */
public class Cheques {
    
    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comiCobrar;

    public Cheques(String nom, String nomBan, double valChe) {
        nombreCliente = nom;
        nombreBanco = nomBan;
        valorCheque = valChe;
    }

    public void establecerNombreCliente(String n) {
        nombreCliente = n;
    }

    public void establecerNombreBanco(String nBan) {
        nombreBanco = nBan;
    }

    public void establecerValorCheque(double valChe) {
        valorCheque = valChe;
    }

    public void establecerComisionCobrar() {
        comiCobrar = (valorCheque * 0.003);
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public String obtenerNombreBanco() {
        return nombreBanco;
    }

    public double obtenerValorCheque() {
        return valorCheque;
    }

    public double obtenerComisionCobrar() {
        return comiCobrar;
    }

    @Override
    public String toString() {
        String cadena = String.format("\tDatos del Cheque\n"
                + "Nombre del cliente: %s\n"
                + "Nombre del banco: %s\n"
                + "Valor del cheque: %.2f\n"
                + "Comisión que cobra el banco: %.2f",
                obtenerNombreCliente(),
                obtenerNombreBanco(),
                obtenerValorCheque(),
                obtenerComisionCobrar());

        return cadena;
    }
    
}
