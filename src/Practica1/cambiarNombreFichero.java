package Practica1;

import java.io.File;
import java.util.Scanner;

public class cambiarNombreFichero {
	public static void main(String[] args) {
		//Variables
		String cad1;	
		File f = new File("Temp");
		String cadena [] =null ;
		//Pedimos los Datos 
		System.out.print("Introduce una cadena:");
		cad1=leerLinea();
		//Dividimos la cadena en 2 cadenas y la metemos en un array
		cadena= cad1.split("");
		String extension1 = cadena[0]+cadena[1]+cadena[2];
		String extension2 = cadena[4]+cadena[5]+cadena[6];
		//Comprobamos que el fichero existe
		comprobarFichero(f,extension1,extension2);
		
	}
	/*Metodo para comprovar que existe el fichero introducido por el usuario*/
	public static void comprobarFichero(File v,String ext1,String ext2) {
		File [] archivo ;
		archivo = v.listFiles();
		
		for (int i = 0; i < archivo.length; i++) {
			int indice = archivo[i].getName().indexOf(".");
			if (archivo[i].getName().contains(ext1)) {
				archivo[i].renameTo(new File(v+File.separator+archivo[i].getName().substring(0, indice) +"."+ext2));
			}
			
		}
	}
	/*Metodo para Recoger cualquier String */
	public static String leerLinea() {
		Scanner scan = new Scanner(System.in);
		String palabra = "";
		
		palabra= scan.nextLine();
		scan.close();
		return palabra;
		
	}
}
