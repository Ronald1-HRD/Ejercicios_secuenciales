import java.util.Scanner;

public class Ejemplo2_1 {
    public static void main(String[] args) {
        Scanner RH=new Scanner(System.in);
        int a,b,s;
        System.out.println("Introdusca el primer digito");
        a=RH.nextInt();
        System.out.println("Introdusca el segundo digito");
        b=RH.nextInt();
        s=a+b;
        System.out.println("El resultado de S es "+s);

    }
}
