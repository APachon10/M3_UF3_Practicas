package Ejemplos;

import java.io.File;
import java.io.RandomAccessFile;

public class EscribirEnteros {
	public static void main(String[] args) {
		File f = new File("Enteros.bin");
		EscribirEnteros c = new EscribirEnteros();
		c.escribirFichero(f);
	}
	public File escribirFichero(File x) {
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile(x, "rw");
//			raf.writeInt(20);
//			raf.writeInt(21);
//			raf.writeInt(22);
//			raf.writeInt(23);
			raf.writeInt(1);
			
			System.out.println(raf.readInt());
			System.out.println(raf.readInt());
			System.out.println(raf.readInt());
			
			//Mover Puntero
			raf.skipBytes(4);
			raf.close();
		} catch (Exception e) {
			System.out.println("Error! "+e);
		}
		return x;
	}
}
