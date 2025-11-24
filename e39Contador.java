import java.util.Scanner;
class e39Contador{
    public static void main(String[] args){
    Contador c = new Contador();
    c.incremen();
    c.printNum();

    }
}

class Contador{
   private int numero;

    Contador(){
        this.numero = 0;
    }
    /*void contar(){
    this.numero++;
    } */
    void printNum(){
    System.out.println(this.numero);
    }

    public void incremen(){
        this.numero +=1;
    }
}