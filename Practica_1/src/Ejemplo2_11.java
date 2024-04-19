import java.util.Scanner;

public class Ejemplo2_11 {
    public static void main(String[] args) {
        Scanner RH=new Scanner(System.in);
        float A,L,N,CM;
        float V,PAG;
        System.out.println("La altura de la alverca es:");
        A= RH.nextFloat();
        System.out.println("El largo de la alverca es :");
        L= RH.nextFloat();
        System.out.println("El ancho de la alverca es :");
        N= RH.nextFloat();
        System.out.println("El costo del metro cubica es :");
        CM= RH.nextFloat();
        V=(A*L*N);
        System.out.println("El volumen de la alverca es :"+V);
        PAG=V*CM;
        System.out.println("El pago a realizar por el consumo es :"+PAG);

    }
}
