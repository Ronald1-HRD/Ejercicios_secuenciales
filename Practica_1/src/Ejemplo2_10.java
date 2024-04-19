import java.util.Scanner;

public class Ejemplo2_10 {
    public static void main(String[] args) {
        Scanner RH=new Scanner(System.in);
        float CM;
        float pulgada=2.54F;
        float PG;
        System.out.println("Ingrese la cantidad de metros requerido");
        CM= RH.nextFloat();
        PG=(CM/pulgada);
        System.out.println("La cantidad de pulgadas es :"+PG);

    }
}
