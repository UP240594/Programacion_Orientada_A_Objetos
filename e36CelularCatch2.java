class e36CelularCatch2 {
    public static void main(String[] args) {
        Celular3 c1 = new Celular3();

        c1.nivelBAteria = 0;

        try {
            c1.encender();
        }
        catch(Exception ex) {
            System.out.println(ex);
        }

        try{
            c1.llamar("Mama");
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }
}

class Celular3 {
    short nivelBAteria;
    boolean encendido;

    Celular3() {
        this.nivelBAteria = 100;
        this.encendido = false;
        System.out.println("Creaste un celular");
    }

    void encender() throws Exception{
        if(this.nivelBAteria > 0) {
            this.encendido = true;
            System.out.println("Telefono encendido");
        }
        else {
            throw new Exception("Sin bateria");
        }
    }

    void llamar(String contacto) throws Exception{
        if(this.encendido == true) {
            System.out.println("Llamando a " + contacto);
        }
        else {
            throw new Exception("El telefono esta apagado");
        }
    }
}