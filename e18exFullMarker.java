class e18exFullMarker{
    public static void main(String[] args){
        Marker colorBlanco = new Marker("Blanco");
        colorBlanco.escribir("Blanco");
        Marker colorRojo = new Marker("Rojo");
        colorRojo.escribir("Hola me llamo Olivia");
    }
}
class Marker{
    short nivelTinta=100;
    String nombreColor;
    String colorTinta;
        //Constructor es la logica de creacion de un Marker
        Marker(String paramColor){
            this.colorTinta = paramColor;

                if(this.colorTinta.equals("Blanco")){ 
                    this.nombreColor = "\u001B[31m";
                }else if(this.colorTinta.equals("Verde")){ 
                    this.nombreColor = "\u001B[32m";
                }else if (this.colorTinta.equals("Azul")) { 
                    this.nombreColor = "\u001B[34m";  
                }else if (this.colorTinta.equals("Rojo")) { 
                    this.nombreColor = "\u001B[0m"; 
                }else {
                    System.out.println("Elija un color valido"); 
                }
            System.out.println("Escribiendo: " + this.nombreColor); 
            System.out.println(this.nivelTinta);
        }
        //Creacion de metodo de escribir
        void escribir(String texto){
            System.out.println("Escribiendo: " + this.nombreColor); 
            for(char letra : texto.toCharArray()){
                if (this.nivelTinta > 0){
                    System.out.println(letra);
                    this.nivelTinta--;
                }
            }
            System.out.println("\u001B[00");
        }
}
