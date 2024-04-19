import java.util.Scanner;
public class Ejemplo2_6 {
    public static void main(String[] args) {
        Scanner RH=new Scanner(System.in);
        float R,H;
        float PI=(3.1416f);
        float c,at,ac,AREA;
        System.out.println("Ingrese la base del triangulo rectangulo y radio");
        R=RH.nextFloat();
        System.out.println("Ingrese la hipotenusa del triangulo rectangulo");
        H= RH.nextFloat();
        c=(float) Math.sqrt(Math.pow(H,2)-Math.pow(R,2));
        System.out.println("El cateto faltante es :"+c);
        at= 2*(R*c)/2;
        System.out.println("El area del triangulo es :"+at);
        ac=(PI*R*R)/2;
        System.out.println("El area circular es :"+ac);
        AREA=at+ac;
        System.out.println("El area de la figura es :"+AREA);
    }
}
