import java.util.ArrayList;

class e22AlumnoAsiento{
    public static void main(String[] args){
        int[] numerosPares = new int[4];
        numerosPares[0] = 2;
        numerosPares[1] = 4;
        numerosPares[2] = 6;
        numerosPares[3] = 8;

        ArrayList<Integer> numerosParesMejorados = new ArrayList<Integer>(3); // Tambien, no es necesario poner el numero 3
        // Voy a crear un estuche de algo
        //Sirven para hacer crecer su tamaño
        //es una estructura para controlar un conjunto de INTERGERS
        numerosParesMejorados.add(2); //Aqui estamos agregando el numero 3 al array
        numerosParesMejorados.add(4);  //Pueden hacer crecer su conjunto.
        numerosParesMejorados.add(6);
        numerosParesMejorados.add(8);
        numerosParesMejorados.add(10);
        numerosParesMejorados.add(12);

        numerosParesMejorados.get(5);  //obtiene el valor en el numero 5 de la lista y lo muestra, contando del 0 al 5

        numerosParesMejorados.remove(5); //Borra el valor en el numero 5 de la lista

        for(int elemento : numerosParesMejorados){
            System.out.println(elemento);
        }
        System.out.println("Tamaño: " + numerosParesMejorados.size());
    }
}

