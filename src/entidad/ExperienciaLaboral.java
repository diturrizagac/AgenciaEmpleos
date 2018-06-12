
package entidad;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Diego Iturrizaga
 */

public class ExperienciaLaboral implements Serializable{
    private String nomEmpresa,rubro,cargo,descripcion;
    private Date fechaIngreso;
    private Date fechaSalida;
    private String ubicacion;
    
    public ExperienciaLaboral(){
        
    }
    
    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    public String getNomEmpresa() {
        return nomEmpresa;
    }

    public String getRubro() {
        return rubro;
    }

    public String getCargo() {
        return cargo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setNomEmpresa(String nomEmpresa) {
        this.nomEmpresa = nomEmpresa;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    
}
