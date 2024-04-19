import java.util.Scanner;

public class Ejemplo2_3 {
    public static void main(String[] args) {
        Scanner RH=new Scanner(System.in);
        float Altura,Base,Area;
        System.out.println("Introdusca la altura del rectangulo");
        Altura=RH.nextFloat();
        System.out.println("Introdusca la base del reectangulo");
        Base=RH.nextFloat();
        Area=(Altura*Base);
        System.out.println("El area del rectangulo es :"+Area);
    }
}
