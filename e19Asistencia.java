
class e19Asistencia{
    public static void main(String[] args){
        Student registro = new Student("Olivia" , "UP240594");
        registro.asistencia("Presente");
    }
}
class Student{
    String nombre;
    boolean asistencia;
    String matricula;
    String palabra;

    Student(String nom , String matricula){
        this.nombre = nom;
        this.matricula = matricula;
    }


    public void asistencia(String palabra){
        if(palabra.equals("Presente")){
            this.asistencia = true;
            Asistencia obtenerAsistencia = new Asistencia(this.asistencia , this.nombre , this.matricula);
        }else{
            this.asistencia = false;
            Asistencia obtenerAsistencia = new Asistencia(this.asistencia , this.nombre , this.matricula);
        }
    }
}

class Asistencia{
    Student[] listaAlumnos = new Student[3];
    Asistencia(boolean asistencia , String nombre , String matricula){
        Student estudiante = new Student(nombre, matricula);
        listaAlumnos[0] = estudiante;
        if(asistencia == true){
            System.out.println("El estudiante" + estudiante.nombre + estudiante.matricula + " si vino");
        }else{
            System.out.println("El estudiante"+ estudiante.nombre + estudiante.matricula + "no vino");
        }
    }
}

