/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentacar;

/**
 *
 * @author stive
 */
public class automovil {
    private String marca;
    private String modelo;
    private String color;
    private String numeropasajeros;
    private String foto;
    private String   precio;
    
    public automovil(){
        this.marca = "";
        this.modelo = "";
        this.color = "";
        this.numeropasajeros = "";
        this.precio= "";
        
    }
    
    public void automovil(String mar, String mod, String col, String nump, String pre){
        this.marca = mar;
        this.modelo = mod;
        this.color = col;
        this.numeropasajeros = nump;
        this.precio = pre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumeropasajeros() {
        return numeropasajeros;
    }

    public void setNumeropasajeros(String numeropasajeros) {
        this.numeropasajeros = numeropasajeros;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    
    
}
