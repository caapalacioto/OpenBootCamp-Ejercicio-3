public class main {
    public static void main(String[] args) {

        //Prueba Primera parte
        int prueba=suma(3,4,5);
        System.out.println("Resultado de la suma: "+ prueba);

        //Prueba Segunda parte
        Coche miCoche = new Coche();
        miCoche.aumentarNumeroDePuertas();
        int puertas=miCoche.numPuertas;
        System.out.println("Número de puertas: " + puertas);
    }

    public static int suma(int num1, int num2, int num3){
        int resultado = num1 + num2 + num3;
        return resultado;
    }

}

class Coche{
    public int numPuertas=4;
    public void aumentarNumeroDePuertas() {
        this.numPuertas++;
    }
}
