import org.junit.Test;
import org.junit.Assert;

public class InscripcionTest {
    //1er año
    private Materia am1 = new Materia();
    private Materia aga = new Materia();

    //2do año
    private Materia am2 = new Materia(am1, aga);

    @Test
    public void InscripcionConMateriaDe1erAnio() {
        Alumno alumno = new Alumno("209.130-6");
        Inscripcion inscripcion = new Inscripcion(alumno);

        inscripcion.addMaterias(am1);

        Assert.assertTrue(inscripcion.aprobado());
    }

    @Test
    public void InscripcionConMateriasDe1erAnio() {
        Alumno alumno = new Alumno("209.130-6");
        Inscripcion inscripcion = new Inscripcion(alumno);

        inscripcion.addMaterias(am1, aga);

        Assert.assertTrue(inscripcion.aprobado());
    }

    @Test
    public void InscripcionConCorrelativasRequeridasYAlumnoCumpleCorrelativas() {
        Alumno alumno = new Alumno("209.130-6");
        Inscripcion inscripcion = new Inscripcion(alumno);

        alumno.addMateriasAprobadas(am1, aga);
        inscripcion.addMaterias(am2);

        Assert.assertTrue(inscripcion.aprobado());
    }

    @Test
    public void InscripcionConCorrelativasRequeridasYAlumnoNoTieneMateriasAprobadas(){
        Alumno alumno = new Alumno("209.130-6");
        Inscripcion inscripcion = new Inscripcion(alumno);

        inscripcion.addMaterias(am2);
        Assert.assertFalse(inscripcion.aprobado());
    }

    @Test
    public void InscripcionConCorrelativasRequeridasYAlumnoNoCumpleCorrelativas(){
        Alumno alumno = new Alumno("209.130-6");
        Inscripcion inscripcion = new Inscripcion(alumno);

        alumno.addMateriasAprobadas(am1);
        inscripcion.addMaterias(am2);
        Assert.assertFalse(inscripcion.aprobado());
    }

}