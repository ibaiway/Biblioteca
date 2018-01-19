import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		
		ArrayList<Pelicula> arraia = Pelicula.crearLista();
		
		listar(arraia);
		
	}
	
	public static void listar(ArrayList<Pelicula> arraia){
		Iterator<Pelicula> i = arraia.iterator();
		while (i.hasNext()) {
			Pelicula p = i.next();
			p.mostrarInfo();
		}
	}

}
