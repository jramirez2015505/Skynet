package org.skynet.sitema;

import java.util.Scanner;
import org.skynet.dao.EstudianteJpaController;
import org.skynet.dao.exceptions.NonexistentEntityException;
import org.skynet.dominio.Estudiante;


public class Principal {
    
    private static Scanner sc = new Scanner(System.in); // lee las opciones del usuario
    private static Scanner sestudiante = new Scanner(System.in); 
    private static Estudiante e;
    private static EstudianteJpaController estudianteDao = new EstudianteJpaController();
    private static int op, id;
    
// creacion de menu y switch por : Michael Mazariegos 

public static void main(String[] args){
// se define el menu
		System.out.println("***********************************");
		System.out.println("|//////// Menu de Opciones  /////////|");
		System.out.println("|------------------------------------|");
		System.out.println("|--- 1. Mostrar Alumno por Codigo----|");
		System.out.println("|---- 2. Agregar Alumno a SGBD ------|");
		System.out.println("|------- 3. Actualizar Tupla --------|");
		System.out.println("|-------- 4. Eliminar Tupla ---------|");
		System.out.println("|-------- 5. Listar Alumnos ---------|");
		System.out.println("|-------- 6. salir del Menu ---------|");
		System.out.println("|------------------------------------|");
		System.out.println("|///////  SKYNET ENTERPRISE  ////////|");
		System.out.println("|   Ingrese una opcion a realizar:   |");
		System.out.println("|***********************************|");
		op = sc.nextInt();
	switch(op){
// Mostrar Alumno por Codigo
		case 1:
			break;
// Agregar Alumno a SGBD
		case 2:
                    e = getEstudiante();
                if (estudianteDao.agregarEstudiante(e))
                System.out.println("Se agrago con exito");
                else
                System.out.println("No se pudo agregar a la nueva Estudiante");
                break;
	
// Actualizar Tupla
		case 3:
                    e = obtenerEstudiante();
                    System.out.println(e);
                    System.out.println("Ingrese el codigo, el carnet, los nombres, apellidos, grado y seccion del Estudiante");
                    e = new Estudiante(sc.nextInt(), sc.nextInt(), sestudiante.nextLine(), sestudiante.nextLine(), sestudiante.nextLine(), sestudiante.nextLine());
                    try {
                        estudianteDao.editarEstudiante(e);
                        System.out.println("Se ha actualizado correctamente");
                    } catch (Exception ex) {
                        System.out.println("No se puede actualizar el registro...");
                    }
                    break;

                case 4:
                    e = obtenerEstudiante();
                    System.out.println("Esta seguro de eliminar el siguiente Estudiante?");
                    System.out.println(e);        
                    try {
                        estudianteDao.eliminarEstudiante(id);
                        System.out.println("Registro eliminado exitrosamente!");
                    } catch (NonexistentEntityException ex) {
                        System.out.println("No se puede eliminar el registro.");
                    }
                    break;
					
// Listar Alumnos
		case 5:
			break;
// salir del Menu
		case 6:
                    System.out.println("Gracias por utilizar el menu!");
                    break;
// mensaje por default
		default:
                    System.out.println("No es una opción del menu, escoja una del menu...");
                    break;
	
	}
}
        
    private static Estudiante obtenerEstudiante(){
        System.out.println("Ingrese el codigo del Estudiante");
        id = sc.nextInt();
        e = estudianteDao.buscarEstudiante(id);
        return e;
}

    private static Estudiante getEstudiante(){
        System.out.println("Ingrese el codigo, el carnet, los nombres, apellidos, grado y seccion del Estudiante");
        Estudiante e = new Estudiante(sc.nextInt(), sc.nextInt(), sestudiante.nextLine(), sestudiante.nextLine(), sestudiante.nextLine(), sestudiante.nextLine());
        return e;
    }
}
        

