package negocio;

import entidad.*;
import java.util.ArrayList;
import java.util.List;
import negocio.BusquedaDYV.BusquedaLoginEmpresa;
import negocio.BusquedaDYV.BusquedaLoginPersona;
import static negocio.Gestor.baseDeDatos;

/**
 *
 * @author Diego Iturrizaga
 */

public class GestorUsuarioEmpresa extends Gestor {

    public boolean iniciarSesion(Empresa empresa) {
        boolean estado = false;
        
        /*Obtenemos la tabla de la base de datos*/
        List<Empresa> empresas = baseDeDatos.getEmpresas();
        /*Asignamos los datos para luego validar */
        ParametrosLogin parametros = new ParametrosLogin();
        parametros.setUsuario(empresa.getRuc());
        parametros.setPassword(empresa.getPassword());
        /*Creamos una variable para capturar los posibles resultados */
        List<Empresa> resultado;
        /*Buscamos en la base de datos la existencia del usuario*/
        BusquedaLoginEmpresa DYV = new BusquedaLoginEmpresa();
        resultado = DYV.buscar(empresas, parametros);
        if(resultado.size() != 0){
            estado = true;
        }
        return estado;
    }

    public boolean registrarEmpresa(Empresa empresa) {
        boolean estado = false;

        /*Buscamos al empresa para verificar si ya existe*/
        Empresa empresaAux = validarEmpresa(empresa.getRuc());
        if (empresaAux == null) {
            /*Registramos la empresa en la base de datos*/
            baseDeDatos.getEmpresas().add(empresa);
            /*Actualizamos el estado*/
            estado = true;
        }
        return estado;
    }

    public Empresa buscarEmpresa(String ruc, String nombre) {
        Empresa empresa = null;

        /*Obtenemos la tabla de la base de datos*/
        ArrayList<Empresa> empresas = baseDeDatos.getEmpresas();

        /*Buscamos al alumno en la tabla*/
        Empresa empresaAux = null;
        for (int i = 0; i < empresas.size(); i++) {
            /*Obtenemos el alumno "i"*/
            empresaAux = empresas.get(i);

            /*Verificamos la condición de búsqueda*/
            if ((ruc.trim().equalsIgnoreCase(empresaAux.getRuc()) == true)
                    || (nombre.trim().equalsIgnoreCase(empresaAux.getRazonSocial()) == true)) {
                empresa = empresaAux;
                i = empresas.size() + 1;
            }
        }
        return empresa;
    }

    public Empresa buscarEmpresa(String ruc) {
        Empresa empresa = null;

        /*Obtenemos la tabla de la base de datos*/
        ArrayList<Empresa> lsEmpresas = baseDeDatos.getEmpresas();

        /*Buscamos al alumno en la tabla*/
        Empresa empresaAux = null;
        for (int i = 0; i < lsEmpresas.size(); i++) {
            /*Obtenemos el alumno "i"*/
            empresaAux = lsEmpresas.get(i);

            /*Verificamos la condición de búsqueda*/
            if (ruc.trim().equalsIgnoreCase(empresaAux.getRuc()) == true) {
                empresa = empresaAux;
                i = lsEmpresas.size() + 1;
            }
        }

        return empresa;
    }

    public Empresa validarEmpresa(String ruc) {
        Empresa empresa = null;

        /*Obtenemos la tabla de la base de datos*/
        ArrayList<Empresa> Empresas = baseDeDatos.getEmpresas();

        /*Buscamos la empresa en la tabla*/
        Empresa empresaAux = null;
        for (int i = 0; i < Empresas.size(); i++) {
            /*Obtenemos la empresa "i"*/
            empresaAux = Empresas.get(i);

            /*Verificamos la condición de búsqueda*/
            if (ruc.trim().equalsIgnoreCase(empresaAux.getRuc()) == true) {
                empresa = empresaAux;
                i = Empresas.size() + 1;
            }
        }

        return empresa;
    }

