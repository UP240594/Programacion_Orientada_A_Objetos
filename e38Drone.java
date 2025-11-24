import java.util.Objects;

class e38Drone{
    //Uso de palabra static
    public static void main(String[] args){
        Dron d1 = new Dron(10f , 10f,10f);
        Dron d2 = new Dron(5f , 5f,10f);
        Dron d3 = new Dron(-10f , -10f,10f);
        Dron d4 = new Dron(-5f , -5f,10f);
        Dron d5 = new Dron(0f , 0f,15f);

        System.out.println(d1.regresarABase);
        System.out.println(d2.regresarABase);
        System.out.println(d3.regresarABase);
        System.out.println(d4.regresarABase);
        System.out.println(d5.regresarABase);

        d3.regresarABase = true;

        System.out.println(d1.regresarABase);
        System.out.println(d2.regresarABase);
        System.out.println(d3.regresarABase);
        System.out.println(d4.regresarABase);
        System.out.println(d5.regresarABase);
/*
        Dron.regresarABase = false; //Esto es para mas general y cambia el valor de toda la clase

        System.out.println(d1.regresarABase);
        System.out.println(d2.regresarABase);
        System.out.println(d3.regresarABase);
        System.out.println(d4.regresarABase);
        System.out.println(d5.regresarABase); */

        d1.getRegresarABase();
    }
}

class Dron{
    static boolean regresarABase; //Este atributo esta a nivel general
                                  //Y esta compartido entre todos los atributos de esta clase
                                  // en este caso esta en default
    float lat;
    float lon;
    float alt;

    Dron(float lat, float lon , float alt){
        this.lat = lat;
        this.lon = lon;
        this.alt= alt;
    }

    static void getRegresarABase(){
        System.out.println(regresarABase);
    }

    void printlat(){
        System.out.println(this.lat);
    }
}