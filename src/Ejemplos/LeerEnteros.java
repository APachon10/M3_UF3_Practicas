package Ejemplos;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Random;

public class LeerEnteros {
	public static void main(String[] args) {
		File f = new File("Enteros.bin");
	}
	public static void leerFichero(File x) {
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile(x, "r");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
