import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public Materia(Materia ... materia) {//Uso el constructor para ya agregar las correlativas
        this.correlativas = new ArrayList<>();
        Collections.addAll(correlativas, materia);
    }
}
