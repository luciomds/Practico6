/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico6;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author Usuario
 */
public class Practico6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //LinkedHashMap<Long, Cliente> coleccion = new LinkedHashMap<>();
        
        Cliente c1 = new Cliente(42994310, "Lucio", "Di Sanzo", "San Luis", "Junin 1234");
        Cliente c2 = new Cliente(40000808, "Martin", "Di Sanzo", "San Luis", "Chacabuco 1234");
        Cliente c3 = new Cliente(21376121, "Jorge", "Rojas", "San Luis", "Mitre 1234");
        Cliente c4 = new Cliente(18846540, "Carlos", "Quevedo", "San Juan", "Av. Libertador 3005");
        Cliente c5 = new Cliente(26376540, "Maria", "Becerra", "Mendoza", "San Martin 432");

        Directorio dir = new Directorio();

        dir.agregarCliente("2664323061", c1);
        dir.agregarCliente("2664333691", c2);
        dir.agregarCliente("2664455492", c3);
        dir.agregarCliente("2645166478", c4);
        dir.agregarCliente("2617366455", c5);

        System.out.println(dir.buscarCliente("2664333691"));

        dir.buscarClientes("San Luis");

        System.out.println(dir.buscarTelefono("Rojas"));
        
        dir.borrarCliente(42994310);
        
        System.out.println(dir);
    }

}
