package Ejemplos;

import java.io.File;
import java.io.RandomAccessFile;

public class Escribir {
	public static void main(String[] args) {
		File f = new File("Enteros.bin");
		File f2 = new File("Enteros.bin");
		Escribir c = new Escribir();
		c.escribirFichero(f);
		c.escribirFichero(f2);
	}
	public File escribirFichero(File x) {
		try {
			RandomAccessFile raf = new RandomAccessFile(x, "rw");
		} catch (Exception e) {
			System.out.println("Error! "+e);
		}
		return x;
	}
}
