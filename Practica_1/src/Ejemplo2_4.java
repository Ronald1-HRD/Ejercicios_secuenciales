import java.util.Scanner;

public class Ejemplo2_4 {
    public static void main(String[] args) {
        Scanner RH=new Scanner(System.in);
        float R,AREA;
        float PI=3.1416f;
        System.out.println("Introdusca el  radio de la circunferencia");
        R=RH.nextFloat();
        AREA=(PI*R*R);
        System.out.println("El area de la circunferencia es:"+AREA);
    }
}
