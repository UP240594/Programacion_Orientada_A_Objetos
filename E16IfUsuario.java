class E16IfUsuario{
   public static void main (String[] args){
    String correo = "ppp";
    String nombre = "popo";
    int edad = 12;
         Usuario gmail = new Usuario(correo , nombre , edad );
    }
   }   
class Usuario{
String nombre;
String gmails;
int edad;
  Usuario(String gmail , String nombres , int edades){  //Constructor
    this.gmails=gmail;
    this.nombre=nombres;
    this.edad=edades;
  }
}

