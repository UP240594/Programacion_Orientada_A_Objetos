import java.awt.font.TextHitInfo;

class e25animales{
    public static void main(String[] args){
        Animal perro = new Animal(30 , 40 , "Chihuahua" , "Chihuahua" , 1.20 , 30);
        Perros chikis = new Perros("Corto",100 , 50);
        chikis.nivelLadrido= 50;
        chikis.pelaje="Corto";
        chikis.nivelOlfato=100;
        chikis.ladrar("guau guau >:(");
    }
}

class Animal{
    int energia;
    int saciedad;
    String especie;
    String raza;
    double tamaño;
    float peso;

      Animal(int energia, int s , String especie, String r, double t, float p){
          this.energia = energia;
          this.saciedad = s;
          this.especie = especie;
          this.raza = r;
          this.tamaño = t;
          this.peso = p;

      }

        int comer(String tipoAlimento , float cantidad ){
            int nivelSaciedad = 0;
            return nivelSaciedad;
        }

        int descansar(int tiempo){
            int nivelEnergia = 0;
            return nivelEnergia;
        }

}

class Perros extends Animal{
    String pelaje;
    int nivelOlfato;
    int nivelLadrido;


        Perros(String p, int olfato , int ladrido){
            this.pelaje = p;
            this.nivelOlfato = olfato;
            this.nivelLadrido = ladrido;
        }
            void ladrar(String mensaje){

                if(this.nivelLadrido < 50){
                    for( this.nivelLadrido : mensaje.toCharArray()){
                        System.out.println(mensaje.toLowerCase());
                    }
                }else{
                    for(char palabra : mensaje.toCharArray()){
                        System.out.println(mensaje.toUpperCase());
                    }
                }
            }
}