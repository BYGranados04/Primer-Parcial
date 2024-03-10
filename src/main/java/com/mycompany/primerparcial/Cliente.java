
package com.mycompany.primerparcial;


public class Cliente extends AbstractPersona{
     
    private int codigo;
    private String saldo;
  
    public Cliente(int id, String nombre, String apellido, String direccion, String telefono, int codigo, String saldo) {
        super(id, nombre, apellido, direccion, telefono);
        this.codigo = codigo;
        this.saldo = saldo;
        
    }
    @Override
    public void ConsultarPersona() {
        System.out.println(this.getId()+" "+this.getNombre()+" "+this.getApellido()+" "+this.getDireccion()+" "+this.getTelefono());
    }
    
    public void ConsultarCliente(){
        System.out.println(codigo+" "+" "+saldo+" ");
    }
}
