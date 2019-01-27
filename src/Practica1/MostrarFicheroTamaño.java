package Practica1;

import java.io.File;

public class MostrarFicheroTamaño {
	public static void main(String[] args) {
		//Variables
		File f = new File("Temp3");
		mostrarFicheros(f,500);

	}
	public static void mostrarFicheros(File v,int mida) {
		File [] archivos = v.listFiles();
		for (int i = 0; i < archivos.length; i++) {
			if (archivos[i].isFile()) {
				if (archivos[i].length() > 500*1024) {
					System.out.println("Nombre Archivo " +archivos[i].getName()+", Espacio:"+ archivos[i].getTotalSpace());
				}
			}
			
		}
	} 

}
