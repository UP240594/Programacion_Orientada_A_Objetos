class e31Polimorfismo{
    public static void main(String[] args){
    Profesor profe = new Profesor();
    profe.saludar();   //Este buen dia chicos
    Persona p = new Persona();  //este dice buen dia
    }
}

class Persona5{
    void saludar(){
        System.out.println("Buen dia");
    }
}

class Profesor extends Persona5{
    void saludar(){
       //  System.out.println("Buen dia chicos");
        super.saludar(); //Llamamos al metodo de herencia de Persona5
    }
}

//es polimorfismo por que tenmos dos metodos que se llaman igual pero hacen cosas totalmente diferentes
