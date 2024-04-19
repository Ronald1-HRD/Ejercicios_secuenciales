import java.util.Scanner;

public class Ejemplo2_9 {
    public static void main(String[] args) {
        Scanner RH=new Scanner(System.in);
        float HT,PH,SS;
        System.out.println("Introdusca las horas trabajadas");
        HT= RH.nextFloat();
        System.out.println("Introdusca el pago por hora");
        PH= RH.nextFloat();
        SS=HT*PH;
        System.out.println("El sueldo semanal de la persona es : "+SS);

    }
}
