package poop10;

/**
 * Clase principal POOP10
 * Este programa incluye ejemplos de manejo de excepciones, operaciones simples,
 * y una implementación básica de la clase Cuenta con excepciones personalizadas.
 * 
 * @author estudiante
 */
public class POOP10 {

    /**
     * Método principal que ejecuta el programa.
     * Contiene ejemplos de manejo de excepciones, operaciones aritméticas,
     * y pruebas de la clase Cuenta.
     * 
     * @param args los argumentos de la línea de comandos (no se usan aquí).
     */
    public static void main(String[] args) {
        // Ejemplo básico: imprimir un mensaje y realizar una operación simple
        System.out.println("hola mundo");
        
        // Operación simple: división de enteros con conversión a flotante
        int a = 5;
        float c = (float) a / 2;  // Conversión explícita para obtener un resultado flotante
        System.out.println(c);
        
        // Manejo de un arreglo con ejemplo de excepción
        int[] b = new int[5];  // Declaración de un arreglo de tamaño 5
        for (int i = 0; i < 5; i++) {
            b[i] = i * 10;  // Inicialización del arreglo
        }
        try {
            // Intencionalmente accediendo fuera de los límites del arreglo
            for (int i = 0; i <= 5; i++) { 
                System.out.println(b[i]);
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            // Captura y manejo de la excepción de índice fuera de límites
            System.out.println("Excepción de desbordamiento de memoria");
        }
        
        // Mostrar que el programa continúa después de manejar la excepción
        System.out.println("Hola he sobrevivido");
        
        // Ejemplo de excepción aritmética: división por cero
        try {
            float d = 4 / 0;  // Provoca una excepción de división por cero
            System.out.println(d);
        } catch (ArithmeticException ex) {
            // Captura y manejo de la excepción aritmética
            System.out.println("Excepción aritmética capturada");
        }

        // Prueba de la clase Cuenta y excepciones personalizadas
        Cuenta cuenta = new Cuenta(100f);  // Crear una cuenta con un saldo inicial
        System.out.println("Saldo actual: " + cuenta.consultarSaldo());
        cuenta.depositar(100);  // Realizar un depósito
        System.out.println("Saldo tras depósito: " + cuenta.consultarSaldo());

        try {
            // Intentar retirar más dinero del saldo disponible para provocar una excepción
            cuenta.retirar(300);
        } catch (SaldoInsuficienteException e) {
            // Captura y manejo de la excepción personalizada
            System.out.println("Excepción capturada: " + e.getMessage());
        }

        // Consultar el saldo tras el intento de retiro fallido
        System.out.println("Saldo tras intento de retiro: " + cuenta.consultarSaldo());
    }

    /**
     * Método que realiza una división entre dos números enteros.
     * 
     * @param f dividendo
     * @param f0 divisor
     * @return el resultado de la división
     * @throws ArithmeticException si el divisor es cero
     */
    private static float miMetodoDivision(int f, int f0) throws ArithmeticException {
        return f / f0;
    }

    /**
     * Método de suma (no implementado).
     * Este método lanza una excepción para indicar que no está soportado.
     * 
     * @param i primer número
     * @param i0 segundo número
     * @return el resultado de la suma (nunca se devuelve porque lanza una excepción)
     * @throws UnsupportedOperationException siempre se lanza esta excepción
     */
    private static int suma(int i, int i0) {
        throw new UnsupportedOperationException("Operación no soportada");
    }
}
