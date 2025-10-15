class e7DosParams{

    public static float sumar(float a , float b){
        float operacion = a+b;
        return operacion;
    }
    public static void main(String [] args){
         float resultado = sumar(3,2);
         if(resultado == 0){
            System.out.print("Es cero");
         }
         if(resultado < 0){
            System.out.print("Es negativo");
         }
         if(resultado > 0){
            System.out.print("Es positivo");
         }
    }
}