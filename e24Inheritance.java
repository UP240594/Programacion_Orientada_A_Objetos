class e24Inheritance{
    public static void main(String[] args){
        Person1 alex = new Person1();
        alex.name="Alex";
        Room newRom = new Room(10,10,10); //Se puede decir que lo que esta entre parentesis es algo por degault
        newRom.height=10;
        newRom.width=10;
        newRom.large=10;
        newRom.door=3;
        newRom.window=1;
        newRom.enter(alex);
    }
}

class Space{
    float height;
    float large;
    float width;

     Space(float h, float l , float w){
         this.height=h;
         this.large=l;
         this.width=w;
     }

        void enter(Person1 p){

        }
        void leave(Person1 p){
            System.out.println(p.name);
        }
}

class Room extends Space{
    int door;
    int window;

        Room(float h, float l , float w){
            super(h,l,w); //llamamos a la clase padre (Space) para devolerle los mismos constructores
        }
}

class Person1{
    String name;
}