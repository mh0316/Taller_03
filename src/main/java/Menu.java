import java.util.Scanner;

public class Menu {
    public void mostrarMenu(){
        System.out.println("""
                ------MENU------
                1. Mostrar pedido.
                2. Modificar pedido.
                3. Salir.""");
        Pedido.opcionesMenu(ingresar());
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