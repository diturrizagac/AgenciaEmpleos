
package entidad;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Diego Iturrizaga
 */

public class EstudiosRealizados implements Serializable{
    private String centroEstudios;
    private String gradoInstruccion;
    private Date fechaInicio;
    private Date fechaFin;

    public EstudiosRealizados() {
        this.centroEstudios = null;
        this.gradoInstruccion = null;
        this.fechaInicio = null;
        this.fechaFin = null;
    }

    public String getCentroEstudios() {
        return centroEstudios;
    }

    public String getGradoInstruccion() {
        return gradoInstruccion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setCentroEstudios(String centroEstudios) {
        this.centroEstudios = centroEstudios;
    }

    public void setGradoInstruccion(String gradoInstruccion) {
        this.gradoInstruccion = gradoInstruccion;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    
}
