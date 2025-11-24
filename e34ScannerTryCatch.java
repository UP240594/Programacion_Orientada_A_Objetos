import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.ArrayList;
class e34ScannerTryCatch{
    public static void main(String[] args){
        int valorInicial=0;
        try{
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese  un valor para su arrayList");
            valorInicial= input.nextInt();

            //if(valorInicial <= 0){
           //     System.out.println("Valor invalido para ArrayList");
         //   }
            int[] arreglo = new int[valorInicial];
            System.out.println("todoBien");

            //throw sirve para lanzar excepciones, a  fuerzas
            //throw new  NoSuchElementException("lanzar")
        }
        // Tienen que tener orden del mas especifico al mas general
        catch(NegativeArraySizeException e){
            System.out.println("Valor invalido para ArrayList");
        }
        catch(InputMismatchException e){
            System.out.println("Numero no valido");
            System.out.println(e);

        }
        catch(IllegalStateException e){
            System.out.println(e);
        }
        catch(NoSuchElementException e){
            System.out.println(e);
        }





    }
}