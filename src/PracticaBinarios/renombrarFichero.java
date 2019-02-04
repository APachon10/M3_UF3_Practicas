package PracticaBinarios;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class renombrarFichero {
	public static void main(String[] args) {

		File f = null;
		String nombre_fichero ="";
		renombrarFichero rn  =new renombrarFichero();
		boolean salir= false;

		while (!salir) {
			System.out.println("Escribe el nombre del Fichero donde vas a escribir ");
			nombre_fichero= recogerCadenas();
			f=new File(nombre_fichero);
			if (f.exists()) {
				System.out.println("El Fichero ya existe ");
				salir= false;
			}else {
				rn.escribirFichero(f);
				salir=true;
			}
		}
	}
	public File escribirFichero(File v) {
		Scanner scan = new Scanner(System.in);
		try {
			boolean salir = false;
			PrintStream ps = new PrintStream(v);
			System.out.println("Contenido del Fichero:");
			while (!salir) {
				String texto = scan.nextLine();
				String lineas [] = texto.split(" ");
				for (int i = 0; i < lineas.length; i++) {
					if (lineas[i].equals(".")) {
						salir=true;
					}else {
						ps.println(lineas[i]+" ");
					}
				}
				
			}
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
		return v;
		
	}
//	public File renombrarFichero(File v) {
//		System.out.println("Que nombre le quieres poner al fichero?");
//		String nuevo_nombre= "";
//		nuevo_nombre = recogerCadenas();
//		v = new File(nuevo_nombre);
//		return v;
//	}
	public static String recogerCadenas() {
		Scanner scan = new Scanner(System.in);
		String palabra = "";
		palabra = scan.nextLine();
		return palabra;
	}
}
