package PracticaBinarios;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class ComptaParaulesFitxer {
	public static void main(String[] args) {
		File f = new File("Fichero.txt");
		ComptaParaulesFitxer cp  = new ComptaParaulesFitxer();
		cp.leerFichero(f);

	}
	public void leerFichero(File v ) {
		Scanner scan2 =null;
		int cont = 0;
		try {
			scan2 = new Scanner(v);
			String texto = "";
			boolean salir = false;
			while (!salir) {
				cont =0;
				texto =  scan2.nextLine();
				String [] linea= texto.split(" ");
				for (int i = 0; i < linea.length; i++) {
					if (linea[i].equalsIgnoreCase("fi")) {
						salir=true;
					}else {
						cont ++;
					}
				}
				System.out.println("Contador : "+cont);
			}

		}catch (Exception e) {
			System.out.println("Error!:" +e);
			e.printStackTrace();
		}
	}
}
