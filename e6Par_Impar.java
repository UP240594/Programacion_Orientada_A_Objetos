
class e6Par_Impar{

public static boolean esPar(int  Numero){

int residuo = Numero%2;
if(residuo == 0){

    return true;
}else{
    return  false;
}

}
public static void main(String[] args){

boolean numeroPar = esPar(10);

if(numeroPar == true){
    System.out.print("Es par");
} else {

    System.out.print("Es Impar");
}

}

}