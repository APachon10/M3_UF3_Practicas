package Bytes;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.Scanner;

public class copiarFicheroBinario {
	public static void main(String[] args) {
		copiarFicheroBinario cp = new copiarFicheroBinario();
		String origen,destino;
		
		System.out.print("Origen:");
		origen =recogerCadenas();
		File o = new File(origen);
		if (o.exists()) {
			if (o.isFile()) {
				System.out.print("Fichero Destino:");
				destino = recogerCadenas();
				File des = new File(destino);
				if (!des.exists()) {
					cp.copiarfichero(o,des);
				}else {
					System.out.println("El fichero ya existe ");
				}
			}
		}else {
			System.out.println("El Fichero Origen no existe ");
		}
	}
	public File copiarfichero(File or,File des) {
		try {
			RandomAccessFile raf = new RandomAccessFile(or, "r");
			RandomAccessFile raf2 = new RandomAccessFile(des, "rw");
			
			//Leemos los datos del ficheros y los  escribimos en el otro fichero 
			int mida = (int) or.length();
			for (int i = 0; i < mida; i++) {
				byte datos = raf.readByte();
				raf2.writeByte(datos);
			}
			raf.close();
			raf2.close();
		} catch (Exception e) {
			System.out.println("Error: "+e);
			e.printStackTrace();
		}
		return des;
	}
	public static String recogerCadenas() {
		Scanner scan = new Scanner(System.in);
		String palabra =scan.nextLine();
		return palabra;
	}
}
