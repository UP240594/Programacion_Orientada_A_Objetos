class e37Balon{
    public static void main(String[] args){
        Aire a = new Aire(33.3f , 50.4f , 33.3f );
        Balon b = new Balon(23 , 77 , "Circular" , (short)1004.3f , 44.5f );

       try{
           b.inflar(44);
       }catch(Exception e){
            System.out.println(e);
       }
    }
}

class Forma3d{
    float diametro;
    float volumen;
    String figura;

    Forma3d( float d , float v , String f ){
        this.diametro = d;
        this.volumen = v;
        this.figura = f;
    }

}

class Balon extends Forma3d {
    String marca;
    short tamaño;
    float contenidoMaximo;
    Aire contenido;
    Balon(float d , float v , String f , short tamaño , float contenidoMaximo ){
        super(d,v,f);

      this.tamaño = tamaño;
      this.contenidoMaximo = contenidoMaximo;
    }

    void inflar(float cantidad) throws Exception{

            for(float i = 0 ; i < cantidad ; i++){
                cantidad++;
                System.out.println(cantidad);
                if(cantidad > this.contenidoMaximo ) {
                    throw new Exception("Exploto");
                }

            }


    }
}

class Aire{
 float presion;
 float temperatura;
 float cantidadcm3; //Cantidad de centimetros cubicos;

    Aire(float presion , float temeratura , float canitdadcm3){
        this.presion = presion;
        this.temperatura = temperatura;
        this.cantidadcm3 = canitdadcm3;
    }
}