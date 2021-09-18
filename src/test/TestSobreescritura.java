
package test;


import domain.*;

public class TestSobreescritura {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Jose", 5000);
//        System.out.println("empleado "+empleado.obtenerDetalles());
imprimir(empleado);
        
        empleado = new Gerente("Contabilidad", "Fermin", 10000);
//        System.out.println("gerente = " + gerente.obtenerDetalles());
        imprimir(empleado);
    }
    public static void imprimir(Empleado empleado){
        System.out.println("empleado "+empleado.obtenerDetalles());
    }
}