    public ArrayList<Persona> buscarTrabajador(String rubro) {

        /*Obtenemos la tabla de la Base de datos*/
        ArrayList<Persona> personas = baseDeDatos.getPersonas();
        ArrayList<Persona> candidatos = new ArrayList<Persona>();

        for (int i = 0; i < personas.size(); i++) {
            for (int j = 0; j < personas.get(i).getCv().getTrabajos().size(); j++) {
                if (rubro.trim().equalsIgnoreCase(personas.get(i).getCv().getTrabajos().get(j).getRubro()) == true) {
                    candidatos.add(personas.get(i));
                    j = personas.get(i).getCv().getTrabajos().size() + 1;
                }
            }
        }
        return candidatos;
    }

    public ArrayList<Persona> buscarTrabajador(String rubro, String cargo) {
        /*Obtenemos la tabla de la Base de datos*/
        ArrayList<Persona> personas = baseDeDatos.getPersonas();
        ArrayList<Persona> candidatos = new ArrayList<Persona>();

        for (int i = 0; i < personas.size(); i++) {
            for (int j = 0; j < personas.get(i).getCv().getTrabajos().size(); j++) {
                if (rubro.trim().equalsIgnoreCase(personas.get(i).getCv().getTrabajos().get(j).getRubro()) == true
                        && cargo.trim().equalsIgnoreCase(personas.get(i).getCv().getTrabajos().get(j).getCargo()) == true) {
                    candidatos.add(personas.get(i));
                    j = personas.get(i).getCv().getTrabajos().size() + 1;
                }
            }
        }
        return candidatos;
    }

    public void publicarAnuncio(Anuncio anuncio, Empresa empresa) {
        //guardamos el anuncio en la base de datos de la empresa
        empresa.getLsAnuncios().add(anuncio);
    }

    public void actualizarAnuncio(Anuncio anuncio1, Anuncio anuncio2, Empresa empresa) {

        for (int i = 0; i < empresa.getLsAnuncios().size(); i++) {
            if (anuncio1 == empresa.getLsAnuncios().get(i)) {
                empresa.getLsAnuncios().set(i, anuncio2);
            }
        }
    }

    public ArrayList<Anuncio> verMisAnuncios(Empresa empresa) {
        ArrayList<Anuncio> msAnuncios = new ArrayList<Anuncio>();
        for (int i = 0; i < empresa.getLsAnuncios().size(); i++) {
            msAnuncios.add(empresa.getLsAnuncios().get(i));
        }
        return msAnuncios;
    }

    public ArrayList<Empresa> listarEmpresas() {
        /*Retornamos la lista de empresas*/
        return baseDeDatos.getEmpresas();
    }
    /*public boolean seleccionarTrabajador(Persona persona, Anuncio anuncio) {
        boolean estado = false;

        ArrayList<Empresa> empresas = baseDeDatos.getEmpresas();
        Anuncio anuncioAux = null;

        for (int i = 0; i < empresas.size(); i++) {
            for (int j = 0; j < empresas.get(i).getLsAnuncios().size(); j++) {
                if (anuncio == empresas.get(i).getLsAnuncios().get(j)) {
                    empresas.get(i).getLsAnuncios().get(j).setSeleccionado(persona);
                    persona.getPuestosObtenidos().add(anuncio);
                    j = empresas.get(i).getLsAnuncios().size() + 1;
                    i = empresas.size() + 1;
                    estado = true;
                }
            }
        }
        return estado;
    }*/
    /*public void ofrecerTrabajo(Persona persona, Anuncio anuncio) {
        persona.getPuestosObtenidos().add(anuncio);
    }*/
    
        /*public ArrayList<Persona> verPostulantes(Anuncio anuncio) {
        ArrayList<Persona> msPostulantes = null;
        for (int i = 0; i < anuncio.getLsPostulantes().size(); i++) {
            msPostulantes.add(anuncio.getLsPostulantes().get(i));
        }
        return msPostulantes;
    }*/
}
