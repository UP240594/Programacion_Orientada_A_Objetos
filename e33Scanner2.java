import java.util.InputMismatchException;
import java.util.Scanner;
class e33Scanner{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //Obtener datos del teclado
        int cantHermanos = 0;
        System.out.println("Ingrese la cantidad de hermanos que tienes");
        
        try{ //Bloque en el que el codigo puede o no lanzar una excepcion
            // Corta el canal de comunicacion y se va directamente a la exepcion scanner.close();
            cantHermanos = scanner.nextInt();
            if(cantHermanos < 0){
                System.out.println("Numeros negativos no son validos");
                cantHermanos=0;
            }
            System.out.println("Ok");
        }
        catch(IllegalStateException ex){
            System.out.println("Excepcion distinta");
        }
        catch(InputMismatchException ex){ //Como nos recuperamos de esa exepcion o que hacemos en caso de que falle
            System.out.println("Numero no valido");
            System.out.println(ex);
        }



        System.out.println("Tienes " + cantHermanos + " Hermano(s)");
    }
}