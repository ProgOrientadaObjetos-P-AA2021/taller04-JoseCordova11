package paquete1;

/**
 *
 * @author Jose Cordova
 */
public class Ejecutor {
    public static void main(String[] args) {
       
        String nombre = "Jose";
        String apellido = "Cordova";
        double sueldoBasico = 700.00;
        String cedula = "1105637837";
        
        ProfesoresInstituto pI = new ProfesoresInstituto(nombre, 
                apellido, sueldoBasico,cedula); 
        
        pI.establecerNombre(nombre);
        pI.establecerApellido(apellido);
        pI.establecerSueldoBasico(sueldoBasico);
        pI.establecerSueldoTotal();
        
        System.out.println(pI);
  
    }    

}
