class e20AsistenciaUltimate{
    public static void main(String[] args){
        Alumno estudiante1 = new Alumno("Oli","UP234556");
        Asistencias lista = new Asistencias(3);
                lista.listaAsistencia[0] = estudiante1; //Se elije la lista y en la posicion scero se agrega el estudiante;
                lista.registrarAsistencia(true);

    }
}

class Alumno{
    String nombre;
    String matricula;
    boolean asistencia;

    Alumno(String pNombre , String pMatricula ){ //Constructor, cuando instanciemos un alumno esto lo correra

        this.nombre = pNombre;
        this.matricula = pMatricula;
        this.asistencia = false;

    }
}

class Asistencias{
    Alumno[] listaAsistencia;
    Asistencias(int numeroAlumnos){
        this.listaAsistencia = new Alumno[numeroAlumnos];
    }

    void registrarAsistencia(boolean asistio){
            for(Alumno alumno : this.listaAsistencia ){
                alumno.asistencia = asistio;
                System.out.println(alumno.nombre + alumno.matricula + alumno.asistencia);
            }
    }
}