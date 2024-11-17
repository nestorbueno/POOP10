package poop10;

/**
 * Clase Cuenta
 * Representa una cuenta bancaria básica con operaciones como depositar,
 * retirar y consultar el saldo. Incluye el manejo de excepciones personalizadas
 * para retiros con saldo insuficiente.
 * 
 * @author estudiante
 */
public class Cuenta {
    private double saldo; // Saldo actual de la cuenta

    /**
     * Constructor por defecto.
     * Crea una cuenta sin saldo inicial.
     */
    public Cuenta() {
    }

    /**
     * Constructor que inicializa la cuenta con un saldo específico.
     * 
     * @param saldo el saldo inicial de la cuenta
     */
    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * 
     * @return el saldo actual
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece un nuevo saldo para la cuenta.
     * 
     * @param saldo el nuevo saldo a establecer
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    /**
     * Deposita una cantidad de dinero en la cuenta.
     * 
     * @param monto la cantidad de dinero a depositar
     */
    public void depositar(double monto) {
        saldo += monto;
    }
    
    /**
     * Retira una cantidad de dinero de la cuenta.
     * Lanza una excepción si el monto a retirar supera el saldo disponible.
     * 
     * @param monto la cantidad de dinero a retirar
     * @throws SaldoInsuficienteException si el saldo es insuficiente
     */
    public void retirar(double monto) throws SaldoInsuficienteException {
        if (monto > saldo) {
            throw new SaldoInsuficienteException("No tienes suficiente dinero para realizar este retiro.");
        } else {
            saldo -= monto;
        }
    }

    /**
     * Consulta el saldo actual de la cuenta.
     * 
     * @return el saldo actual
     */
    public double consultarSaldo() {
        return getSaldo();
    }

    /**
     * Representación en cadena de texto de la cuenta.
     * 
     * @return una descripción de la cuenta con el saldo actual
     */
    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + '}';
    }
}
