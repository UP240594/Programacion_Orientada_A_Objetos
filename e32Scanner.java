import java.util.Scanner;
class e32Scanner{
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in); //Obtener datos del teclado
     System.out.println("Ingrese la cantidad de hermanos que tienes");
     int cantHermanos = scanner.nextInt(); //Recibimos la informacion que nos da la linea 4, es decir los datos del input
        // Lo guardamos en la variable cantHermanos
     //Regresa un int
        System.out.println("Tienes " + cantHermanos + " Hermano(s)");
    }
}