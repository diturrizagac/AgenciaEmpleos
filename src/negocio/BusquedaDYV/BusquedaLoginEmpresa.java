/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio.BusquedaDYV;

import entidad.Empresa;
import entidad.ParametrosLogin;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Diego Iturrizaga
 */
public class BusquedaLoginEmpresa extends BusquedaDivideYVenceras<Empresa, ParametrosLogin>{
    
    @Override
    protected List<Empresa> resolver(List<Empresa> lista, ParametrosLogin parametros) {
        Empresa empresa = null;
        
        for(int i = 0; i < lista.size(); i++){
            //Obtenemos el usuario "i"
            Empresa empresaAux = lista.get(i);
            
            //Verificamos la condición
            if(parametros.getUsuario().trim().equals(empresaAux.getRuc()) == true &&
                parametros.getPassword().trim().equals(empresaAux.getPassword()) == true){
                empresa = empresaAux;
                i = lista.size()+1;
            }
        }
        /* Validamos si se encontro algun resultado */
        List<Empresa> resultado = new ArrayList<Empresa>();
        if(empresa != null){
            resultado.add(empresa);
        }
        return resultado;
    }
}
