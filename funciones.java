import java.util.Scanner;

public class funciones {
    static Scanner scanner = new Scanner(System.in);

////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static int num() {
        System.out.print("Ingrese un número que no contenga el dígito cero: ");
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

    public static void MCD() {

    
    }

    public static void InvertirCadena() {

    
    }
}
