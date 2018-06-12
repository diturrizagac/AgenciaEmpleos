
package entidad;

import java.io.Serializable;

/**
 *
 * @author Diego Iturrizaga
 */

public abstract class Usuario implements Serializable{
    protected String direccion;
    protected String telefono;
    protected String email;
    protected String contrasenia;
    
    public Usuario() {

    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return contrasenia;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.contrasenia = password;
    }
    
    
}
