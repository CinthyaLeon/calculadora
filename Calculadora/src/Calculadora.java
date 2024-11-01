import java.util.Scanner;
public class Calculadora {
    public static void main (String[]args){
        double valor1=0.0;
        double valor2=0.0;
        double suma=0.0;
        double resta=0.0;
        double multiplicacion=0.0;
        double division=0.0;
        int opcion=0;


        Scanner lectura = new Scanner (System.in);
        System.out.println("Ingrese el primer número");
        valor1= lectura.nextDouble();
        System.out.println("Ingrese el segundo número");
        valor2= lectura.nextDouble();
        System.out.println("Ingrese la operación que desee hacer");
        opcion= lectura.nextInt();
        switch (opcion){
            case 1:
                suma=valor1+valor2;
                System.out.println("El valor de la suma del número: "+ valor1 +" y "+ valor2 + " es: "+ suma );
                break;
            case 2:
                resta=valor1-valor2;
                System.out.println("El valor de la resta del número: "+ valor1 +" y "+ valor2 + " es: "+ resta);
                break;
            case 3:
                multiplicacion=valor1*valor2;
                System.out.println("El valor de la multiplicacion del número: "+ valor1 +" y "+ valor2 + " es: "+ multiplicacion);
                break;
            case 4:
                division=valor1/valor2;
                System.out.println("El valor de la division del número: "+ valor1 +" y "+ valor2 + " es: "+ division);
                break;
            default: {

                System.out.println("Opcion incorrecta");
            }
        }
    }
}
