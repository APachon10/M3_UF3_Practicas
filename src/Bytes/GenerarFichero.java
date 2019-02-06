package Bytes;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class GenerarFichero {
	public static void main(String[] args) {
		GenerarFichero gc = new GenerarFichero();

		System.out.print("Que Nombre quieres ponerle al fichero?: ");
		String nombre_fichero  =recogerCadenas();

		File f = new File(nombre_fichero);
		gc.CrearFichero(f);
		gc.leerFichero(f);
	}
	public File CrearFichero(File v) {
		try {
			RandomAccessFile raf = new RandomAccessFile(v, "rw");
			System.out.println("Escribe el contenido del fichero:");
			String frase = recogerCadenas();
			String lineas [] = frase.split(" ");

			for (int i = 0; i < lineas.length; i++) {
				byte frase2 [] = lineas[i].getBytes();

				raf.writeInt(frase2.length);
				raf.writeBytes(" ");
				raf.writeBytes(lineas[i]);
			}
			System.out.println("Fichero Escrito ");
			raf.close();
		} catch (Exception e) {
			System.out.println("Error! : "+e);
			e.printStackTrace();
		}
		return v;
	}
	public void leerFichero(File v) {
		try {
			RandomAccessFile raf = new RandomAccessFile(v, "r");
			int puntero  = (int) raf.getFilePointer();
			while (puntero < raf.length()) {
				//Leemos los bytes de cada Numero 
				int numBytes = raf.readInt();
				if (numBytes > 3) {
					//Si ocupa mas de 3 bytes printara la frase por pantalla 
					byte[] bytes = new byte[numBytes];
					for (int i = 0; i < numBytes; i++) {
						bytes[i] = raf.readByte();
					}
					String paraula = new String(bytes);
					System.out.println(paraula);

				} else {
					//Si ocupa mas de 3 bytes saltamos al siguiente byte 
					raf.skipBytes(numBytes);
				}
			}

			raf.close();
		} catch (Exception e) {
			System.out.println("Error tractant fitxer: " + e);
		}
	}
	public static String recogerCadenas() {
		Scanner scan = new Scanner(System.in);
		String palabra =scan.nextLine();
		return palabra;
	}
}
