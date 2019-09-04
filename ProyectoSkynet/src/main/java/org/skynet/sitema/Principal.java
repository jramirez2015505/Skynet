
package org.skynet.sitema;

import java.util.Scanner;
import org.skynet.dominio.Estudiante;


public class Principal {
    
    private static Scanner sc = new Scanner(System.in); // lee las opciones del usuario
    private static Scanner spersona = new Scanner(System.in); 
    private static Estudiante e;
    //private static PersonaJpaController personaDao = new PersonaJpaController();
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
			break;
// Actualizar Tupla
		case 3:
			break;
// Eliminar Tupla
		case 4:
			break;
// Listar Alumnos
		case 5:
			break;
// salir del Menu
		case 6:
			break;
// mensaje por default
		default:
			System.out.println("NO ES UNA OPCION DEL MENU!");
	
	}
}
        
}
