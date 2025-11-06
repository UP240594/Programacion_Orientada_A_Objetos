class Animal{
    int energia;
    int saciedad;
    String especie;
    String raza;
    float tamanio;
    float peso;

    Animal(){

    }

    int comer(String tipoAlimento , float cantidad){
        this.saciedad = (int)cantidad; //Casteo es convertir un float a un interger por ejemplo
        return this.saciedad;
    }
    int descansar(int tiempo) {
        this.energia = tiempo;
        return this.energia;
    }
}