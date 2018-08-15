import com.sun.applet2.preloader.event.ApplicationExitEvent;
import javafx.application.Application;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double n1,n2, resultado;
        int n=0;
        String nombre;
        Scanner sc=new Scanner(System.in);
        System.out.println("¿Cómo te llamas?");
        nombre=sc.nextLine();
        System.out.println("BIENVENIDO, "+nombre);
            do {
                System.out.println("Selecciona una opción\n" +
                        "1-SUMA\n" +
                        "2-RESTA\n" +
                        "3-MULTIPLICACIÓN\n" +
                        "4-DIVISIÓN\n" +
                        "5-SALIR\n");
                n=sc.nextInt();
                switch(n){
                    case 1:{
                        System.out.println("Has seleccionado SUMA. \n Ingresa el primer número");
                        n1=sc.nextDouble();
                        System.out.println("Ingrese el segundo número");
                        n2=sc.nextDouble();
                        resultado=n1+n2;
                        System.out.println("El resultado es: "+resultado+"\n");
                    }break;
                    case 2:{
                        System.out.println("Has seleccionado RESTA. \n Ingresa el primer número");
                        n1=sc.nextDouble();
                        System.out.println("Ingrese el segundo número");
                        n2=sc.nextDouble();
                        resultado=n1-n2;
                        System.out.println("El resultado es: "+resultado+"\n");
                    }break;
                    case 3:{
                        System.out.println("Has seleccionado MULTIPLICACION. \n Ingresa el primer número");
                        n1=sc.nextDouble();
                        System.out.println("Ingrese el segundo número");
                        n2=sc.nextDouble();
                        resultado=n1*n2;
                        System.out.println("El resultado es: "+resultado+"\n");
                    }break;
                    case 4:{
                        System.out.println("Has seleccionado DIVISION. \n Ingresa el primer número (dividendo)");
                        n1=sc.nextDouble();
                        System.out.println("Ingrese el segundo número (Divisor)");
                        n2=sc.nextDouble();
                        if (n2!=0){
                            resultado=n1/n2;
                            System.out.println("El resultado es: "+resultado+"\n");
                        }else{
                            System.out.println("La division  por cero no esta definida\n");
                        }
                    }break;
                    case 5:{
                        System.exit(0);
                    }break;
                }


            }while(n!=5);
    }
}
