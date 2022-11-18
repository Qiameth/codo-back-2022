package ar.com.codoacodo.personaidioma;

import java.util.ArrayList;
import java.util.List;

public class Persona {
	
	private String nombre;
	private String idioma;	
	List<String> listaIdiomas = new ArrayList<>();
	
	public Persona(String nombre, String idioma) {
		super();
		this.nombre = nombre;
		this.idioma = idioma;
	}

	public void decir(String palabra, String idioma) {		
		//equals ignore case compara strings ignorando mayús y minús		
		if(this.idioma.equalsIgnoreCase(idioma) || listaIdiomas.contains(idioma)  ) {
			System.out.println("La palabra que dice "+this.nombre+" en "+idioma+" es: "+palabra);
		}else {
			System.out.println(this.nombre+" no conoce ese idioma ("+idioma+").");
			
		}		
	}
	
	public void aprender(String idiomaNuevo) {
		this.listaIdiomas.add(idiomaNuevo);
	}
}
