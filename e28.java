class e28{
    public static void main(String[] args){
    Gato donGato = new Gato();
   // donGato.jugar();
    donGato.tirarCosas();
    donGato.comer();
        System.out.println("--------");
        Gato garfield = new Gato();
        garfield.comer();
    System.out.println("--------");
    }

}

class Gato extends Mascota{
    void tirarCosas(){
        System.out.println("Miau");
        super.jugar();  //Accede al metodo de su clase padre Mascota, ya que hereda lo que hacen todas las
                        // Mascotas
    }

  // Gato(String nombreGato){
       // super(nombreGato);
   //}


}

class Mascota {

String nombre;

        Mascota(String nombres){
            this.nombre = nombres;
        }

        Mascota(){ // En el segundo constructor ya no `puedo heredar un string
            System.out.println("Creando mascota");
        }


    void comer(){
        this.jugar(); //Referenciamos a algo de la misma clase en ese caso el metodo.
                      //Aqui se pone a jugar y luego come
        System.out.println("comiendo");
    }

    void jugar(){
        System.out.println("Jugando");
    }


}