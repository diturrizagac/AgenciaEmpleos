
package entidad;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Diego Iturrizaga
 */

public class Empresa extends Usuario implements Serializable{
    protected String razonSocial;
    protected String ruc;
    private ArrayList<Anuncio> lsAnuncios;
    
    public Empresa(){
        lsAnuncios = new ArrayList<Anuncio>();
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public String getRuc() {
        return ruc;
    }

    public ArrayList<Anuncio> getLsAnuncios() {
        return lsAnuncios;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public void setLsAnuncios(ArrayList<Anuncio> lsAnuncios) {
        this.lsAnuncios = lsAnuncios;
    } 
}
