package PracticaBinarios;

import java.io.File;
import java.util.Scanner;

public class HistogramaNotas {
	public static void main(String[] args) {
		HistogramaNotas hg = new HistogramaNotas();
		File f = new File("Notes.txt");
	}
	public int indexHistograma(double valor) {
		if ((valor >= 9)&&(valor <= 10)) {
			return 3;
		} else if ((valor >= 6.5)&&(valor < 9)) {
			return 2;
		} else if ((valor >= 5)&&(valor < 6.5)) {
			return 1;
		} else if ((valor >= 0)&&(valor < 5)) {
			return 0;
		}
		return -1;
	}
}
