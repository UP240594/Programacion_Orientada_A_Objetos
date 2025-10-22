import java.util.ArrayList;
class practica1MiaFabricadora{
    public  static void main(String[] args){

    }
}

class Material{

    String nombre;
    String tipo;
    short precioUnitario;
    int   cantidadEnStock;
}

class Trabajador{

    String nombre;
    String especialidad;
    int    horasTrabajo;
    short  salarioPorHora;
}

class Proyecto{
    String nombreProyecto;
    short  presupuestoMaximo;
    ArrayList<Material> materiales;
    ArrayList<Trabajador> trabajadores;
}