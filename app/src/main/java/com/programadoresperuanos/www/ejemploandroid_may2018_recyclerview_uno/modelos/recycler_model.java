package com.programadoresperuanos.www.ejemploandroid_may2018_recyclerview_uno.modelos;

public class recycler_model {

    private String nombre;
    private String correo;
    private String telefono;
    private String dni;
    private String direccion;
    private int imagen;

    public recycler_model(String nombre, String correo, String telefono, String dni, String direccion, int imagen) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.dni = dni;
        this.direccion = direccion;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
