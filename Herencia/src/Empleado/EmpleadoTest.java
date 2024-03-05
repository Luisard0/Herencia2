package Empleado;
import EntradaSalida.Tools;

public class EmpleadoTest {
    public static void main(String[] args) {
        EmpleadoPorComision pepe = new EmpleadoPorComision("Pepe",2000,0.4f);
        EmpleadoBaseMasComicion paco = new EmpleadoBaseMasComicion("Paco", 2000, 0.1f, 1500);
        EmpleadoBaseMasComision2 paco2 = new EmpleadoBaseMasComision2("Paco", 2000, 0.1f, 1500);
        Tools.imprimeSalida(pepe.MostrarDatos());
        Tools.imprimeSalida(paco.MostrarDatos());
        Tools.imprimeSalida(paco2.MostrarDatos());
    }
}
