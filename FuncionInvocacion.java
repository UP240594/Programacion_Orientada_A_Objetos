class FuncionInvocacion{

    static void ImprimirSaludo(){
        System.out.print("Hola");
    }
    static String ObtenerSaludo(){
        return "Hola";
    }
    public static void main(String[] args){
         ImprimirSaludo();
         ObtenerSaludo();
         String saludo= ObtenerSaludo();
         System.out.print(saludo);


    }
}