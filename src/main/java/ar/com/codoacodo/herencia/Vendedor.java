package ar.com.codoacodo.herencia;


public class Vendedor {
	
	/* No es necesario instanciar un objeto de la clase vendedor
	 * para usar el método listado() cuando lo único que necesito
	 * es el listado, por ello le voy a agregar el modificador static.
	 * 
	 * Agregando static lo que hacemos es crear un método de clase, lo 
	 * cual significa que no le pertenece a ningún objeto de la clase Vendedor,
	 * sino que es propia de la clase.
	 * 
	 * */
	
	public static Consola[] listado() {
		//Consola c = new Consola();
		PlayStation p1 = new PlayStation(1);
		PlayStation p2 = new PlayStation(2);
		PlayStation p3 = new PlayStation(3);
		var nw = new NintendoSwitch();
		var sg = new SegaGenesis();
		var xbox = new XboxXS();
		
		//si desconocemos el tamaño, es []{}, si lo conocemos es [n]
		//Consola[] listado = new Consola[]{};
		Consola[] listado = new Consola[] {p1,p2,p3,nw,sg,xbox};
	
		//consola está agregado a modo ilustrativo, pero no hace falta
		//listado[0] = c;
		/*
		listado[0] = xbox;
		listado[1] = p1;
		listado[2] = nw;
		listado[3] = sg;*/
		
		return listado;
	}
	

}
