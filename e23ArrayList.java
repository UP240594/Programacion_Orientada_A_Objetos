import java.util.ArrayList;
import java.util.Collections;

class e23ArrayList{
    public static void main(String[] args) {
        ArrayList<String> nombre = new ArrayList<String>(5);
        nombre.add( 0 ,"Alba");
        nombre.add( 1,"Chairez");
        nombre.add( 2,"Lizbeth");
        nombre.add( 3,"Olivia");
        Collections.reverse(nombre);
        System.out.println(nombre);
        System.out.println(nombre.contains("Mitsiu"));
        System.out.println(nombre.get(0).toLowerCase() +" Posicion en array: " + nombre.indexOf("Olivia"));
        System.out.println(nombre.get(0).toUpperCase() +" Posicion en array: " + nombre.indexOf("Olivia"));
        nombre.replaceAll(e ->  e.toUpperCase());
        System.out.println(nombre);
    }

}



