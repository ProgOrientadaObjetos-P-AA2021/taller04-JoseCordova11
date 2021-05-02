package paquete1;
//Taller 4 creacion de programas usando conceptode constructores
/**
 *
 * @author Jose Cordova
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        System.out.println("Profesor 1 es: ");
       
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
        
        System.out.println(" ");
        
        System.out.println("Profesor 2 es: ");
       
        String nombre2 = "Daniel";
        String apellido2 = "Añazco";
        double sueldoBasico2 = 550.00;
        String cedula2 = "1105835727";
        
        ProfesoresInstituto p2 = new ProfesoresInstituto(nombre2, 
                apellido2,sueldoBasico2,cedula2); 
        
        p2.establecerNombre(nombre2);
        p2.establecerApellido(apellido2);
        p2.establecerSueldoBasico(sueldoBasico2);
        p2.establecerSueldoTotal();
        
        System.out.println(p2);
  
    }    

}
