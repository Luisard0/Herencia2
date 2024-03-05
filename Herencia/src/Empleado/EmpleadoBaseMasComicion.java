package Empleado;
public class EmpleadoBaseMasComicion {
    private String nombre;
    private float ventas;
    private float sueldoBase;
    private float comision;


    public EmpleadoBaseMasComicion(String nombre, float ventas, float comision, float sueldoBase) {
        this.nombre = nombre;
        this.ventas = ventas;
        this.comision = comision;
        this.sueldoBase = sueldoBase;
    }

    
    //Metodos Getters y setters

    public String getNombre() {
        return nombre;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }


    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
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
        return sueldoBase + getVentas() * getComision();
    }

    public String MostrarDatos(){
        return "Nombre: "+getNombre()+"\nVentas: "+getVentas()+"\nComision: "+getComision()+
        "\nSueldo Base: "+getSueldoBase()+"\nSalario: "+ObtenerSalario();
    }
}

