package Empleado;
public class EmpleadoPorComision {
    
    private String nombre;
    private float ventas;
    private float comision;

    public EmpleadoPorComision(String nombre, float ventas, float comision) {
        this.nombre = nombre;
        this.ventas = ventas;
        this.comision = comision;
    }

    
    //Metodos Getters y setters

    public String getNombre() {
        return nombre;
    }

    public float getVentas() {
        return ventas;
    }


    public void setVentas(float ventas) {
        this.ventas = ventas;
    }


    public float getComision() {
        return comision;
    }


    public void setComision(float comision) {
        this.comision = comision;
    }

    //Metodos
    public float ObtenerSalario(){
        return getVentas()*getComision();
    }

    public String MostrarDatos(){
        return "Nombre: "+getNombre()+"\nVentas: "+getVentas()+"\nComision: "+getComision()+"\nSalario: "+ObtenerSalario();
    }
    
}

