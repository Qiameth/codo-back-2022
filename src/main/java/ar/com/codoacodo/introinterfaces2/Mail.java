package ar.com.codoacodo.introinterfaces2;

public class Mail implements IMensaje {

	@Override
	public void enviar(String mge) {
		// TODO Auto-generated method stub
		System.out.println("Enviando mail que dice: "+mge);

	}

}
