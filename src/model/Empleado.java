package model;

public class Empleado extends Persona {
    private String rol;
    private Direccion direccion;

    public Empleado(String nombre, String apellido, String rut, String rol, Direccion direccion) {
        super(nombre, apellido, rut);
        this.rol = rol;
        this.direccion = direccion;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return super.toString() + ", Rol: " + rol + ", " + direccion.toString();
    }
}

