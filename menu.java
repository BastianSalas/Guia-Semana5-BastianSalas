import java.util.Scanner;

public class menu {
    static Scanner scanner = new Scanner(System.in);

    public static void menuPrincipal() {
        int goku;

        do {
            System.out.println("·········································································");
            System.out.println("                                  Menú                                   ");
            System.out.println("                                                                         ");
            System.out.println("Contar Dígitos..........................................................1");
            System.out.println("Suma de Dígitos.........................................................2");
            System.out.println("Máximo Común Divisor....................................................3");
            System.out.println("Invertir Cadena.........................................................4");
            System.out.println("Salir ..................................................................5");
            System.out.println("                                                                         ");
            System.out.println("·········································································");
            System.out.print("Elija opción: ");

            goku = scanner.nextInt();

            switch (goku) {
                case 1:
                    funciones.Contador();
                    break;

                case 2:
                    funciones.Suma();
                    break;

                case 3:
                    funciones.MCD();
                    break;
                
                case 4:
                    funciones.InvertirCadena();
                    break;

                case 5:
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida (1-5).");
            }
        } while (goku != 5);

        scanner.close();
    }
}
