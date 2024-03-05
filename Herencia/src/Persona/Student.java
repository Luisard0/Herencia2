package Persona;
import java.util.Arrays;

import EntradaSalida.Tools;

public class Student extends Person{
    //Atributos
    private int numCourses = 0;
    private String[] courses = {}; // Arreglo de cursos o materias
    private int[] grades= {}; // Calificación de las materias

    //Constructor parametrizado
    public Student(String name, String address) {
        super(name, address);
    }

    //Agrega una calificación y una materia al mismo tiempo
    public void addCourseGrade(String course, int grade){
        //No puede tener más de 30 cursos
        boolean existe = false;
        if(numCourses >= 30){
            Tools.salidaError("Un estudiante no puede tener más de 30 cursos >:[");
            throw new IllegalArgumentException("No se puede tener más de 30 cursos");
        }else{//Si aún hay espacio, se agrega el curso
            for(String materia :courses ){
                if(materia.equals(course)){
                    existe = true;
                    break;
                }
            }
            if (existe) {
                Tools.imprimeSalida("El curso "+course+" ya existe");
            }else{
                //Al agregar una nueva materia o curso el número de cursos aumenta
                numCourses+=1;
                //Se crean un nuevos arreglos como auxiliares para actualizar los datos de los arreglos con un espacio extra
                String[] auxCurses = new String[courses.length + 1];
                //Se recorre cada elemento del arreglo para copiarlo al nuevo 
                for(int i = 0; i < courses.length; i++){
                    auxCurses[i] = courses[i];
                }
                //Se asigna el parametro a lo ultimo de arreglo 
                auxCurses[courses.length] = course;
                //Se actualiza el arreglo con los nuevos datos
                courses = auxCurses;

                //Se crea el nuevo arreglo
                int[] auxGrades = new int[grades.length + 1];
                //Se copia la información al nuevo
                for(int j = 0; j<grades.length;j++){
                    auxGrades[j] = grades[j];
                }
                //Se asigna el nuevo valor
                auxGrades[grades.length] = grade;
                
                //Se actualiza el arreglo
                grades = auxGrades;
            }
        }
    }
    //Getters del número de cursos
    public int getNumCourses() {
        return numCourses;
    }
    //Metodo para imprimir calificaciones
    public void printGrades(){
        String cad ="--- Calificaciones por Materia ---\n\n";
        //Se recorre tanto el arreglo de cursos como de calificaciones
        for (int i = 0; i < grades.length; i++){
            //Se agrega a la cadena los cursos con su respectiva calificación
            cad += courses[i] +" ---- "+ grades[i]+"\n";
        }
        //Se imprime la cadena
        Tools.imprimeSalida(cad);
    }

    //Método para obtener el promedio
    public double getAverageGrade(){
        double suma = 0;
        for(int i = 0; i < grades.length; i++){
            //Se suman todas las calificaciones del arreglo
            suma += grades[i];
        }
        // for(int calificacion : grades){
        //     suma+= calificacion;
        // }
        return (double) (suma / numCourses);
    }
    //toString --->> Heredando el del padre
    @Override
    public String toString() {
        return super.toString()+"\nNo. de cursos: " + numCourses + "\nCursos: " + Arrays.toString(courses) + "\nCalificaciones: "+Arrays.toString(grades);
    }
}
