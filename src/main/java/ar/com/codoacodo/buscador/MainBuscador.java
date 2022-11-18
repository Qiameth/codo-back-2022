package ar.com.codoacodo.buscador;

public class MainBuscador {

	public static void main(String[] args) {
		
		
		//quiero crear un objeto de tipo Buscador
		//crear una instancia de buscador
		
		//creo mi primer objeto		
		Buscador miBuscador = new Buscador();
		
		//Setteo la clave que quiero buscar
		miBuscador.setClaveBusqueda("Iron Man");
		
		//ejecutar la búsqueda
		miBuscador.buscar();
		
		/* res no es un atributo, sino una variable que
		 * guarda el resultado de invocar al método
		 * buscar del objeto miBuscador, el cual sabemos, es
		 * una instancia de la clase Buscador
		 **/
		Articulo[]res=miBuscador.getResultado();		

		//recorremos el array, unArticulo es el iterador interno del bucle
		for(Articulo unArticulo : res) {			
			unArticulo.detalle();			
		}
	}

}
