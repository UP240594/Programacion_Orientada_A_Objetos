
class E14Constructor{

    public static void main (String[] args){
        String color1= "verde";
        String color2 = "rojo";
       Marker marc = new Marker( color1 , color2);
                                        //Aqui es casi lo mismo que el this
                                        //Pero aqui,  se llama primero la clase, 
                                        //y luego se le asignan valores
    }
}

class Marker{
    String nombrecolor;
    String color2;
    short  nivelTinta;
    Marker(String color , String color2){
        System.out.print("Creating a marker");
        this.nivelTinta = 100; 
        this.nombrecolor= color;  //Esto es igual al parametro
        this.color2= color2;  //Se referencia a la misma clase, representa una instancia de la clase. 
                                  //Se mete aqui por que es para poner el proceso de cracion
                                   // del codigo
    }
    
}
