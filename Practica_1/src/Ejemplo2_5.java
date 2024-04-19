import java.util.Scanner;
public class Ejemplo2_5 {
    public static void main(String[] args) {
        Scanner RH=new Scanner(System.in);
        float a,b,c;
        float Area,at,ar;
        System.out.println("Ingrese la altura del triangulo y rectangulo unidos");
        a=RH.nextFloat();
        System.out.println("Ingrese la base del triangulo y rectangulo");
        b=RH.nextFloat();
        System.out.println("Ingrese la altura del triangulo");
        c= RH.nextFloat();
        at=(b*(a-c))/2;
        System.out.println("El area del tiangulo es :"+at);
        ar=(b*a);
        System.out.println("El area del rectangulo es :"+ar);
        Area=at+ar;
        System.out.println("El area de la figura es :"+Area);
    }
}
