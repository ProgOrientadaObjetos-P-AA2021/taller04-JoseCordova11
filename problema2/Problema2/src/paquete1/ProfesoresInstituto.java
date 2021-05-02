package paquete1;

/**
 *
 * @author Jose Cordova
 */
public class ProfesoresInstituto {
    
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;
    
    public ProfesoresInstituto(String n, String a, double suelbas, String c){
        nombre = n;
        apellido = a;
        sueldoBasico = suelbas;
        cedula = c; 
    }
    
    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerApellido(String apell) {
        apellido = apell;
    }

    public void establecerSueldoBasico(double sulbas) {
        sueldoBasico = sulbas;
    }
    
    public void establecerSueldoTotal(){
        sueldoTotal = (sueldoBasico * 20)/100 + sueldoBasico;
    }
    
    public void establecerCedula(String ced){
        cedula = ced;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }
    
    public String obtenerCedula(){
        return cedula;
    }
    @Override
    public String toString() {
        String cadena = String.format("Profesores del Instituto\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Sueldo Basico: %.2f\n"
                + "Sueldo Total: %.2f\n"
                + "Cedula: %s",
                obtenerNombre(),
                obtenerApellido(),
                obtenerSueldoBasico(),
                obtenerSueldoTotal(),
                obtenerCedula());
        return cadena;
    }
    
}
