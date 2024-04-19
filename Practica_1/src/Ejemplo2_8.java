import java.util.Scanner;

public class Ejemplo2_8 {
    public static void main(String[] args) {
        Scanner RH=new Scanner(System.in);
        float x1,x2;
        float y1,y2;
        float X,Y,D;
        System.out.println("Introdusca el primer cateto de la absisa");
        x1=RH.nextFloat();
        System.out.println("Introdusca el segundo cateto de la absisa");
        x2=RH.nextFloat();
        System.out.println("Introdusca el primer cateto ordenada");
        y1=RH.nextFloat();
        System.out.println("Introdusca el segundo cateto ordenada");
        y2=RH.nextFloat();
        X= x2-x1;
        System.out.println("El cateto de las absisas es :"+X);
        Y= y2-y1;
        System.out.println("El cateto de las ordenadas es :"+Y);
        D=(float) Math.sqrt(Math.pow(2,X)-Math.pow(2,Y));
        System.out.println("La distancia entre los puntos es :"+D);

    }
}
