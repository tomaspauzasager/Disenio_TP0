import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;

    public void addMaterias(Materia ... materia){
        Collections.addAll(this.materias, materia);
    }
    public Boolean aprobado(){
        if(materias.stream().anyMatch(m -> alumno.getMateriasAprobadas().contains(m))) //Si el alumno ya tiene la materia aprobada => se rechaza la inscripcion
            return false;

        return materias.stream().allMatch(m -> alumno.cumpleCorrelativas(m));
    }

    public Inscripcion(Alumno alumno) {
        this.materias = new ArrayList<>();
        this.alumno = alumno;
    }
}
