public class Main {
    public static void main(String[] args) {

        int num1 = 4;
        int num2 = 5;
        int num3 = 6;
        int resultado = 0;

        System.out.println("Primera parte:");

        resultado = suma(num1, num2, num3);
        System.out.println("Resultado de suma " + resultado);

        System.out.println("Segunda parte:");
        Coche Mustang = new Coche();
        Mustang.incrementaNumPuertas();
        System.out.println("Numero de puertas " + Mustang.numeroPuertas);

    }

    public static int suma(int a, int b, int c){

        return a + b + c;
    }

}


class Coche{
    public int numeroPuertas = 0;

    public void incrementaNumPuertas(){
        this.numeroPuertas++;
    }
}
