import java.util.Scanner;
public class Ejemplo2_2 {
    public static void main(String[] args) {
        Scanner RH=new Scanner(System.in);
        float c1,c2,c3,c4,s,p;
        System.out.println("Introdusca el primer resultado del examen 1");
        c1= RH.nextFloat();
        System.out.println("Introdusca el segundo resultado del examen 2");
        c2= RH.nextFloat();
        System.out.println("Introdusca el tercer resultado del examen 3");
        c3= RH.nextFloat();
        System.out.println("Introdusca el cuarto resultado del examen 4");
        c4= RH.nextFloat();
        s=(c1+c2+c3+c4);
        System.out.println("la suma de las 4 calificaciones es "+s);
        p=s/4;
        System.out.println("El resultado final de las 4 calificaciones es "+p);


    }

}
