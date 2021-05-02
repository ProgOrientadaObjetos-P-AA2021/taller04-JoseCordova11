package paquete1;

/**
 *
 * @author Jose Cordova
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        String nombreEstudiante = "Daniel";
        double caliMate1 = 6.3;
        double caliMate2 = 9.7;
        double caliMate3 = 8.5;
        
        PromedioEstudiantes proE1 = new PromedioEstudiantes(nombreEstudiante,
                caliMate1, caliMate2, caliMate3);
        proE1.establecerNombreEstudiante(nombreEstudiante);
        proE1.establecerCalificacionMateria1(caliMate1);
        proE1.establecerCalificacionMateria2(caliMate2);
        proE1.establecerCalificacionMateria3(caliMate3);
        proE1.establecerPromedioCalificacion();

        System.out.println(proE1);
        
        System.out.println(" ");
        
        String nombreEstudiante2 = "Jose";
        double calMat1 = 9.3;
        double calMat2 = 4.3;
        double calMat3 = 7.2;
        
        PromedioEstudiantes proE2 = new PromedioEstudiantes(nombreEstudiante2,
                calMat1, calMat2, calMat3);
        proE2.establecerNombreEstudiante(nombreEstudiante);
        proE2.establecerCalificacionMateria1(calMat1);
        proE2.establecerCalificacionMateria2(calMat2);
        proE2.establecerCalificacionMateria3(calMat3);
        proE2.establecerPromedioCalificacion();

        System.out.println(proE2);
        
        
        
        
    }

}
