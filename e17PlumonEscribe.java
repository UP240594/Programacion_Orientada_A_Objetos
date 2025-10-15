
class e17PlumonEscribe{
    public static void main(String[] args) {
        Marker plumon = new Marker();
        plumon.escribir("Hola" , 10);
    }
}
class Marker{
    short nivelTinta=10;
    String nombrecolor;
    Marker(){
    }
    void escribir (String texto , int tiempo){
        System.out.println(texto);
        
        for(char letra : texto.toCharArray()){
        if(this.nivelTinta > 0){
        this.nivelTinta --;
        System.out.println(this.nivelTinta);
        }
        break;
        }
    
    }
}


