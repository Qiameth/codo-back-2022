package ar.com.codoacodo.buscador;

public class Buscador {
	
	//atributos de la clase
	String  claveBusqueda;
	int cantidad;
	Articulo[] resultados;
	
	
	//métodos
	void buscar() {
		//...
		//Crear dos variables para artículos y ponerlos dentro del array resultados
		/*
		Articulo res1 = new Articulo();
		Articulo res2 = new Articulo();*/
		
		
		//creamos los resultados de artículo, pero pasándole parámetros
		
		Articulo res1 = new Articulo("http://imagen.com/img/a.jpg",claveBusqueda,"autor 1",2450);
		Articulo res2 = new Articulo("http://imagen.com/img/b.jpg",claveBusqueda,"autor 2",1800);
		
		
		
		/* Formas de crear un array
		 * 
		 * int[] array = new int[2];
		 * String[] nombres = new String[2];
		 * boolean[] flags = new boolean[2];
		 * Articulo[] otroRes = new Articulo[2];
		 * 
		 * */
		
		//create an array
		resultados = new Articulo[2];
		
		//cargar en cada posición un artículo
		resultados[0] = res1;
		resultados[1] = res2;
		
		//actualizo la cantidad de rtdos en base al tamaño del vector
		cantidad = resultados.length;
		
		
		
	}
	
	void setClaveBusqueda(String claveQueVieneDeAfuera) {
		claveBusqueda = claveQueVieneDeAfuera;
		
	}
	
	//this is a method, not a procedure, so it needs a return
	Articulo[]getResultado(){
		return resultados;
	}
	
	int getTotal() {
		return cantidad;
	}
	

}
