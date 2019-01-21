package EjerciciosTeoricos;

import java.io.File;

public class Crear_Borrar_Carpeta {
	public static void main(String[] args) {
		Crear_Borrar_Carpeta c = new Crear_Borrar_Carpeta();
		File f = new File("Temp");

		if (!f.exists()) {
			c.crearCarpeta(f);
			System.out.println("Se ha creado la carpeta : "+f.getAbsolutePath());
		}else {
			c.crearCarpeta(f);
		}
	}
	public void crearCarpeta(File v ) {
		v.mkdir();
	}
	public void borrarCarpeta(File v) {
		
	}
}
