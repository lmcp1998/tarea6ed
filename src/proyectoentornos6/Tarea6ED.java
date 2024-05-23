package proyectoentornos6;

/*
 * Clase Tarea6ED que contiene métodos para aplicar descuentos a producto
 */
public class Tarea6ED {

    /**
     * Aplica un descuento al precio de un producto basado en la cantidad
     * Si el número de productos es mayor que 3, se descuenta 5 del precio
     * Luego, si el número de productos no es 0, se aplica un descuento.
     * En caso contrario, se aplica un descuento del 5.
     * Finalmente, se imprime el total a pagar y un mensaje de confirmacion
     *
     * @param precioProducto el precio del producto antes del descuento
     * @param numProductos el número de productos comprados
     */
    public void aplicarDescuento(double precioProducto, int numProductos) {
        double Total;

        if (numProductos > 3) {
            precioProducto -= 5;
        }
        if (numProductos != 0) {
            Total = precioProducto * 0.8;
            System.out.println("El total a pagar es:" + Total);
            System.out.println("Enviado");
        } else {
            Total = precioProducto * 0.95;
            System.out.println("El total a pagar es:" + Total);
            System.out.println("Enviado");
        }
    }
}
