package Empleado;
public class EmpleadoBaseMasComision2 extends EmpleadoPorComision{

    private float sueldoBase;

    public EmpleadoBaseMasComision2(String nombre, float ventas, float comision, float sueldoBase){
        super(nombre, ventas, comision);
        this.sueldoBase = sueldoBase;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public float ObtenerSalario(){
        return sueldoBase + getVentas() * getComision();
    }
    public String MostrarDatos(){
        return "Nombre: "+getNombre()+"\nVentas: "+getVentas()+"\nComision: "+getComision()+
        "\nSueldo Base: "+getSueldoBase()+"\nSalario: "+ObtenerSalario();
    }

}
