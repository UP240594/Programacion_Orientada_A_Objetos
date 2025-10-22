class e21AlumnoAsiento{
    public static void main(String args[]){
        Alumno2 alumno = new Alumno2("Oli","UP420594");
        Alumno2 alumno2 = new Alumno2("Alan","UP420ss4");
        Aula alumnosQueSalen = new Aula(4);
        System.out.println("El alumno" + alumnosQueSalen.entrar(alumno));
        alumnosQueSalen.salir(alumno.nombre);
    }
}

class Alumno2{
        Alumno nombre;
        String matricula;

    Alumno2(Alumno nombre, String matricula){
        this.nombre = nombre;
        this.matricula = matricula;
    }
}

class Asiento{
    boolean diestro;
    Alumno ocupante;
    boolean ocupado;
        Asiento( boolean diestros){
            this.diestro = diestros;
            this.ocupado = false;
        }

}


class Aula{
    String id;
    Asiento[] asientos;

        Aula(int numAsientos){
            this.asientos = new Asiento[numAsientos];
        }

            int entrar(Alumno persona){ //metodo
                int numAlumnos = 0;
                    for(Asiento asiento : this.asientos){
                        if(asiento.ocupante == persona){
                            asiento.ocupado = true;
                        }
                        if(asiento.ocupado){  //Esto significa si esto es igual a true, no es necesario poner el  ==true
                            numAlumnos++;
                        }
                }
                    return numAlumnos;
            }

        int salir (Alumno persona){
            int numAlumnosQueSalen = this.entrar(persona);
            for(Asiento asiento : this.asientos){
                if(asiento.ocupante == persona){
                    asiento.ocupado = false;
                }
                if(asiento.ocupado == false){
                    numAlumnosQueSalen--;
                }
            }
            return numAlumnosQueSalen;

        }

        void mostrarOcupados(Alumno persona){



        }

}

