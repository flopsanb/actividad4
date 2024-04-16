public class Actividad4 {
    public static void main(String[] args) {
        Asignatura asignatura1 = new Asignatura(1);
        Asignatura asignatura2 = new Asignatura(2);
        Asignatura asignatura3 = new Asignatura(3);

        Alumno alumno = new Alumno(asignatura1, asignatura2, asignatura3);

        Profesor profesor = new Profesor();
        profesor.ponerNotas(alumno);

        double media = profesor.calcularMedia(alumno);
        System.out.println("La media del alumno es: " + media);
    }
}
