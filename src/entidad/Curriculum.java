
package entidad;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Diego Iturrizaga
 */

public class Curriculum implements Serializable{
    private ArrayList<EstudiosRealizados> estudios;
    private ArrayList<ExperienciaLaboral> trabajos;
    
    public Curriculum(){
        estudios = new ArrayList<EstudiosRealizados>();
        trabajos = new ArrayList<ExperienciaLaboral>();
    }

    public ArrayList<EstudiosRealizados> getEstudios() {
        return estudios;
    }

    public ArrayList<ExperienciaLaboral> getTrabajos() {
        return trabajos;
    }

    public void setEstudios(ArrayList<EstudiosRealizados> estudios) {
        this.estudios = estudios;
    }

    public void setTrabajos(ArrayList<ExperienciaLaboral> trabajos) {
        this.trabajos = trabajos;
    }
}
