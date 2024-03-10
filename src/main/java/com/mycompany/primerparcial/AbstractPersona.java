package com.mycompany.primerparcial;

public abstract class AbstractPersona {
    
    private int Id;
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private String Telefono;
    
    public AbstractPersona(int id, String nombre, String apellido, String direccion, String telefono){
        this.Id = id;
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Direccion = direccion;
        this.Telefono = telefono;
    }
    
    public abstract void ConsultarPersona();

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        this.Apellido = apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        this.Direccion = direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        this.Telefono = telefono;
    }
    
}
