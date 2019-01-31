package Ejemplos;

import java.io.File;
import java.io.RandomAccessFile;

public class Inicializar {
	public static void main(String[] args) {
		RandomAccessFile raf = null;
		try {
			// r-->  solo para leer
			// rw --> Leer y Escribir en el Fichero 
			raf = new RandomAccessFile(new File("Hola.txt"), "r");
		} catch (Exception e) {
			System.out.println("Errorr!!! "+e);
		}
		
	}
}
