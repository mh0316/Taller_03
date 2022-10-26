import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Pedido pedido;

    public void mostrarMenu(){
        System.out.println("""
                ------MENU------
                1. Mostrar pedido.
                2. Modificar pedido.
                3. Salir.""");
        ingresar();
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