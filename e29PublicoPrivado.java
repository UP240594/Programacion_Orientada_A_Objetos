class App{
    public static void main(String[] args){
        Persona persona1 = new Persona();
        persona1.nombre = "Oli";
        if (persona1.setTelefono("123123213")){
            System.out.println("Datos actualizados");
        }else{
            System.out.println("Ingrese datos correctos");
        }

        Estudiante es1 = new Estudiante();
        es1.matricula = "up121";
        es1.nombre = "popo";
        es1.setTelefono("12312321");

        es1.prinNombre();
        es1.printTelefono();
    }
}

class Persona{
    public String nombre;
    protected String telefono;

    boolean setTelefono (String nweTelefono){
        //Validar 10 numeros
        if(nweTelefono.length() != 10){
            System.out.println("Debe tener 10 digitos");
            return false;
        }
        //Validar solo numeros
        if(!nweTelefono.matches("\\d+a")){
            System.out.println("Debe solo digitos");
            return false;
        }
        this.telefono =  nweTelefono; //Setter, es aquel en el cual tu defines lo que requiere que tiene
                                      //Es decir lo que requiere que tenga
        return  true;
    }

    //Getter (leer) ontener los datos
    String getTelefono(){
        return this.telefono;
    }

}

class Estudiante extends Persona{
    public String matricula;
    private int calif;

    void prinNombre(){
        System.out.println("Nombre: " + super.nombre);
    }

    void printTelefono(){
        System.out.println("el telefono es" + super.telefono);
    }
}