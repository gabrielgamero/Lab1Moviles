package lab1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        int casoInt=0;
        do {

        System.out.println("¿Qué desea hacer? OPCIÓN 1: Verificar si el número es primo  ");
        System.out.println(" OPCIÓN (1): Verificar si el número es primo  ");
        System.out.println(" OPCIÓN (2): Obtener el MCD de dos números ");
        System.out.println(" OPCIÓN (3): Obtener la serie de fibonacci de n términos ");
        System.out.println(" OPCIÓN (4): Obtener el factorial de un número ");
        System.out.println(" Ingrese su opción numérica :  [1-4]");
        try {
            String caso = sc.nextLine();
            sc.close();
            casoInt = Integer.parseInt(caso);
            switch (casoInt){
                case 0: break;
                case 1:
                    System.out.println("Ingrese el número");
                    Scanner sc2 = new Scanner(System.in);
                    int num1=0;
                    try {
                        String caso2 = sc2.nextLine();
                        sc.close();
                        num1 = Integer.parseInt(caso2);}catch(NumberFormatException e){System.out.println("El parámetro ingresado no es un número");continue;}

                    esPrimo(num1);
                case 2:
                    MCD();
                    System.out.println(num1_a_f);
                case 3:
                    try {
                        Scanner sc3 = new Scanner(System.in);
                        System.out.println("Ingrese el número e términos de la serie fibonacci");
                        String caso3 = sc3.nextLine();
                        sc3.close();
                        num1 = Integer.parseInt(caso3);}catch(NumberFormatException e){System.out.println("El parámetro ingresado no es un número");continue;}
                    List <Integer> lista =FuncionFibonacci(num1);
                    Iterator iter = lista.iterator();
                    while (iter.hasNext())
                        System.out.print(iter.next());
                case 4:
                    try {
                        Scanner sc3 = new Scanner(System.in);
                        System.out.println("Ingrese el número e términos de la serie fibonacci");
                        String caso3 = sc3.nextLine();
                        sc3.close();
                        num1 = Integer.parseInt(caso3);}catch(NumberFormatException e){System.out.println("El parámetro ingresado no es un número");continue;}
                        int fact =factoriaL(num1);
                        System.out.println(fact);
                case 0:
                    break;




            }
        }catch (NumberFormatException e ){System.out.println("La opción ingresado no es un número, ingresarla correctamente");continue;}



        }while(casoInt!=0);
    }





    //DEFINICIÓN DE FUNCIONES
        static List <Integer> FuncionFibonacci(int num1)
        {

            try{
            List <Integer> fibo = new ArrayList<Integer>();

            int n1=0;
            int n2=1;
            int suma=1;


            for (int i=1; i <= num1; i++) {
                // muestro la suma
                fibo.add(suma);

                //primero sumamos
                suma = n1 + n2;
                //Despues, cambiamos la segunda variable por la primera
                n1 = n2;
                //Por ultimo, cambiamos la suma por la segunda variable
                n2 = suma;


            }

            return fibo;} catch (NumberFormatException e){System.out.println("El número ingresado no es correcto");}

        }

        static int factoriaL(int num1){

            try{
            int factorial=1;
            while ( num1!=0) {
                factorial=factorial*num1;
                num1--;
            }} catch (NumberFormatException e){System.out.println("Ingrese un número correcto");}
        }

        static void esPrimo(int num1){
        try {
            boolean flag1 = false;
            for (int i = 2; i <= num1 / 2; ++i) {
                // condition for nonprime number
                if (num1 % i == 0) {
                    flag1 = true;
                    break;
                }
            }

            if (!flag1)
                System.out.println("El primer numero " + num1 + " es numero primo.");
            else
                System.out.println("El primer numero " + num1 + " NO es numero primo.");
        }catch{System.out.println("El número ingresado no es correcto");}


    }


}
