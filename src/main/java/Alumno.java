import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {
    private String nombre, legajo;
    private List<Materia> materiasAprobadas;

    Boolean cumpleCorrelativas(Materia materia){
        return materiasAprobadas.containsAll(materia.getCorrelativas());
    }

    public void addMateriasAprobadas(Materia ... materia){
        Collections.addAll(materiasAprobadas, materia);
    }
    public Alumno(String legajo) {
        this.legajo = legajo;
        this.materiasAprobadas = new ArrayList<>();
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }
}
