package ar.com.codoacodo.herencia;

import java.util.Iterator;

public class MainConsola {

	public static void main(String[] args) {	
		
		//obtener lista de consolas
		
		/*evitamos crear una instancia del objeto Vendedor cuando agregamos el modificador Static,
		 * y ahora tenemos acceso a su método de clase*/
		//Vendedor v = new Vendedor();
		//v.listado();
		
		//invocamos entonces un método estático
		Consola[] listado = Vendedor.listado();
		
		
		for (Consola c : listado) {
			//System.out.println(c.getClass().getName());
			//quiero mostrar los bit y nombre consola
			
			//no importa la instancia particular porque es un método heredado			
			c.detalle();
		}
		
		

	}

}
