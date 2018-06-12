/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio.BusquedaDYV;

import entidad.Persona;
import java.util.ArrayList;
import java.util.List;
import entidad.ParametrosLogin;

/**
 *
 * @author Diego Iturrizaga
 */
public class BusquedaLoginPersona extends BusquedaDivideYVenceras<Persona, ParametrosLogin> {

    @Override
    protected List<Persona> resolver(List<Persona> lista, ParametrosLogin parametros) {
        Persona persona = null;
        
        for(int i = 0; i < lista.size(); i++){
            //Obtenemos el usuario "i"
            Persona personaAux = lista.get(i);
            
            //Verificamos la condición
            if(parametros.getUsuario().trim().equals(personaAux.getDni()) == true &&
                parametros.getPassword().trim().equals(personaAux.getPassword()) == true){
                persona = personaAux;
                i = lista.size()+1;
            }
        }
        /* Validamos si se encontro algun resultado */
        List<Persona> resultado = new ArrayList<Persona>();
        if(persona != null){
            resultado.add(persona);
        }
        return resultado;
    }
    
}
