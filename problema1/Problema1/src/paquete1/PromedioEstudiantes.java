package paquete1;

/**
 *
 * @author Jose Cordova
 */
public class PromedioEstudiantes {
    
    private String nombreEstudiante;
    private double calificacionMateria1;
    private double calificacionMateria2;
    private double calificacionMateria3;
    private double promedioCalificacion;

    public PromedioEstudiantes(String n, double m1, double m2, double m3) {
        nombreEstudiante = n;
        calificacionMateria1 = m1;
        calificacionMateria2 = m2;
        calificacionMateria3 = m3;
    }

    public void establecerNombreEstudiante(String n) {
        nombreEstudiante = n;
    }

    public void establecerCalificacionMateria1(double caliMate1) {
        calificacionMateria1 = caliMate1;
    }

    public void establecerCalificacionMateria2(double caliMate2) {
        calificacionMateria2 = caliMate2;
    }

    public void establecerCalificacionMateria3(double caliMate3) {
        calificacionMateria3 = caliMate3;
    }

    public void establecerPromedioCalificacion() {
        promedioCalificacion = (calificacionMateria1 + calificacionMateria2 + calificacionMateria3) / 3;
    }

    public String obtenerNombreEstudiante() {
        return nombreEstudiante;
    }

    public double obtenerCalificacionMateria1() {
        return calificacionMateria1;
    }

    public double obtenerCalificacionMateria2() {
        return calificacionMateria2;
    }

    public double obtenerCalificacionMateria3() {
        return calificacionMateria3;
    }

    public double obtenerPromedioCalificacion() {
        return promedioCalificacion;
    }

    public String toString() {
        String cadena = String.format("\tDatos Estudiante\n"
                + "Nombre del estudiante: %s\n"
                + "Calificacion materia 1: %.2f\n"
                + "Calificacion materia 2: %.2f\n"
                + "Calificacion materia 3: %.2f\n"
                + "Promedio de Calificaciones: %.2f\n",
                obtenerNombreEstudiante(),
                obtenerCalificacionMateria1(),
                obtenerCalificacionMateria2(),
                obtenerCalificacionMateria3(),
                obtenerPromedioCalificacion());
        return cadena;
    }
    
}
