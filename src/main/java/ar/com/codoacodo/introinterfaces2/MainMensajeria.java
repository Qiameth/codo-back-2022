package ar.com.codoacodo.introinterfaces2;

public class MainMensajeria {

	public static void main(String[] args) {
		String destino = "e";
		String mjeAEnviar = "Aprendiendo Interfaces";
		
		MensajeBuilder build = new MensajeBuilder();
		IMensaje ss = build.buildMensaje(destino);
		
		
		//build.buildMensaje(destino);
		
		
		if(ss!=null) {
			ss.enviar(mjeAEnviar);
		}else {
			System.out.println("No existe implementación para "+destino);
		}
		
		
		/*
		Sms sms = new Sms();
		Mail mail = new Mail();
		Basedatos db = new Basedatos();
		Filesystem fs = new Filesystem();
		 */
		/*
		switch (destino) {
		case "A":
			//sms.enviar(mjeAEnviar);
			ss = new Sms();
			break;
		case "B":
			//mail.enviar(mjeAEnviar);
			ss = new Mail();
			break;
		case "C":
			//db.enviar(mjeAEnviar);
			ss = new Basedatos();
			break;	
		case "D":
			//fs.enviar(mjeAEnviar);
			ss = new Filesystem();
			break;			
		default:
			//System.out.println("No existe implementación para "+destino);
			ss = null;
			break;
		}
		if (ss!=null) {
			ss.enviar(mjeAEnviar);
		}*/

	}

}
