
package entidad;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Diego Iturrizaga
 */

public class Persona extends Usuario implements Serializable{
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private String dni;
    private String sexo;
    private Curriculum cv;
    private String civil;
    private Date nacimiento;
    
    public Persona(){
        cv = new Curriculum();
    }
    
    public String getSexo() {
        return sexo;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getCivil() {
        return civil;
    }

    public void setCivil(String civil) {
        this.civil = civil;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public String getDni() {
        return dni;
    }

    public Curriculum getCv() {
        return cv;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setCv(Curriculum cv) {
        this.cv = cv;
    }
}