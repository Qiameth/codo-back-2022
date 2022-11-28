package ar.com.codoacodo.personaidioma;

public class MainPersonaIdioma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona per1 = new Persona("Pablo","Inglés");
		
		per1.decir("Hallo", "Alemán");

		per1.aprender("Italiano");
		
		per1.decir("Hallo", "Alemán");
		
		per1.aprender("Alemán");
		
		//f3 + método y lleva a donde está creado
		per1.decir("Hallo", "Alemán");//f5 entra dentro del método
		

	}//f8 termina la ejecución

}
