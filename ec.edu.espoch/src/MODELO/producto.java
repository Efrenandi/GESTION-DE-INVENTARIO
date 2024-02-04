/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

/**
 *
 * @author:
 * Efrén Andi
 * Génesis delgado
 * Alejandro Rodríguez
*/
public class producto {
    private String nomProdutco;
    private String catProducto;
    private double precio;
    private String categoria;
    
    public producto(){
    }
    public producto(String nomProdutco, String catProducto, double precio,String categoria){
        this.nomProdutco = nomProdutco;
        this.catProducto = catProducto;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getNomProdutco() {
        return nomProdutco;
    }

    public void setNomProdutco(String nomProdutco) {
        this.nomProdutco = nomProdutco;
    }

    public String getCatProducto() {
        return catProducto;
    }

    public void setCatProducto(String catProducto) {
        this.catProducto = catProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
}
