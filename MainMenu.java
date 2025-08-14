import com.packages.StringJava.*;
import java.util.Scanner;


public class MainMenu 
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        String option;
        do {
            System.out.println("-------------------------");
            System.out.println("\\033[0;32m  Menú de opciones");
            System.out.println("-------------------------");
            System.out.println("0. Salir");
            System.out.println("1. Cadenas de caracteres");
            System.out.println("2. Arreglos");
            System.out.println("3. Listas ligadas");
            System.out.println("4. Pilas y colas");
            System.out.println("5. Recursividad");
            System.out.println("6. Árboles y grafos");
            System.out.print("Ingrese su opción: ");
            option = scn.nextLine();

            switch (option) {
                case "0":
                    System.out.println("Programa finalizado");
                    break;
                case "1":
                    // llamar a algún método para el submenú cadenas
                    menuStrings();
                    break;
                default:
                    System.out.println("Opción no válida");
                    
            }

        } while (!option.equals("0"));
    }
    
    public static void menuStrings()
    {
        Scanner scn = new Scanner(System.in);
        String option, chain;
        Strings str = new Strings();

        do {
            System.out.println("-------------------------");
            System.out.println("      Menú Cadenas");
            System.out.println("-------------------------");
            System.out.println("0. Salir");
            System.out.println("1. Ejemplos básicos cadenas de caracteres");
            System.out.println("2. Ingresar una cadena de caracteres");
            System.out.println("3. Palíndromo");
            System.out.print("Ingrese su opción: ");
            option = scn.nextLine();

            switch (option) {
                case "0":
                    break;
                case "1":
                    // llamar al método 
                    str.basicOperations();
                    break;
                case "2":
                    System.out.print("Ingrese un texto: ");
                    chain = scn.nextLine();
                    str.showString(chain);
                    break;
                case "3":
                    // Palíndromo
                    break;
                default:
                    System.out.println("Opción no válida");
                    
            }

        } while (!option.equals("0"));
        
    }
}
