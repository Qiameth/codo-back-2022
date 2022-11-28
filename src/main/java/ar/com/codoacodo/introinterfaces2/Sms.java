package ar.com.codoacodo.introinterfaces2;

public class Sms implements IMensaje {

	@Override
	public void enviar(String mge) {
		System.out.println("Enviando un SMS con: "+mge);

	}

}

