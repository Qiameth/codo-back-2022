package ar.com.codoacodo.introinterfaces2;

public class MensajeBuilder {

	public IMensaje buildMensaje(String destino) {

		IMensaje ss = null;
		/*para que no me marque error "uso" la variable*/
		IMensaje sas = null;
		ss = sas;
		sas = ss;

		switch (destino) {
		case "A":
			return ss = new Sms();
		case "B":
			return ss = new Mail();
		case "C":
			return ss = new Basedatos();
		case "D":
			return ss = new Filesystem();
		default:
			return ss = null;
		}
	}
}
