class E9minMac{
    public static float minimo( float[] array){
         
     float minPotencia = array[0];
     for (float element : array){
        if(element < minPotencia){
            minPotencia = element;
        }
     }
return minPotencia;
    }

    public static float maximo( float[] array2){
         
     float max = array2[0];
     for (float element2 : array2){
        if(element2 > max){
            max = element2;
        }
     }
return max;
    }
    public static void main(String[] args){
        float[] numeros;
        numeros = new float[3];
        numeros[0] = 3.14f;
        numeros[1] = 8.91f;
        numeros[2] = 3.14f;
        float minElem;
        float maximo;
        float maximos = maximo(numeros);
        minElem = minimo (numeros);
        System.out.print(minElem);
        System.out.print(maximos);

    }
}