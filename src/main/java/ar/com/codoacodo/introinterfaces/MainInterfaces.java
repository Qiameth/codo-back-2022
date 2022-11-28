package ar.com.codoacodo.introinterfaces;

public class MainInterfaces {

	public static void main(String[] args) {

		Perro patan = new Perro("Patan");
		
		Gato aryss = new Gato("Aryss");
		
		IHablar[] animales = new IHablar[2];
		animales[0] = patan;
		animales[1] = aryss;
		
		
		
		
	}

}
