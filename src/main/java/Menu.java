import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<Mesero> mesero;

    public void mostrarMenu(){
        System.out.println("""
                ------MENU------
                1. Mostrar pedido.
                2. Modificar pedido.
                3. Salir.""");
        int opcion = ingresar();
    }

    private void opcionesMenu(int opcion){
        switch (opcion){
            case 1:
                mostrarPedido();
            case 2:
                modificarPedido();
            case 3:
                terminarPrograma();
        }
    }

    private void mostrarPedido() {
        char[][] pedidos = new char[1][1];
        for (char[] pedido : pedidos) {
            System.out.println(Arrays.toString(pedido));
        }
    }

    public void modificarPedido() {
        int numeroPedidos = 0;
        for(Mesero mesero : this.mesero) {
            if(mesero.getMesero() != numeroPedidos) {
                this.mesero.add(mesero);
            }
        }
    }

    private void terminarPrograma(){
        System.out.println("Programa terminado. Gracias.");
    }

    public static int ingresar() {
        Scanner teclado = new Scanner(System.in);
        int entrada;
        do {
            try {
                entrada = teclado.nextInt();
                break;
            } catch (Exception e) {
                teclado.nextLine();
            }
        } while (true);
        return entrada;
    }
}