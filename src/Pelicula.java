import java.util.ArrayList;
import java.util.Iterator;

import ciudad.Persona;

public class Pelicula extends Articulo {

	private String[] actores;
	private int duracion;
	private String director;
	
	
	public void getInfo(String codigo, ArrayList<Articulo> arraia) {

		Iterator<Articulo> i = arraia.iterator();
		while (i.hasNext()) {
			Articulo p = i.next();
			p.mostrarPersona();
		
	}


	public String[] getActores() {
		return actores;
	}


	public void setActores(String[] actores) {
		this.actores = actores;
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
