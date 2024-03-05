package Persona;

import java.util.Arrays;
import EntradaSalida.Tools;

public class Teacher extends Person{
    //Atributos
    private int numCourses = 0;
    private String[] courses = {};

    //Constructor
    public Teacher(String name, String address) {
        super(name, address);
    }

    //Metodo que agrega cursos, retorna falso si el curso ya existe
    public boolean addCourse(String course){
        //NO más de cinco cursos
        if(numCourses >= 5){
            Tools.salidaError("Un profesor no puede tener más de cinco cursos");
            throw new IllegalArgumentException("Un profesor no puede tener más de cinco cursos");
        }else{//Si aún hay espacio, se verifica si ya existe o no, si no se agrega
            //Valida si el curso ya existe
            for(String materia :courses ){
                if(materia.equals(course)){
                    Tools.imprimeSalida("El curso "+course+" ya existe");
                    return false; //Si encontró el curso
                }
            }
            //En caso de no encontrarlo, aumenta el número de cursos y lo agrega al arreglo
            numCourses+=1;
            //arreglo auxiliar
            String[] auxCurses = new String[courses.length + 1];
            //Se recorre cada elemento del arreglo para copiarlo al nuevo 
            for(int i = 0; i < courses.length; i++){
                auxCurses[i] = courses[i];
            }
            //Se asigna el parametro a lo ultimo de arreglo 
            auxCurses[courses.length] = course;
            //Se actualiza el arreglo con los nuevos datos
            courses = auxCurses;

            return true;//NO lo encontró
        }
    }

    //Metodo que quita cursos, retorna falso si el curso no existe
    public boolean removeCourse(String course){
        //Busca el curso en el arreglo de cursos
        for(String materia : courses){
            if (materia.equals(course)) {
                //si lo encontró, quitar el curso del arreglo
                String[] auxCurses = new String[courses.length -1];
                //Controla el orden en el que se van almacenando los cursos
                int auxIndice = 0;
                for (String asignatura : courses){
                    if(!asignatura.equals(course)){
                        auxCurses[auxIndice] = asignatura;
                        auxIndice++;
                    }
                }
                courses = auxCurses;
                numCourses-=1;
                Tools.imprimeSalida("El curso "+course+" ha sido eliminado con exito :)");
                return true;//si lo encontró
            }
        }
        Tools.imprimeSalida("El curso "+course+" no se ha encontrado");
        return false; // no lo encontró
    }

    //Getter del número de cursos
    public int getNumCourses() {
        return numCourses;
    }

    //toString
    @Override
    public String toString() {
        return super.toString()+"\nNo. de cursos: " + numCourses + "\nCursos" + Arrays.toString(courses);
    }  
}
