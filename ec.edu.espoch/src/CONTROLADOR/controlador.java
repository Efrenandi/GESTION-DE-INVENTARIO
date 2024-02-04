/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.producto;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author:
 * Efrén Andi
 * Génesis delgado
 * Alejandro Rodríguez
 */
public class controlador {
    String ruta="bdProductos.txt";
    
    FileReader fr;
    BufferedReader br;
    
    FileWriter fw;
    
    producto p;
    
    public ArrayList<producto> array = new ArrayList();
    
    public void insertar (producto p) throws FileNotFoundException, IOException{
        fw = new FileWriter(ruta, true);
        String cad=p.getNomProdutco()+"-"+p.getCatProducto()+"-"+p.getPrecio()+"-"+p.getCategoria();
        fw.write(cad);
        fw.write(10);
        fw.close();
    }
    
    public void leer() throws FileNotFoundException, IOException{
        array.clear();
        fr = new FileReader(ruta);
        br = new BufferedReader(fr);
        
        String cad = br.readLine();
        String vec[];
        
        while(cad!=null){
            vec = cad.split("-");
            p = new producto(vec[0],vec[1],Double.parseDouble(vec[2]), vec[3]);
            array.add(p);
            cad=br.readLine();
        }
    }
}
