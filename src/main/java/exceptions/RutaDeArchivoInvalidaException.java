package exceptions;

@SuppressWarnings("serial")
public class RutaDeArchivoInvalidaException extends RuntimeException {

	public RutaDeArchivoInvalidaException(String mensaje) {
		super(mensaje);
	}
}
