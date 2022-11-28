package ar.com.codoacodo.herencia;

public class PlayStation extends Consola{
	
	//para agregar un atributo único, como la versión de playstation, la agregamos como privada
	
	private int version;
	
	public PlayStation(int version) {
		//para que nazca un hijo, primero debe haber un padre
		//super(bit, name);
		super(1024, "PlayStation");
		this.version = version;
	}

	public int getVersion() {
		return version;
	}	
	
	
	
}
