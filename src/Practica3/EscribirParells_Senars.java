package Practica3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class EscribirParells_Senars {
	public static void main(String[] args) {
		EscribirParells_Senars programa  = new EscribirParells_Senars();
		programa.inici();
	}
	public void inici() {
		int num=0,cont=0;
		File f = new File ("senars.txt");
		try {
			PrintStream scriptor = new PrintStream(f);
			for(int i =0;i<=100;i++) {
				if(i%2 != 0) {
					scriptor.print(i+"-");
				}
			}
			f= new File ("parells.txt");
			scriptor = new PrintStream(f);

			for(int i =0;i<=100;i++) {
				if(i%2 == 0) {
					scriptor.print(i+"-");
				}
			}


		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
	}
}
