package Persona;

import javax.swing.JOptionPane;
import EntradaSalida.Tools;

public class testPersona {
    public static void main(String[] args) {
        Menu("Estudiante,Maestro,Imprimir personas registradas,Salir");
    }

    //Menú de menus 
    public static void Menu(String menu) {
		String sel;
        //38
        String cadEstudiantes = "--- Estudiantes ----\n";
        String cadMaestros = "--- Maestros ---\n";
        boolean studentUsed = false;
        boolean teacherUsed = false;
		do {
			sel=desplegable(menu);  
			switch (sel) {
			case "Estudiante":
                studentUsed = true;
                cadEstudiantes += Menu_Estudiante("Agregar Curso y Calificación,Obtener Promedio,Imprimir Calificaciones,Imprimir Datos,Volver al menú principal")+"\n";
                break;
			case "Maestro":
                teacherUsed = true;
                cadMaestros += Menu_Maestro("Agregar Curso,Quitar Curso,Mostrar Cursos,Volver al menú principal")+"\n";
                break;
            case "Imprimir personas registradas": 
                if(!studentUsed && !teacherUsed){
                    Tools.salidaError("No se ha agregado ni un estudiante ni un maestro");
                }else{
                    Tools.imprimeSalida("--- Estudiantes y Maestros registrados ---\n" + cadEstudiantes+"\n\n"+cadMaestros);
                }
                break;
			case "Salir":;break;
			}//switch
		}while (!sel.equalsIgnoreCase("Salir"));
	}

    //Menú de estudiante
    public static String  Menu_Estudiante(String menuStudent){
        String sal;
        Student estudiante = new Student(Tools.leerString("Nombre del estudiante: "), Tools.leerString("Dirección: "));
        String cad = "\n[] Datos del estudiante "+estudiante.getName()+"\n";
        do {
            sal = desplegable(menuStudent);
            switch (sal) {
                case "Agregar Curso y Calificación":
                    estudiante.addCourseGrade(Tools.leerString("Nombre del curso: "), Tools.leerInt("Calificación del curso: "));
                    Tools.imprimeSalida(estudiante.toString());
                    break;
                case "Obtener Promedio":
                    if(estudiante.getNumCourses() == 0){
                        Tools.salidaError("No hay cursos registrados >:[");
                    }else{
                        Tools.imprimeSalida("Promedio: "+estudiante.getAverageGrade());
                    }
                    break;
                case "Imprimir Calificaciones":
                    if(estudiante.getNumCourses() == 0){
                        Tools.salidaError("No hay cursos registrados >:[");
                    }else{
                        estudiante.printGrades();
                    }
                    break;
                case "Imprimir Datos":
                    if(estudiante.getNumCourses() == 0){
                        Tools.salidaError("No hay cursos registrados >:[");
                    }else{
                        Tools.imprimeSalida(estudiante.toString()+"\nPromedio: "+estudiante.getAverageGrade());
                        estudiante.printGrades();
                    }
                    break;
                case "Volver al menú principal":
                    Tools.imprimeSalida("Se ha agregado al alumno "+estudiante.getName()+" con los siguientes datos: \n"+estudiante.toString());
                    break;
            }
        } while (!sal.equalsIgnoreCase("Volver al menú principal"));
        return cad += estudiante.toString();
    }

    //Menú de Maestro
    public static String Menu_Maestro(String menuTeacheer){
        String sol;
        Teacher maestro = new Teacher(Tools.leerString("Nombre del maestro: "),Tools.leerString("Dirección del maestro: "));
        String cad = "\n[] Datos del maestro "+maestro.getName()+"\n";
        do {
            sol = desplegable(menuTeacheer);
            switch (sol) {
                case "Agregar Curso":
                    maestro.addCourse(Tools.leerString("Nombre del curso: "));
                    Tools.imprimeSalida(maestro.toString());
                    break;
                case "Quitar Curso":
                    if(maestro.getNumCourses() == 0){
                        Tools.salidaError("NO hay cursos registrados >:[");
                    }else{
                        maestro.removeCourse(Tools.leerString("Nombre del curso a quitar: "));
                        //Tools.imprimeSalida(maestro.toString());
                    }
                    break;
                case "Mostrar Cursos":
                    if(maestro.getNumCourses() == 0){
                        Tools.salidaError("NO hay cursos registrados >:[");
                    }else{
                        Tools.imprimeSalida(maestro.toString());
                    }
                    break;
                case "Volver al menú principal":
                    Tools.imprimeSalida("Se ha agregado al maestro "+maestro.getName()+" con los siguientes datos: \n"+maestro.toString());
                    break;
            }
        } while (!sol.equalsIgnoreCase("Volver al menú principal"));
        return cad += maestro.toString();
    }
    


    public static String desplegable(String menu) {
		String valores []=menu.split(",");
		String res= (String)JOptionPane.showInputDialog(null,"--- Menú ---","Selecciona opcion:",
				JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
		return (res);
	}
}
