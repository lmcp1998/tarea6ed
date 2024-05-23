package proyectoentornos6;

/*
 * Clase principal del proyecto que contiene el método main.
 */
public class ProyectoEntornos6 {

    /**
     * Método principal que ejecuta el programa.
     *
     * @param args los argumentos de la línea de comandos
     */
    public static Tarea6ED main(String[] args) {
        Tarea6ED miCarrito = new Tarea6ED();

        miCarrito.aplicarDescuento(100, 5);

        return miCarrito;
    }
}