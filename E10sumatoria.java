class E10sumatoria{
    public static int sumatoria(int[] suma){
        int valor = 0;
        for (int sum : suma) {
            valor= sum + valor;
        }
        
        return valor;
    }
    public static void main(String[] args){
    int[] valores = new int[3];
    valores[0] = 1;
    valores[1] = 1;
    valores[2] = 1;
    int funcion = sumatoria(valores);
    System.out.print(funcion);

    }
}

