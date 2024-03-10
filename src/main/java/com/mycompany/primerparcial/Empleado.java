package com.mycompany.primerparcial;

public class Empleado extends AbstractPersona{
 
     private String codigo;
    private String puesto;
    private int salario;

    public Empleado(String id, String Nombre, String Apellido, String Direccion, String Telefono) {
        super(id, Nombre, Apellido, Direccion, Telefono);
        this.codigo = codigo;
        this.puesto = puesto;
        this.salario = salario;
    }

    @Override
    public void ConsultarPersona() {
        System.out.println(this.getId() + " " + this.getNombre() + " " + this.getApellido() + " "
                + this.getDireccion() + " " + this.getTelefono());
    }

    public void GuardarEmpleado(Empleado empleado) {
        this.setCodigo(empleado.getCodigo());
        this.setPuesto(empleado.getPuesto());
        this.setSalario(empleado.getSalario());
    }

    public void ObtenerAlumno() {
        System.out.println(this.codigo + " " + this.salario + " " + this.puesto);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

}
