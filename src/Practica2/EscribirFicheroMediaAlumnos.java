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
		Scanner scan = null;
		PrintStream ps = null;
		
		try {
			scan  = new Scanner(v);
			ps = new PrintStream(vf);
			boolean salir =false;

			while (!salir) {
				texto = scan.nextLine();
				String linea[]= texto.split("",1);
				for (int i = 0; i < linea.length; i++) {
					ps.print(linea[i]+" ");
					if (texto.equals("fi")) {
						salir=true;
					}else {
						ps.append("-1");
					}
					ps.println();
				}
			}
			System.out.println("Fichero Escrito ");
		} catch (Exception e) {
			System.out.println("Error!! " + e);
		}
		ps.close();
		scan.close();


	}
}
