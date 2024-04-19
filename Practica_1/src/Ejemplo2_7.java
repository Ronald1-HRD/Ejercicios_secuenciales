import java.util.Scanner;

public class Ejemplo2_7 {
    public static void main(String[] args) {
        Scanner RH=new Scanner(System.in);
        int L;
        float TG,GA;
        float PG=3.785f;
        L=RH.nextInt();
        TG=(L/PG);
        System.out.println("La cantidad de galones es :"+TG);
        GA=PG*TG;
        System.out.println("La ganancia por la entrega de leche es :"+GA);

    }
}
