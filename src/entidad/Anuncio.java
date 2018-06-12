
package entidad;

/**
 *
 * @author Diego Iturrizaga
 */

import java.io.Serializable;
//import java.util.ArrayList;

public class Anuncio implements Serializable{
    private String rubro, cargo, pagWeb;
    private String ubicacion;
    private String descripcion;
    private Empresa empresa;
    //private ArrayList<Persona> lsPostulantes;
    private String telefono;
    
     
    public Anuncio(){
        
    }
    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getLugar() {
        return ubicacion;
    }

    public void setLugar(String lugar) {
        this.ubicacion = lugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRubro() {
        return rubro;
    }

    public String getCargo() {
        return cargo;
    }

    public String getPagWeb() {
        return pagWeb;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    /*public ArrayList<Persona> getLsPostulantes() {
        return lsPostulantes;
    }*/

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setPagWeb(String pagWeb) {
        this.pagWeb = pagWeb;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    /*public void setLsPostulantes(ArrayList<Persona> lsPostulantes) {
        this.lsPostulantes = lsPostulantes;
    }*/
}
