package app;

import model.Direccion;
import model.Empleado;

public class Main {
    public static void main(String[] args) {
        Direccion direccion1 = new Direccion("Condorito 123", "Puerto Montt");
        Empleado empleado1 = new Empleado("Amaro", "Cortez", "12345678-9", "Operador", direccion1);
        System.out.println(empleado1.toString());

        Direccion direccion2 = new Direccion("Condorito 321", "Puerto Montt");
        Empleado empleado2 = new Empleado("Tomas", "Lazo", "98765432-1", "Jefe de Planta", direccion2);
        System.out.println(empleado2.toString());
    }
}
