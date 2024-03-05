package Persona;

public class Person {
    //Atributos
    private String name;
    private String address;
    //Constructor parametrizado
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    //Setteers and getters (no incluye a setName)
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    //toString
    @Override
    public String toString() {
        return name + "( " + address + " )";
    }
    

    
}
