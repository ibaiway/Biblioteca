import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Pelicula extends Articulo {

	final static String RUTADATOS= "C:/Users/ik012982i9/Desktop/JavaFicheros/BibliotecaDatos.txt";
	
	private int duracion;
	private String director;

	public void getInfo(int codigo) {

		ArrayList<Pelicula> arraia = new ArrayList<Pelicula>();

		File f = new File("C:/Users/ik012982i9/Desktop/JavaFicheros/BibliotecaDatos.txt");

		try {
			Scanner scan = new Scanner(f);

			// por cada linea del texto añade una persona a la lista
			while (scan.hasNext()) {
				String linea = scan.nextLine();
				String[] partes = linea.split(",");

				Pelicula p = new Pelicula();
				p.setCodigo(Integer.parseInt(partes[0]));
				p.setNombre(partes[1]);
				p.setDuracion(Integer.parseInt(partes[2]));
				p.setIdioma(partes[3]);
				p.setGenero(partes[4]);
				p.setDirector(partes[5]);
				SimpleDateFormat formatoES = new SimpleDateFormat("yyyy/MM/dd");
				try {
					p.setFechaPublicacion(formatoES.parse(partes[6]));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				arraia.add(p);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Iterator<Pelicula> i = arraia.iterator();
		while (i.hasNext()) {
			Pelicula p = i.next();
			p.mostrarInfo();
		}
	}

	public static ArrayList<Pelicula> crearLista() {

		ArrayList<Pelicula> pelikulak = new ArrayList<Pelicula>();

		File f = new File(RUTADATOS);

		try {
			Scanner scan = new Scanner(f);

			// por cada linea del texto añade una persona a la lista
			while (scan.hasNext()) {
				String linea = scan.nextLine();
				String[] partes = linea.split(",");

				Pelicula p = new Pelicula();
				p.setCodigo(Integer.parseInt(partes[0]));
				p.setNombre(partes[1]);
				p.setDuracion(Integer.parseInt(partes[2]));
				p.setIdioma(partes[3]);
				p.setGenero(partes[4]);
				p.setDirector(partes[5]);
				SimpleDateFormat formatoES = new SimpleDateFormat("yyyy/MM/dd");

				p.setFechaPublicacion(formatoES.parse(partes[6]));

				pelikulak.add(p);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return pelikulak;
	}

	public void listar(ArrayList<Pelicula> arraia){
		Iterator<Pelicula> i = arraia.iterator();
		while (i.hasNext()) {
			Pelicula p = i.next();
			p.mostrarInfo();
		}
	}
	
	public void mostrarInfo() {

		System.out.println(this.getCodigo() + " - " + this.getNombre() + " - " + this.getGenero() + " - " + this.getDuracion() + " - "
				+ this.getIdioma());
		
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	

}
