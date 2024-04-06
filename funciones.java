import java.util.Scanner;

public class funciones {
    static Scanner scanner = new Scanner(System.in);

////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static int num() {
        System.out.print("Ingrese un número entero: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ingrese un número entero válido.");
            scanner.next(); // Limpia el buffer del scanner
        }
        int numero = scanner.nextInt();
        return numero;
    }
 
////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static int ContadorDeDigitos(int num) {
        int dig;
        if (num < 10) { 
            return 1;
        } else{ 
            num = num/10;
            dig = 1 + ContadorDeDigitos(num);
        }
        return dig;
    }
    public static void Contador() {
        int numero = num();
        int cantidadDigitos = ContadorDeDigitos(numero);
        System.out.println("El número de dígitos en el número ingresado es: " + cantidadDigitos);
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static int SumaDeDigitos(int num) {
        if (num == 0) { 
            return 0;
        } else{ 
            int UltimoDigito = num%10;
            int SumaRestante = SumaDeDigitos(num / 10);
            return UltimoDigito + SumaRestante;
        }
    }

    public static void Suma() {
        int numero = num();
        int sumaDigitos = SumaDeDigitos(numero);
        System.out.println("El número de dígitos en el número ingresado es: " + sumaDigitos);
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static int num1() {
        System.out.print("Ingrese un número entero: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ingrese un número entero válido.");
            scanner.next(); // Limpia el buffer del scanner
        }
        int numero1 = scanner.nextInt();
        return numero1;
    }

    public static int num2() {
        System.out.print("Ingrese un número entero: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ingrese un número entero válido.");
            scanner.next(); // Limpia el buffer del scanner
        }
        int numero2 = scanner.nextInt();
        return numero2;
    }

    public static int MinimoComunDivisor(int numero1, int numero2) {

        int a = Math.max(numero1, numero2);
        int b = Math.min(numero1, numero2);

        int resultado = 0;
        do {

            resultado = b;
            b = a % b;
            a = resultado;

        } while (b != 0);

        return resultado;

    }

    public static void MCD() {

        int numero1 = num1();
        int numero2 = num1();

        int minimo_comun_divisor = MinimoComunDivisor(numero1, numero2);
        System.out.println("El máximo común divisor entre el número " + numero1 + " y el número " + numero2 + " es: " + minimo_comun_divisor);
    
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////    

    public static String InvertirCadena(String cadena) {
        
        if (cadena.isEmpty()) {
            return cadena;
        }
        return InvertirCadena(cadena.substring(1)) + cadena.charAt(0);
    
    }

    public static void Invertir() {

        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.next();
        String cadenaInvertida = InvertirCadena(cadena);
        System.out.println("Cadena invertida: " + cadenaInvertida);

    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////  
}