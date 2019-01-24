package Practica1;

import java.io.File;
import java.util.Scanner;

public class buscarFichero {
	public static void main(String[] args) {
		//Variables
		File f;
		String documento ="";
		//Pedimos los datos
		System.out.print("Que documento quieres buscar?");
		documento = leerString();
		System.out.print("Introduce la ruta ");
		f =new File(leerString());
		buscarFichero(f,documento);
	}
	public static void buscarFichero(File v,String doc) {
		File [] archivos ; 
		archivos =v.listFiles();

		for (int i = 0; i < archivos.length; i++) {
			if (archivos[i].isDirectory()) {
				buscarFichero(archivos[i], doc);
			} else {
				String archivo = archivos[i].getName();
				if (archivo.equalsIgnoreCase(doc)) {
					System.out.println("S'ha trobat el fitxer a: " + archivos[i].getAbsolutePath());
				}
			}
		}
	}
	public static String leerString() {
		Scanner scan = new Scanner(System.in);
		String palabra = "";
		palabra = scan.next();

		return palabra;
	}

}
