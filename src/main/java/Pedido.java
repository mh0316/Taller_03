import java.util.Arrays;
import java.util.List;

public class Pedido {
    private static List<Mesero> mesero;

    private static char[][] crearPedido() {
        int cantidadPedidos = cantidadAleatoria();
        return new char[2][cantidadPedidos];
    }

    private static int cantidadAleatoria() {
        return (int) (Math.random() + 1);
    }

    public static int opcionesMenu(int opcion){
        switch (opcion) {
            case 1 -> mostrarPedido();
            case 2 -> modificarPedido();
            case 3 -> terminarPrograma();
            default -> {
                System.out.println("Por favor ingrese una opción válida:");
                opcionesMenu(Menu.ingresar());
            }
        }
        return opcion;
    }

    public static void mostrarPedido() {
        char[][] pedidos = new char[1][1];
        for (char[] pedido : pedidos) {
            System.out.println(Arrays.toString(pedido));
        }
    }

    public static void modificarPedido() {
        int numeroPedidos = 0;
        for (Mesero mesero1 : mesero) {
            if (mesero1.getMesero() != numeroPedidos) {
                mesero.add(mesero1);
            }
        }
    }

    private static void terminarPrograma(){
        System.out.println("Programa terminado. Gracias.");
    }
}