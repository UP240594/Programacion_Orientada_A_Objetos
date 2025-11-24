import java.util.Scanner;
import java.lang.Exception;

class e35CelularCatch{
    public static void main(String[] args){
        short bateria=0;
        try{
            Celular2 c = new Celular2();
            c.nivelBateria = 0;
            Scanner x = new Scanner(System.in);
            System.out.println("Ingrese su nivel de bateria");
            bateria = x.nextShort();
            if(bateria < 0){
                System.out.println("No puedes tener valores negativos de bateria");
            }
            c.encender();


        }catch(Exception e){
            System.out.println(e);
        }


    }
}

class Celular2{
    short nivelBateria;
    boolean encendido;

    Celular2(){
        this.nivelBateria = 100;
    }
    void encender() throws Exception{
        if(this.nivelBateria > 0){
            System.out.println("Encendido");
            this.encendido = true;
        }else {
            throw new Exception("Sin bateria");
        }
    }

    void llamar(String contar){

    }
}