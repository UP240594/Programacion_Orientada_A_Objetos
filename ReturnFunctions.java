class ReturnFunctions{
    public static int GetNo2(){
        System.out.print("Regresando 2");
        return 2;
    }
    
    
    public static int GetNo5(){
        System.out.print("Regresando 5");
        return 5;
    }
    public static void main(String[] args){
        GetNo2();
        int num_1=GetNo2();
    }
}
