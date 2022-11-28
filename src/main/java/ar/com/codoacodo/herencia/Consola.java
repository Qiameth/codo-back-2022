package ar.com.codoacodo.herencia;


/*Como solo necesitamos las particularidades de la clase Consola,
 * pero no necesitamos en ningún momento llegar a instanciarla,
 * hacemos que sea una clase abstracta. Ella permite que se hereden
 * atributos sin requerir (ni poder) instanciarla.
 * */
public abstract class Consola {

	
	//los atributos privados no se heredan porque son internos a la clase
	//los atributos nunca se ponen públicos para las clases
	//la forma de heredar atributos es con protected
	
	protected int bit;
	protected String name;
	
	public Consola(int bit, String name) {
		super();
		this.bit = bit;
		this.name = name;
	}

	//son atributos inmutables porque no tienen setter
	public int getBit() {
		return bit;
	}

	public String getName() {
		return name;
	}

	public void detalle() {
		System.out.println(this.toString());
	}
	
	public String toString() {
		return "Consola [bit=" + bit + ", name=" + name + "]";
	}

}
