/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentacar;

/**
 *
 * @author stive
 */
public class cliente {
    private String nombre;
    private String apellido;
    private String cedula;
    private String telefono;
    private String email;
    
    public cliente(){
        this.nombre = "";
        this.apellido = "";
        this.cedula = "";
        this.telefono = "";
        this.email = "";
    }
    
    public void cliente(String nom, String ape, String ced, String tel, String emm){
        this.nombre = nom;
        this.apellido = ape;
        this.cedula = ced;
        this.telefono =  tel;
        this.email = emm;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
            
}
