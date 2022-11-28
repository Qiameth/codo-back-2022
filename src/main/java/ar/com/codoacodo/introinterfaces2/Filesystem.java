package ar.com.codoacodo.introinterfaces2;

public class Filesystem implements IMensaje {

	@Override
	public void enviar(String mge) {
		// TODO Auto-generated method stub
		System.out.println("Enviando mensaje a archivo de sistema: "+mge);
	}

}
