class e21AlumnoAsiento{
    public static void main(String args[]){
        Alumno2 alumno = new Alumno2("Oli","UP420594");
        Alumno2 alumo2 = new Alumno2("Alan","UP420ss4");
    }
}

class Alumno2{
String nombre;
String matricula;

    Alumno2(String nombre, String matricula){
        this.nombre = nombre;
        this.matricula = matricula;
    }
}

class Aula{
    int numero;
    Asiento[] asientos;
    int lugares;
        Aula(int numero){
            this.numero = numero;
        }

        void asientosDispoibles(int disponible){
            this.asientos = new Asiento[disponible];
        }


    int entrar(Alumno persona){

            return 1;
    }

    int salir (Alumno persona){
            return 0;
    }

    void mostrarOcupados(){

    }

}

class Asiento{
    boolean diestro;
    Alumno ocupante;
    boolean ocupado;
     Asiento( boolean ocupado , Alumno ocupante , boolean diestro){
         this.diestro = diestro;
         this.ocupado = ocupado;
         this.ocupante = ocupante;
     }

}