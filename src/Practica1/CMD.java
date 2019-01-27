package Practica1;

import java.io.File;
import java.util.Scanner;

public class CMD {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);		
		String comanda = "";
		String confirmar = "";

		String ruta = System.getProperty("user.dir");;
		boolean salir = false,confi=false;

		File f = new File(ruta);
		File [] Raiz=f.listFiles();
		System.out.print(System.getProperty("user.dir") + " $ ");
		do {
			comanda = sc.nextLine();
			String com[] = comanda.split(" ");
			System.out.println("------------------------------");
			for(int i =0;i<Raiz.length; i++) {
				if(comanda.contains(Raiz[i].getName())){
					ruta = f.getPath() + File.separator + com[1];
					f = new File (ruta);
				}
				if (comanda.contains("~")){
					ruta = System.getProperty("user.dir");
					f= new File (ruta);
				}
			}
			if(comanda.equals("cd .." )){
				ruta = f.getParent();
				f = new File(ruta);
			}
			File carpeta []= f.listFiles();
			Raiz = carpeta;
			if(comanda.equals("dir")){
				for(int x = 0;x<carpeta.length;x++){
					System.out.println(carpeta[x].getName());
				}
			}
			System.out.print(f.getAbsolutePath() + " $ ");
			
		}while(!comanda.equals("fi"));
		
		System.out.println();
		if(comanda.equals("fi")) {
			System.out.println("Quieres Cerrar la Terminal ? ");
			confirmar = sc.next();
			if(confirmar.equalsIgnoreCase("Si")) {
				System.out.println("Terminal Cerrrado ");
				System.out.println("Cerrando Programa ");
			}
		}else{
			
		}
	}
	}

