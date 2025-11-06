
class Perro extends Animal {
    String pelaje;
    int nivelOlfato;
    int nivelLadrido;

    Perro(int nivelOlfato){
        this.nivelOlfato = nivelOlfato;
    }

    void ladrar(String  sonido) {
        System.out.println(sonido);
    }

    void serValiente(int cuantasScoobyG){
        super.comer( "ScoobyGalletas", 3);
        System.out.println("Scooby-dooby-doo");
    }

}