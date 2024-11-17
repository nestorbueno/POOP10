package poop10;

/**
 * Clase SaldoInsuficienteException
 * Excepción personalizada que se lanza cuando un intento de retiro
 * de una cuenta excede el saldo disponible.
 * 
 * Extiende la clase {@link Exception} para proporcionar un mensaje
 * específico cuando ocurre esta situación.
 * 
 * @author estudiante
 */
public class SaldoInsuficienteException extends Exception {

    /**
     * Constructor por defecto.
     * Crea una excepción sin un mensaje específico.
     */
    public SaldoInsuficienteException() {
        super();
    }

    /**
     * Constructor con mensaje personalizado.
     * 
     * @param msg el mensaje que describe la causa de la excepción
     */
    public SaldoInsuficienteException(String msg) {
        super(msg);
    }
}
