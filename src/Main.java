import com.problema1.utils.GenericKiwi;

import java.util.Scanner;

public class Main {

    public static int menu() {
        Scanner keyboardInput = new Scanner(System.in);
        GenericKiwi colaNumeros = new GenericKiwi();
        Boolean menuState = true;
        Integer resultadoNumeros = 0;

        while (menuState) {
            System.out.print("Bienvenido - Dame un número entero (Q para salir): ");
            String valorUsuario = keyboardInput.nextLine();

            if (valorUsuario.equalsIgnoreCase("q")) {
                while (colaNumeros.getNumTotalValores() != 0) {
                    resultadoNumeros += colaNumeros.dequeue();
                }
                menuState = false;
            } else {
                colaNumeros.enqueue(Integer.parseInt(valorUsuario));
            }
        }
        return resultadoNumeros;
    }
    public static void main(String[] args) {
        System.out.println(" ");
        int resultado = menu();
        System.out.println("El resultado total es: " + resultado);
    }
}
