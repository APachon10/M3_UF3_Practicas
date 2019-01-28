package Practica2;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class EscribirFicheroMediaAlumnos {
	public static void main(String[] args) {
		//Objeto con el cual llamaremos a la funcion 
		EscribirFicheroMediaAlumnos es = new EscribirFicheroMediaAlumnos();
		//Variables que le enviaremos al metodo 
		File f = new File("MediaAlumnos.txt");
		String nombre_Fichero = "NotaMitja.txt";
		//Llamamos al Metodo 
		es.escribirFichero(f, nombre_Fichero);
	}
	public void escribirFichero(File v,String name_file) {
		//File donde vamos a escribir el contenido del otro fichero 
		File vf= new File(name_file);
		String texto = "";
		try {
			Scanner scan  = new Scanner(v);
			PrintStream ps = new PrintStream(vf);
			boolean salir =false;
			
			while (!salir) {
				texto = scan.nextLine();
				if (texto.equals("fi")) {
					salir=true;
				}else {
						
				}
			}
		} catch (Exception e) {
			System.out.println("Error!! " + e);
		}
		
		
	}
}
