class E12IntroPoo {
  public static void main(String[] args) {
    Marker plumonRojo = new Marker();
    plumonRojo.nivelTinta = 50;
    plumonRojo.nombreColor = "Rojo";

    Marker plumonNegro = new Marker();
    plumonNegro.nivelTinta = 25;
    plumonNegro.nombreColor = "Negro";

    Marker plumonArcoiris = new Marker();
    plumonArcoiris.nivelTinta = 100;
    plumonArcoiris.nombreColor = "Arcoiris";

    Marker plumonAzul = new Marker();
    plumonAzul.nivelTinta = 30;
    plumonAzul.nombreColor = "Azul";

    Marker[] estuchePlumones = new Marker[4];
    estuchePlumones[0] = plumonRojo;
    estuchePlumones[1] = plumonNegro;
    estuchePlumones[2] = plumonArcoiris;
    estuchePlumones[3] = plumonAzul;
    System.out.print("El color del plumon es: " +);
  }
}