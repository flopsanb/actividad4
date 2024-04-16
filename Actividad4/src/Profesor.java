import java.util.Random;

public class Profesor {
    private Random random = new Random();

    public void ponerNotas(Alumno alumno) {
        alumno.getAsignatura1().setCalificacion(generarCalificacionAleatoria());
        alumno.getAsignatura2().setCalificacion(generarCalificacionAleatoria());
        alumno.getAsignatura3().setCalificacion(generarCalificacionAleatoria());
    }

    private double generarCalificacionAleatoria() {
        return random.nextDouble() * 10;
    }

    public double calcularMedia(Alumno alumno) {
        return (alumno.getAsignatura1().getCalificacion() +
                alumno.getAsignatura2().getCalificacion() +
                alumno.getAsignatura3().getCalificacion()) / 3;
    }
}
