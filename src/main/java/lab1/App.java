package lab1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese un primer numero: ");
            int num1 = Integer.parseInt(sc.nextLine());
            System.out.print("Ingrese un segundo numero: ");
            int num2 = Integer.parseInt(sc.nextLine());
            
            boolean flag1 = false;
            for(int i = 2; i <= num1/2; ++i)
            {
                // condition for nonprime number
                if(num1 % i == 0)
                {
                    flag1 = true;
                    break;
                }
            }

            if (!flag1)
                System.out.println("El primer numero " + num1 + " es numero primo.");
            else
                System.out.println("El primer numero " + num1 + " NO es numero primo.");

            //
            boolean flag2 = false;
            for(int i = 2; i <= num2/2; ++i)
            {
                // condition for nonprime number
                if(num2 % i == 0)
                {
                    flag2 = true;
                    break;
                }
            }

            if (!flag2)
                System.out.println("El segundo numero " + num2 + " es numero primo.");
            else
                System.out.println("El segundo numero " + num2 + " NO es numero primo.");
            
        } catch (NumberFormatException e){
            System.out.println("Debe ingresar un numero");
        } finally {
            System.out.println("Continuando con el programa...");
        }
    }
}
