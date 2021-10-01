/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico6;

//import java.util.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author Usuario
 */
public class Directorio {

    private LinkedHashMap<String, Cliente> directorio = new LinkedHashMap<>();
    //HashMap<String, Integer> hm = new HashMap<>();

    public Directorio() {
    }

    //private HashSet <Cliente> clientes = new HashSet<>();
    //private HashSet <Long> telefonos = new HashSet<>();
    public Directorio(LinkedHashMap directorio) {
        this.directorio = directorio;
    }

    public boolean agregarCliente(String telefono, Cliente cliente) {
        return directorio.put(telefono, cliente) == null;
    }

    public Cliente buscarCliente(String telefono) {
        if (directorio.containsKey(telefono)) {
            return directorio.get(telefono);
        } else {
            System.out.println("No se encontro un cliente asociado al numero.");
            return null;
        }
    }

    public List<String> buscarTelefono(String apellido){
        ArrayList<String> nros = new ArrayList<>();
        Collection valores = directorio.values();
        Iterator it = valores.iterator();
        for (Map.Entry<String, Cliente> e : directorio.entrySet()) {

            String clave = e.getKey();
            Cliente valor = e.getValue();
            if(valor.getApellido().equals(apellido)){
                nros.add(clave);
            }
            
        }
        
        return nros;
    }
    
    public List<Cliente> buscarClientes(String ciudad) {
        ArrayList<Cliente> clientes = new ArrayList<>();

        Collection valores = directorio.values();
        Iterator it = valores.iterator();

        while (it.hasNext()) {
            Cliente valor = (Cliente) it.next();
            if (valor.getCiudad().equals(ciudad)) {
                
                clientes.add(valor);
            }
        }

        return clientes;
    
    }

    public Cliente borrarCliente(long dni) {
        Collection valores = directorio.values();
        Iterator it = valores.iterator();
        Cliente c= new Cliente(0, "", "", "", "");
        for (Map.Entry<String, Cliente> e : directorio.entrySet()) {

            String clave = e.getKey();
            Cliente valor = e.getValue();
            if(valor.getDni()==dni){
                c = directorio.get(clave);
                System.out.println("Cliente eliminado: \n"+valor.toString() + " Telefono: "+clave);
                directorio.remove(e, valor);
                
            }
               
            
        }
        return c;
    }
    
    /*● buscarTeléfono() que en base a un apellido nos devuelve una lista con los nros de
    teléfono asociados a dicho apellido.
    ● buscarClientes() que en base a una ciudad nos devuelve una lista con los Clientes
    asociados a dicha ciudad.
    ● borrarCliente() que en base a un dni elimina el cliente del directorio*/

    @Override
    public String toString() {
        return "Directorio{" + "directorio=" + directorio + '}';
    }

}
